package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.type.*;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.item.*;
import main.visitor.Visitor;

import java.util.*;

public class TypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();

    private boolean has_multiple_types(ArrayList<Type> types){
        for (int i = 0; i < types.size(); i++){
            for (int j = i + 1; j < types.size(); j++){
                if (!types.get(i).sameType(types.get(j))){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Type visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
            } catch (ItemAlreadyExists ignored) {
            }
        }
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try {
                SymbolTable.root.put(patternItem);
            } catch (ItemAlreadyExists ignored) {
            }
        }
        program.getMain().accept(this);

        return null;
    }

    @Override
    public Type visit(FunctionDeclaration functionDeclaration) {
        SymbolTable.push(new SymbolTable());
        SymbolTable.pushReturnTypeStack();
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());
            ArrayList<Type> currentArgTypes = functionItem.getArgumentTypes();
            for (int i = 0; i < functionDeclaration.getArgs().size(); i++) {
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                if (i < currentArgTypes.size())
                    argItem.setType(currentArgTypes.get(i));
                else{
                    Type argType = functionDeclaration.getArgs().get(i).getDefaultVal().accept(this);
                    argItem.setType(argType);
                }
                try {
                    SymbolTable.top.put(argItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        } catch (ItemNotFound ignored) {
        }
        for (Statement statement : functionDeclaration.getBody())
            statement.accept(this);
        ArrayList<Type> returnTypes = SymbolTable.popReturnTypeStack();
        if (has_multiple_types(returnTypes)){
            typeErrors.add(new FunctionIncompatibleReturnTypes(functionDeclaration.getLine(), functionDeclaration.getFunctionName().getName()));
            SymbolTable.pop();
            return new NoType();
        }
        SymbolTable.pop();
        if (returnTypes.isEmpty()){
            return new NoType();
        }
        return returnTypes.get(0);
    }

    @Override
    public Type visit(PatternDeclaration patternDeclaration) {
        SymbolTable.push(new SymbolTable());
        Type returntype = new NoType();
        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    patternDeclaration.getPatternName().getName());
            VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
            varItem.setType(patternItem.getTargetVarType());
            try {
                SymbolTable.top.put(varItem);
            } catch (ItemAlreadyExists ignored) {
            }
            for (Expression expression : patternDeclaration.getConditions()) {
                if (!(expression.accept(this) instanceof BoolType)) {
                    typeErrors.add(new ConditionIsNotBool(expression.getLine()));
                    SymbolTable.pop();
                    return new NoType();
                }
            }
            ArrayList<Type> returnTypes = new ArrayList<>();
            for (Expression expression : patternDeclaration.getReturnExp()) {
                returnTypes.add(expression.accept(this));
            }
            if (has_multiple_types(returnTypes)){
                typeErrors.add(new PatternIncompatibleReturnTypes(patternDeclaration.getLine(), patternDeclaration.getPatternName().getName()));
                SymbolTable.pop();
                return new NoType();
            }
            if (returnTypes.isEmpty()){
                return new NoType();
            }
            returntype = returnTypes.get(0);
        } catch (ItemNotFound ignored) {
        }
        SymbolTable.pop();
        return returntype;
    }

    @Override
    public Type visit(MainDeclaration mainDeclaration) {
        for (var statement : mainDeclaration.getBody())
            statement.accept(this);
        return null;
    }

    @Override
    public Type visit(AccessExpression accessExpression) {
        if (accessExpression.isFunctionCall()) {
            Type calledType = accessExpression.getAccessedExpression().accept(this);
            String functionName = "";
            if (calledType instanceof FptrType) {
                functionName = ((FptrType) calledType).getFunctionName();
            }
            else if (accessExpression.getAccessedExpression() instanceof Identifier){
                functionName = ((Identifier) accessExpression.getAccessedExpression()).getName();
            }
            ArrayList<Type> argumentTypes = new ArrayList<>();
            for (Expression expression : accessExpression.getArguments()) {
                argumentTypes.add(expression.accept(this));
            }
            try {
                FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        functionName);
                functionItem.setArgumentTypes(argumentTypes);
                return functionItem.getFunctionDeclaration().accept(this);
            } catch (ItemNotFound ignored) {

            }
        } else {
            Type accessedType = accessExpression.getAccessedExpression().accept(this);
            if (!(accessedType instanceof StringType) && !(accessedType instanceof ListType)) {
                typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
                return new NoType();
            }
            for (Expression expression : accessExpression.getDimentionalAccess()) {
                Type expressionType = expression.accept(this);
                if (!(expressionType instanceof IntType)) {
                    typeErrors.add(new AccessIndexIsNotInt(accessExpression.getLine()));
                    return new NoType();
                }
            }
            if (accessedType instanceof StringType) {
                return new StringType();
            }
            return ((ListType) accessedType).getType();
        }
        return new NoType();
    }

    @Override
    public Type visit(ReturnStatement returnStatement) {
        if (!returnStatement.hasRetExpression()){
            return new NoType();
        }
        Type returnType = returnStatement.getReturnExp().accept(this);
        SymbolTable.addReturnType(returnType);
        return returnType;
    }

    @Override
    public Type visit(ExpressionStatement expressionStatement) {
        return expressionStatement.getExpression().accept(this);
    }

    @Override
    public Type visit(ForStatement forStatement) {
        SymbolTable.push(SymbolTable.top.copy());
        Type rangeType = forStatement.getRangeExpression().accept(this);
        VarItem varItem = new VarItem(forStatement.getIteratorId());
        varItem.setType(rangeType);
        try {
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExists ignored) {
        }

        for (Statement statement : forStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Type visit(IfStatement ifStatement) {
        SymbolTable.push(SymbolTable.top.copy());
        for (Expression expression : ifStatement.getConditions())
            if (!(expression.accept(this) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
        for (Statement statement : ifStatement.getThenBody())
            statement.accept(this);
        for (Statement statement : ifStatement.getElseBody())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }

    @Override
    public Type visit(LoopDoStatement loopDoStatement) {
        SymbolTable.push(SymbolTable.top.copy());
        for (Statement statement : loopDoStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }

    @Override
    public Type visit(AssignStatement assignStatement) {
        if (assignStatement.isAccessList()) {
            Type assignIdType = assignStatement.getAssignedId().accept(this);
            if (!(assignIdType instanceof ListType)) {
                typeErrors.add(new IsNotIndexable(assignStatement.getLine()));
                return new NoType();
            }
            Type accessListExpressionType = assignStatement.getAccessListExpression().accept(this);
            if (!(accessListExpressionType instanceof IntType)) {
                typeErrors.add(new AccessIndexIsNotInt(assignStatement.getLine()));
                return new NoType();
            }
            Type assignType = assignStatement.getAssignExpression().accept(this);
            if (!assignType.sameType(((ListType) assignIdType).getType())) {
                typeErrors.add(new ListElementsTypesMisMatch(assignStatement.getLine()));
                return new NoType();
            }
        } else {
            VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
            Type assignType = assignStatement.getAssignExpression().accept(this);
            newVarItem.setType(assignType);
            try {
                SymbolTable.top.put(newVarItem);
                return new NoType();
            } catch (ItemAlreadyExists ignored) {
            }
            try{
                VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + assignStatement.getAssignedId().getName());
                varItem.setType(assignType);
            } catch (ItemNotFound ignored) {
            }
        }
        return new NoType();
    }

    @Override
    public Type visit(BreakStatement breakStatement) {
        for (Expression expression : breakStatement.getConditions())
            if (!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }

    @Override
    public Type visit(NextStatement nextStatement) {
        for (Expression expression : nextStatement.getConditions())
            if (!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }

    @Override
    public Type visit(PushStatement pushStatement) {
        Type initialType = pushStatement.getInitial().accept(this);
        Type toBeAddedType = pushStatement.getToBeAdded().accept(this);
        if (!(initialType instanceof ListType) && !(initialType instanceof StringType)) {
            typeErrors.add(new IsNotPushedable(pushStatement.getLine()));
            return new NoType();
        }
        if (initialType instanceof ListType) {
            Type elementsType = ((ListType)initialType).getType();
            if (!(elementsType instanceof NoType) && !toBeAddedType.sameType(elementsType)) {
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
                return new NoType();
            }
            if (elementsType instanceof NoType && pushStatement.getInitial() instanceof Identifier){
                try {
                    VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + ((Identifier) pushStatement.getInitial()).getName());
                    varItem.setType(new ListType(toBeAddedType));
                }
                catch (ItemNotFound ignored) {
                }

            }
        } else {
            if (!(toBeAddedType instanceof StringType)) {
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
                return new NoType();
            }
        }
        return new NoType();
    }

    @Override
    public Type visit(PutStatement putStatement) {
        putStatement.getExpression().accept(this);
        return new NoType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        return new BoolType();
    }

    @Override
    public Type visit(IntValue intValue) {
        return new IntType();
    }

    @Override
    public Type visit(FloatValue floatValue) {
        return new FloatType();
    }

    @Override
    public Type visit(StringValue stringValue) {
        return new StringType();
    }

    @Override
    public Type visit(ListValue listValue) {
        if (listValue.getElements().isEmpty()) {
            return new ListType(new NoType());
        }
        ArrayList<Type> types = new ArrayList<>();
        for (Expression expression : listValue.getElements()) {
            types.add(expression.accept(this));
        }
        if (has_multiple_types(types)){
            typeErrors.add(new ListElementsTypesMisMatch(listValue.getLine()));
            return new NoType();
        }
        if (types.isEmpty()){
            return new ListType(new NoType());
        }
        return new ListType(types.get(0));
    }

    @Override
    public Type visit(FunctionPointer functionPointer) {
        return new FptrType(functionPointer.getId().getName());
    }

    @Override
    public Type visit(AppendExpression appendExpression) {
        Type appendeeType = appendExpression.getAppendee().accept(this);
        if (!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType)) {
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        }
        return appendeeType;
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Type firstOperandType = binaryExpression.getFirstOperand().accept(this);
        Type secondOperandType = binaryExpression.getSecondOperand().accept(this);
        BinaryOperator operator = binaryExpression.getOperator();

        if (!firstOperandType.sameType(secondOperandType)) {
            typeErrors.add(new NonSameOperands(binaryExpression.getLine(), operator));
            return new NoType();
        }

        if (operator.equals(BinaryOperator.PLUS) || operator.equals(BinaryOperator.MINUS)
                || operator.equals(BinaryOperator.MULT) || operator.equals(BinaryOperator.DIVIDE)) {
            if (firstOperandType instanceof IntType) {
                return new IntType();
            }
            if (firstOperandType instanceof FloatType) {
                return new FloatType();
            }
            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), operator.toString()));
        }

        if (operator.equals(BinaryOperator.GREATER_THAN) || operator.equals(BinaryOperator.LESS_THAN)
                || operator.equals(BinaryOperator.LESS_EQUAL_THAN) || operator.equals(BinaryOperator.GREATER_EQUAL_THAN)) {
            if ((firstOperandType instanceof IntType) || (firstOperandType instanceof FloatType)) {
                return new BoolType();
            }
            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), operator.toString()));
        }

        if (operator.equals(BinaryOperator.EQUAL) || operator.equals(BinaryOperator.NOT_EQUAL)) {
            if ((firstOperandType instanceof IntType) || (firstOperandType instanceof FloatType)) {
                return new BoolType();
            }
        }

        return new NoType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        Type expressionType = unaryExpression.getExpression().accept(this);
        UnaryOperator operator = unaryExpression.getOperator();
