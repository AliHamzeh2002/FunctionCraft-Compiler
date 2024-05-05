package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.CircularDependency;
import main.visitor.Visitor;
import main.symbolTable.utils.Graph;

import java.util.ArrayList;
import java.util.List;

public class DependencyDetector extends Visitor<Void> {
    public ArrayList<CompileError> dependencyError = new ArrayList<>();
    private Graph dependencyGraph = new Graph();
    private String currentFunctionName;

    @Override
    public Void visit(Program program){
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            functionDeclaration.accept(this);
        }

        return null;
    }
    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        currentFunctionName = functionDeclaration.getFunctionName().getName();
        for (Statement stmt : functionDeclaration.getBody()) {
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(AccessExpression accessExpression) {
        accessExpression.getDimentionalAccess().forEach(e -> e.accept(this));
        if (!accessExpression.isFunctionCall()) {
            accessExpression.getAccessedExpression().accept(this);
            return null;
        }
        if (accessExpression.getAccessedExpression() instanceof Identifier) {
            dependencyGraph.addEdge(currentFunctionName, ((Identifier) accessExpression.getAccessedExpression()).getName());
            return null;
        }
        accessExpression.getAccessedExpression().accept(this);
        return null;
    }


    @Override
    public Void visit(AssignStatement assignStatement) {
        assignStatement.getAssignExpression().accept(this);
        if (assignStatement.isAccessList())
            assignStatement.getAccessListExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement) {
        if (returnStatement.hasRetExpression())
            returnStatement.getReturnExp().accept(this);
        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        expressionStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ForStatement forStatement) {
        for (var expr : forStatement.getRangeExpressions()){
            expr.accept(this);
        }
        for (var expr : forStatement.getLoopBodyExpressions()){
            expr.accept(this);
        }
        for (var stmt : forStatement.getLoopBody()){
            stmt.accept(this);
        }
        forStatement.getReturnStatement().accept(this);
        return null;
    }

    @Override
    public Void visit(LoopDoStatement loopDoStatement) {
        for (var expr : loopDoStatement.getLoopConditions()){
            expr.accept(this);
        }
        for (var stmt : loopDoStatement.getLoopBodyStmts()){
            stmt.accept(this);
        }
        loopDoStatement.getLoopRetStmt().accept(this);
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement) {
        for (var condition : ifStatement.getConditions()){
            condition.accept(this);
        }
        for (var stmt : ifStatement.getThenBody()){
            stmt.accept(this);
        }
        for (var stmt : ifStatement.getElseBody()){
            stmt.accept(this);
        }
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
    public Void visit(MatchPatternStatement matchPatternStatement){
        matchPatternStatement.getMatchArgument().accept(this);
        return null;
    }

    @Override
    public Void visit(PushStatement pushStatement) {
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return null;
    }

    @Override
    public Void visit(AppendExpression appendExpression){
        appendExpression.getAppendee().accept(this);
        appendExpression.getAppendeds().forEach(e -> e.accept(this));
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression){
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression){
        unaryExpression.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(LambdaExpression lambdaExpression){
        lambdaExpression.getBody().forEach(e -> e.accept(this));
        return null;
    }

    public Void findDependency(){
        List<List<String>> cycles = dependencyGraph.findCycles();
        for (List<String> cycle : cycles) {
            dependencyError.add(new CircularDependency(cycle));
        }

        return null;
    }

}
