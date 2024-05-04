package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.FloatValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.PatternItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;

import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {
    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();

        //TODO: addFunctions,
        //Code handles duplicate function declarations by renaming and adding them to the symbol table.
        int duplicateFunctionId = 0;
        ArrayList<FunctionItem> functionItems = new ArrayList<>();
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
                functionItems.add(functionItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfFunction(functionDeclaration.getLine(),
                        functionDeclaration.getFunctionName().getName()));
                duplicateFunctionId += 1;
                String freshName = functionItem.getName() + "#" + String.valueOf(duplicateFunctionId);
                Identifier newId = functionDeclaration.getFunctionName();
                newId.setName(freshName);
                functionDeclaration.setFunctionName(newId);
                FunctionItem newItem = new FunctionItem(functionDeclaration);
                functionItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }

        //addPatterns
        int duplicatePatternId = 0;
        ArrayList<PatternItem> patternItems = new ArrayList<>();
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try {
                SymbolTable.root.put(patternItem);
                patternItems.add(patternItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfPattern(patternDeclaration.getLine(),
                        patternDeclaration.getPatternName().getName()));
                duplicatePatternId += 1;
                String freshName = patternItem.getName() + "#" + String.valueOf(duplicatePatternId);
                Identifier newId = patternDeclaration.getPatternName();
                newId.setName(freshName);
                patternDeclaration.setPatternName(newId);
                PatternItem newItem = new PatternItem(patternDeclaration);
                patternItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }

        //TODO:visitFunctions
        //Iterates over function declarations, assigns symbol tables, visits declarations, and manages symbol table stack.
        int visitingFunctionIndex = 0;
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = functionItems.get(visitingFunctionIndex);
            SymbolTable functionSymbolTable = new SymbolTable();
            functionItem.setFunctionSymbolTable(functionSymbolTable);
            SymbolTable.push(functionSymbolTable);
            functionDeclaration.accept(this);
            SymbolTable.pop();
            visitingFunctionIndex += 1;
        }

        //visitPatterns
        int visitingPatternIndex = 0;
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = patternItems.get(visitingPatternIndex);
            SymbolTable patternSymbolTable = new SymbolTable();
            patternItem.setPatternSymbolTable(patternSymbolTable);
            SymbolTable.push(patternSymbolTable);
            patternDeclaration.accept(this);
            SymbolTable.pop();
            visitingPatternIndex += 1;
        }

        //visitMain
        //SymbolTable.top.
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {
        for (VarDeclaration arg : funcDeclaration.getArgs()) {
            arg.accept(this);
        }
        for (Statement stmt : funcDeclaration.getBody()) {
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        if (varDeclaration.getDefaultVal() != null)
            varDeclaration.getDefaultVal().accept(this);
        try {
            SymbolTable.root.getItem(FunctionItem.START_KEY + varDeclaration.getName().getName());
            nameErrors.add(new IdenticalArgFunctionName(varDeclaration.getLine(), varDeclaration.getName().getName()));
        } catch (ItemNotFound e) {
        }
        try {
            SymbolTable.top.put(new VarItem(varDeclaration.getName()));
        } catch (ItemAlreadyExists e) {
        }
        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        expressionStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(AppendExpression appendExpression) {
        appendExpression.getAppendee().accept(this);
        for (Expression appended : appendExpression.getAppendeds()) {
            appended.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        unaryExpression.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(AccessExpression accessExpression){
        if (!accessExpression.isFunctionCall())
            accessExpression.getAccessedExpression().accept(this);
        for (var dimensionAccess : accessExpression.getDimentionalAccess()){
            dimensionAccess.accept(this);
        }
        if (!accessExpression.isFunctionCall())
            return null;
        ArrayList<VarDeclaration> functionArgs = null;
        if (accessExpression.getAccessedExpression() instanceof LambdaExpression){
            functionArgs = ((LambdaExpression) accessExpression.getAccessedExpression()).getDeclarationArgs();
        }
        else if(accessExpression.getAccessedExpression() instanceof Identifier) {
            try {
                var funcDeclaration = ((FunctionItem) SymbolTable.root
                        .getItem(FunctionItem.START_KEY
                                + ((Identifier) accessExpression.getAccessedExpression()).getName()))
                        .getFunctionDeclaration();
                functionArgs = funcDeclaration.getArgs();
            }
            catch (ItemNotFound e){
                nameErrors.add(new FunctionNotDeclared(accessExpression.getLine(), ((Identifier) accessExpression.getAccessedExpression()).getName()));
            }
        }
        for (var arg : accessExpression.getArguments()){
            arg.accept(this);
        }
        if (functionArgs == null)
            return null;
        int maxArgs = functionArgs.size();
        int minArgs = 0;
        for (var arg : functionArgs){
            if (arg.getDefaultVal() != null)
                break;
            minArgs += 1;
        }
        if (accessExpression.getArguments().size() < minArgs || accessExpression.getArguments().size() > maxArgs){
            nameErrors.add(new ArgMisMatch(accessExpression.getLine(), accessExpression.getAccessedExpression().toString()));
        }
        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement){
        if (returnStatement.hasRetExpression())
            returnStatement.getReturnExp().accept(this);
        return null;
    }

    @Override
    public Void visit(PutStatement putStatement){
        putStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(LenStatement lenStatement){
        lenStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(PushStatement pushStatement) {
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return null;
    }

    @Override
    public Void visit(ChopStatement chopStatement){
        chopStatement.getChopExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ChompStatement chompStatement){
        chompStatement.getChompExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(MatchPatternStatement matchPatternStatement) {
        Identifier id = matchPatternStatement.getPatternId();
        try {
            SymbolTable.root.getItem(PatternItem.START_KEY + id.getName());
        } catch (ItemNotFound e) {
            nameErrors.add(new PatternNotDeclared(matchPatternStatement.getLine(), id.getName()));
        }
        matchPatternStatement.getMatchArgument().accept(this);
        return null;
    }

    @Override
    public Void visit(AssignStatement assignStatement){
        Identifier id = assignStatement.getAssignedId();
        if (assignStatement.getAssignOperator() != AssignOperator.ASSIGN){
            try {
                SymbolTable.top.getItem(VarItem.START_KEY + id.getName());
            }
            catch (ItemNotFound e){
                nameErrors.add(new VariableNotDeclared(assignStatement.getLine(), id.getName()));
            }
        }
        else{
            try {
                SymbolTable.top.put(new VarItem(id));
            }
            catch (ItemAlreadyExists e){
            }
        }
        assignStatement.getAssignExpression().accept(this);
        if (assignStatement.isAccessList()){
            assignStatement.getAccessListExpression().accept(this);
        }
        return null;
    }
    @Override
    public Void visit(LambdaExpression lambdaExpression){
        for (var arg : lambdaExpression.getDeclarationArgs()) {
            arg.accept(this);
        }
        for (var stmt : lambdaExpression.getBody()) {
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ListValue listValue){
        for (var exp : listValue.getElements()){
            exp.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionPointer functionPointer){
        try {
            SymbolTable.root.getItem(FunctionItem.START_KEY + functionPointer.getId().getName());
        }
        catch (ItemNotFound e){
            nameErrors.add(new FunctionNotDeclared(functionPointer.getLine(), functionPointer.getId().getName()));
        }
        return null;
    }

    @Override
    public Void visit(Identifier identifier){
        try {
            SymbolTable.top.getItem(VarItem.START_KEY + identifier.getName());
        }
        catch (ItemNotFound e){
            nameErrors.add(new VariableNotDeclared(identifier.getLine(), identifier.getName()));
        }
        return null;
    }


    @Override
    public Void visit(PatternDeclaration patternDeclaration) {
        try{
            SymbolTable.root.getItem(PatternItem.START_KEY + patternDeclaration.getTargetVariable().getName());
            nameErrors.add(new IdenticalArgPatternName(patternDeclaration.getLine(), patternDeclaration.getPatternName().getName()));
        }
        catch (ItemNotFound e){
        }
        try{
            SymbolTable.top.put(new VarItem(patternDeclaration.getTargetVariable()));
        }
        catch (ItemAlreadyExists e){
        }
        for (Expression condition : patternDeclaration.getConditions()) {
            condition.accept(this);
        }
        for (Expression returnExp : patternDeclaration.getReturnExp()) {
            returnExp.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement) {
        for (Expression condition : ifStatement.getConditions()) {
            condition.accept(this);
        }
        var thenSymbolTable = new SymbolTable();
        SymbolTable.push(thenSymbolTable);
        for (Statement stmt : ifStatement.getThenBody()) {
            stmt.accept(this);
        }
        SymbolTable.pop();
        var elseSymbolTable = new SymbolTable();
        SymbolTable.push(elseSymbolTable);
        for (Statement stmt : ifStatement.getElseBody()) {
            stmt.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ForStatement forStatement) {
        var forSymbolTable = new SymbolTable();
        SymbolTable.push(forSymbolTable);
        Identifier id = forStatement.getIteratorId();
        try {
            SymbolTable.top.put(new VarItem(id));
        } catch (ItemAlreadyExists e) {
        }
        for (Expression rangeExp : forStatement.getRangeExpressions()) {
            rangeExp.accept(this);
        }
        for (Expression loopBodyExp : forStatement.getLoopBodyExpressions()) {
            loopBodyExp.accept(this);
        }
        for (Statement stmt : forStatement.getLoopBody()) {
            stmt.accept(this);
        }
        if (forStatement.getReturnStatement() != null)
            forStatement.getReturnStatement().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(LoopDoStatement loopDoStatement) {
        var loopDoSymbolTable = new SymbolTable();
        SymbolTable.push(loopDoSymbolTable);
        for (Statement stmt : loopDoStatement.getLoopBodyStmts()) {
            stmt.accept(this);
        }
        for (Expression condition : loopDoStatement.getLoopConditions()) {
            condition.accept(this);
        }
        if (loopDoStatement.getLoopRetStmt() != null)
            loopDoStatement.getLoopRetStmt().accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        for (Statement stmt : mainDeclaration.getBody()) {
            stmt.accept(this);
        }
        return null;
    }

}