//        if (expressionType instanceof NoType) {
//            return new NoType();
//        }
        if (operator.equals(UnaryOperator.NOT)) {
            if (expressionType instanceof BoolType) {
                return new BoolType();
            }
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.toString()));
        }
        if (operator.equals(UnaryOperator.MINUS) || operator.equals(UnaryOperator.INC) || operator.equals(UnaryOperator.DEC)) {
            if (expressionType instanceof IntType) {
                return new IntType();
            }
            if (expressionType instanceof FloatType) {
                return new FloatType();
            }
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.toString()));
        }

        return new NoType();
    }

    @Override
    public Type visit(ChompStatement chompStatement) {
        if (!(chompStatement.getChompExpression().accept(this) instanceof StringType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chompStatement.getLine()));
            return new NoType();
        }

        return new StringType();
    }

    @Override
    public Type visit(ChopStatement chopStatement) {
        return new StringType();
    }

    @Override
    public Type visit(Identifier identifier) {
        try{
            VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + identifier.getName());
            return varItem.getType();
        } catch (ItemNotFound ignored) {
        }
        return new NoType();
    }

    @Override
    public Type visit(LenStatement lenStatement) {
        Type expressionType = lenStatement.getExpression().accept(this);
//        if (expressionType instanceof NoType) {
//            return new NoType();
//        }
        if (!(expressionType instanceof StringType) && !(expressionType instanceof ListType)) {
            typeErrors.add(new LenArgumentTypeMisMatch(lenStatement.getLine()));
            return new NoType();
        }

        return new IntType();
    }

    @Override
    public Type visit(MatchPatternStatement matchPatternStatement) {
        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    matchPatternStatement.getPatternId().getName());
            patternItem.setTargetVarType(matchPatternStatement.getMatchArgument().accept(this));
            return patternItem.getPatternDeclaration().accept(this);
        } catch (ItemNotFound ignored) {
        }
        return new NoType();
    }

    @Override
    public Type visit(RangeExpression rangeExpression) {
        RangeType rangeType = rangeExpression.getRangeType();

        if (rangeType.equals(RangeType.LIST)) {
            var listExpressions = rangeExpression.getRangeExpressions();
            if (listExpressions.isEmpty()) {
                return new NoType();
            }
            ArrayList<Type> types = new ArrayList<>();
            for (Expression expression : listExpressions) {
                types.add(expression.accept(this));
            }
            if (has_multiple_types(types)) {
                typeErrors.add(new ListElementsTypesMisMatch(rangeExpression.getLine()));
                return new NoType();
            }
            if (types.isEmpty()){
                return new NoType();
            }

            return types.get(0);
        }


        if (rangeType.equals(RangeType.IDENTIFIER)) {
            Type identifierType = rangeExpression.getRangeExpressions().get(0).accept(this);
            if (!(identifierType instanceof ListType) && !(identifierType instanceof StringType)) {
                typeErrors.add(new IsNotIterable(rangeExpression.getLine()));
                return new NoType();
            }
            return identifierType;
        }

        if (rangeType.equals(RangeType.DOUBLE_DOT)){
            Type startType = rangeExpression.getRangeExpressions().get(0).accept(this);
            Type endType = rangeExpression.getRangeExpressions().get(1).accept(this);
            if (!(startType instanceof IntType) || !(endType instanceof IntType)){
                typeErrors.add(new RangeValuesMisMatch(rangeExpression.getLine()));
                return new NoType();
            }
            return new IntType();
        }

        return new NoType();

    }
}

