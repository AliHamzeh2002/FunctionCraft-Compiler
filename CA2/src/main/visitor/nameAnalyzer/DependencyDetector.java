package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
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
    private final Graph dependencyGraph = new Graph();
    private String currentFunctionName;

    @Override
    public Void visit(Program program){
        program.getFunctionDeclarations().forEach(e -> e.accept(this));
        return null;
    }
    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        currentFunctionName = functionDeclaration.getFunctionName().getName();
        functionDeclaration.getArgs().forEach(e -> e.accept(this));
        functionDeclaration.getBody().forEach(e -> e.accept(this));
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
    public Void visit(VarDeclaration varDeclaration) {
        if (varDeclaration.getDefaultVal() != null)
            varDeclaration.getDefaultVal().accept(this);
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
        forStatement.getRangeExpressions().forEach(e -> e.accept(this));
        forStatement.getLoopBody().forEach(e -> e.accept(this));
        forStatement.getLoopBodyExpressions().forEach(e -> e.accept(this));
        forStatement.getReturnStatement().accept(this);
        return null;
    }

    @Override
    public Void visit(LoopDoStatement loopDoStatement) {
        loopDoStatement.getLoopConditions().forEach(e -> e.accept(this));
        loopDoStatement.getLoopBodyStmts().forEach(e -> e.accept(this));
        loopDoStatement.getLoopRetStmt().accept(this);
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement) {
        ifStatement.getConditions().forEach(e -> e.accept(this));
        ifStatement.getThenBody().forEach(e -> e.accept(this));
        ifStatement.getElseBody().forEach(e -> e.accept(this));
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
        cycles.forEach(e -> dependencyError.add(new CircularDependency(e)));
        return null;
    }

}
