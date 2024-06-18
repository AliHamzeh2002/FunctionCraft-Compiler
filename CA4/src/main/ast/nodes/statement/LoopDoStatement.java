package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class LoopDoStatement extends Statement{
    private ArrayList<Statement> loopBodyStmts = new ArrayList<>();

    private SymbolTable symbolTable;

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public LoopDoStatement(ArrayList<Statement>loopBodyStmts){
        this.loopBodyStmts = loopBodyStmts;
    }
    public void setLoopBodyStmts(ArrayList<Statement>loopBodyStmts){this.loopBodyStmts = loopBodyStmts;}

    public ArrayList<Statement> getLoopBodyStmts(){return this.loopBodyStmts;}

    @Override
    public String toString(){return "LoopDoStatement";}
    @Override
    public <T> T accept(IVisitor<T>visitor){return visitor.visit(this);}
}
