package main.ast.nodes.statement;

import main.ast.nodes.expression.Expression;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IfStatement extends Statement{
    private ArrayList<Expression> conditions = new ArrayList<>();
    private ArrayList<Statement> thenBody = new ArrayList<>();
    private ArrayList<Statement> elseBody = new ArrayList<>();

    private SymbolTable symbolTable;

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void addCondition(ArrayList<Expression> condition){this.conditions.addAll(condition);}
    public void setThenBody(ArrayList<Statement>thenBody){this.thenBody = thenBody;}
    public void setElseBody(ArrayList<Statement>elseBody){this.elseBody = elseBody;}
    public ArrayList<Expression> getConditions(){return this.conditions;}
    public ArrayList<Statement> getThenBody(){return this.thenBody;}
    public ArrayList<Statement> getElseBody(){return this.elseBody;}
    @Override
    public String toString(){return "IfStatement";}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
