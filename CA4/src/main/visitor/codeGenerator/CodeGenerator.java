package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.type.FptrType;
import main.ast.type.ListType;
import main.ast.type.NoType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.visitor.Visitor;
import main.visitor.type.TypeChecker;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter mainFile;
    private final TypeChecker typeChecker;
    private final Set<String> visited;
    private FunctionItem curFunction;
    private final HashMap<String, Integer> slots = new HashMap<>();

    private Stack<String> loopStartLabels = new Stack<>();
    private Stack<String> loopEndLabels = new Stack<>();
    private int curLabel = 0;

    public CodeGenerator(TypeChecker typeChecker){
        this.typeChecker = typeChecker;
        this.visited = typeChecker.visited;
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
    }
    private int slotOf(String var) {
        if (!slots.containsKey(var)) {
            slots.put(var, slots.size());
            return slots.size() - 1;
        }
        return slots.get(var);
    }
    public String getFreshLabel(){
        String fresh = "Label_" + curLabel;
        curLabel++;
        return fresh;
    }
    public String getType(Type element){
        String type = "";
        switch (element){
            case StringType stringType -> type += "Ljava/lang/String;";
            case IntType intType -> type += "I";
            case FptrType fptrType -> type += "LFptr;";
            case ListType listType -> type += "LList;";
            case BoolType boolType -> type += "Z";
            case null, default -> {
                type += "V";
            }
        }
        return type;
    }
    private void prepareOutputFolder(){
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e){
            // ignore
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException e){
            // ignore
        }
    }
    private void copyFile(String toBeCopied, String toBePasted){
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e){
            // ignore
        }
    }
    private void addCommand(String command){
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                mainFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                mainFile.write(command + "\n");
            else
                mainFile.write("\t\t" + command + "\n");
            mainFile.flush();
        } catch (IOException e){
            // ignore
        }
    }
    private void handleMainClass(){
        String commands = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 128
                .limit locals 128
                new Main
                invokespecial Main/<init>()V
                return
                .end method
                """;
        addCommand(commands);
    }

    @Override
    public String visit(Program program){
        String commands = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(commands);
        handleMainClass();

        for(String funcName : this.visited) {
            try {
                this.curFunction = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        funcName);
                this.curFunction.getFunctionDeclaration().accept(this);
            } catch(ItemNotFound ignored) {}
        }

        program.getMain().accept(this);
        return null;
    }
    @Override
    public String visit(FunctionDeclaration functionDeclaration){
        slots.clear();
        FunctionItem functionItem = null;
        try {
            functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + functionDeclaration.getFunctionName().getName());
            SymbolTable.push(functionItem.getFunctionSymbolTable());
        } catch (ItemNotFound e) {
        }

        //functionDeclaration.accept(typeChecker);

        String name = functionItem.getName();
        //funcsReturnType.put(name, returnType);
        Type returnType = functionItem.getReturnType();
        ArrayList<String> argsTypeSign = new ArrayList<String>();

        for (Type argType : functionItem.getArgumentTypes()) {
            argsTypeSign.add(getType(argType));
        }
        for (VarDeclaration arg : functionDeclaration.getArgs()) {
            slotOf(arg.getName().getName());
        }

        ArrayList<String> bodyStmts = new ArrayList<String>();
        for (var stmt : functionDeclaration.getBody())
            bodyStmts.add(stmt.accept(this));

        StringBuilder commands = new StringBuilder();
        commands.append(".method public static ");

        commands.append(name).append('(');
        for (String arg : argsTypeSign)
            commands.append(arg);

        commands.append(')')
                .append(getType(returnType))
                .append('\n')
                .append(".limit stack ")
                .append("128\n")
                .append(".limit locals ")
                .append("128\n");

        for (String stmt : bodyStmts)
            commands.append(stmt).append('\n');

        if (returnType == null &&
                !String.join(" ", commands.toString().split("\n")).endsWith("return"))
            commands.append("return\n");
        commands.append(".end method\n\n\n");

        for (var comm : commands.toString().split("\n"))
            addCommand(comm);

        addCommand("\n");
        SymbolTable.pop();
        return null;
}
    @Override
    public String visit(MainDeclaration mainDeclaration){
        slots.clear();

        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        addCommand(commands);
        commands = "";
        for (var statement : mainDeclaration.getBody()) {
            commands += statement.accept(this);
            commands += "\n";
        }
        commands += "return\n";
        commands += ".end method\n";

        addCommand(commands);
        return null;
    }
    public String visit(AccessExpression accessExpression){
        return "";
        /*if (accessExpression.isFunctionCall()) {
            Identifier functionName = (Identifier)accessExpression.getAccessedExpression();
            String args = ""; // TODO
            String returnType = ""; // TODO
            return "invokestatic Main/" + functionName.getName() + args + returnType + "\n";
        }
        else {
            // TODO
        }
        //TODO
        return null;*/
    }
    @Override
    public String visit(AssignStatement assignStatement){
        ArrayList<String> stmts = new ArrayList<>();
        Type typeR = assignStatement.getAssignExpression().accept(typeChecker);
//        isAssignment = true;

        int index = slotOf(((Identifier) assignStatement.getAssignedId()).getName());
        if (assignStatement.isAccessList()) {
            stmts.add("aload " + index);
            stmts.add(assignStatement.getAccessListExpression().accept(this));
            stmts.add(assignStatement.getAssignExpression().accept(this));
            if (typeR instanceof IntType || typeR instanceof BoolType)
                stmts.add("iastore");
            else
                stmts.add("aastore");
        }
        else {
            stmts.add(assignStatement.getAssignExpression().accept(this));
            if (typeR instanceof IntType || typeR instanceof BoolType)
                stmts.add("istore " + index);
            else
                stmts.add("astore " + index);
        }

        //isAssignment = false;
        return String.join("\n",stmts);
    }
    @Override
    public String visit(IfStatement ifStatement){
        ArrayList<String> stmts = new ArrayList<>();
        stmts.add(ifStatement.getConditions().get(0).accept(this));

        String thenL = getFreshLabel();
        String elseL = getFreshLabel();
        String exitL = getFreshLabel();

        stmts.add("ifeq" + " " + elseL);
        stmts.add(thenL + ":");
        for (var stmt : ifStatement.getThenBody())
            stmts.add(stmt.accept(this));

        stmts.add("goto " + exitL);
        stmts.add(elseL + ":");
        if (!ifStatement.getElseBody().isEmpty())
            for (var stmt : ifStatement.getElseBody())
                stmts.add(stmt.accept(this));

        stmts.add(exitL + ":");
        return String.join("\n",stmts);
    }

    @Override
    public String visit(PutStatement putStatement){
        ArrayList<String> stmts = new ArrayList<>();
        stmts.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        Type argType = putStatement.getExpression().accept(typeChecker);
        String commandsOfArg = putStatement.getExpression().accept(this);
        stmts.add(commandsOfArg);
        if (argType instanceof IntType)
            stmts.add("invokevirtual java/io/PrintStream/println(I)V");
        if (argType instanceof BoolType)
            stmts.add("invokevirtual java/io/PrintStream/println(Z)V");
        if (argType instanceof StringType)
            stmts.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        return String.join("\n", stmts);
    }

    @Override
    public String visit(ReturnStatement returnStatement){
        ArrayList<String> stmts = new ArrayList<>();
        if (!returnStatement.hasRetExpression()) {
            return "return";
        }
        Type type = returnStatement.getReturnExp().accept(typeChecker);
        stmts.add(returnStatement.getReturnExp().accept(this));
        if (type instanceof IntType) {
            //stmts.add("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            stmts.add("ireturn");
            return String.join("\n", stmts);
        }
//        else if (type instanceof BoolType)
//            stmts.add("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
        stmts.add("areturn");
        return String.join("\n", stmts);
    }

    @Override
    public String visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }

    @Override
    public String visit(BinaryExpression binaryExpression){
        ArrayList<String> stmts = new ArrayList<>();
        stmts.add(binaryExpression.getFirstOperand().accept(this));
        stmts.add(binaryExpression.getSecondOperand().accept(this));

        switch (binaryExpression.getOperator()) {
            case PLUS -> stmts.add("iadd");
            case MINUS -> stmts.add("isub");
            case MULT -> stmts.add("imul");
            case DIVIDE -> stmts.add("idiv");
            case EQUAL -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                stmts.add("if_icmpeq " + L1);
                stmts.add("ldc 0");
                stmts.add("goto " + exitL);
                stmts.add(L1 + ":");
                stmts.add("ldc 1");
                stmts.add(exitL + ":");
            }
            case NOT_EQUAL -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                stmts.add("if_icmpeq " + L1);
                stmts.add("ldc 1");
                stmts.add("goto " + exitL);
                stmts.add(L1 + ":");
                stmts.add("ldc 0");
                stmts.add(exitL + ":");
            }
            case GREATER_THAN -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                stmts.add("if_icmpgt " + L1);
                stmts.add("ldc 0");
                stmts.add("goto " + exitL);
                stmts.add(L1 + ":");
                stmts.add("ldc 1");
                stmts.add(exitL + ":");
            }
            case GREATER_EQUAL_THAN -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                stmts.add("if_icmpge " + L1);
                stmts.add("ldc 0");
                stmts.add("goto " + exitL);
                stmts.add(L1 + ":");
                stmts.add("ldc 1");
                stmts.add(exitL + ":");
            }
            case LESS_THAN -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                stmts.add("if_icmplt " + L1);
                stmts.add("ldc 0");
                stmts.add("goto " + exitL);
                stmts.add(L1 + ":");
                stmts.add("ldc 1");
                stmts.add(exitL + ":");
            }
            case LESS_EQUAL_THAN -> {
                String L1 = getFreshLabel();
                String exitL = getFreshLabel();
                stmts.add("if_icmple " + L1);
                stmts.add("ldc 0");
                stmts.add("goto " + exitL);
                stmts.add(L1 + ":");
                stmts.add("ldc 1");
                stmts.add(exitL + ":");
            }
            default -> {
            }
        }
        return String.join("\n", stmts);
    }

    @Override
    public String visit(UnaryExpression unaryExpression){
        ArrayList<String> stmts = new ArrayList<>();
        stmts.add(unaryExpression.getExpression().accept(this));
        switch (unaryExpression.getOperator()) {
            case MINUS -> {
                stmts.add("ineg");
            }
            case NOT -> {
                stmts.add("ldc 1");
                stmts.add("ixor");
            }
            case INC -> {
                stmts.add("ldc 1");
                stmts.add("iadd");
            }
            case DEC -> {
                stmts.add("ldc -1");
                stmts.add("iadd");
            }
        }
        return String.join("\n", stmts);
    }


    @Override
    public String visit(Identifier identifier){
        FunctionItem fsti = null;
        try {
            fsti = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + identifier.getName());
        } catch (ItemNotFound ignored) {
        }
        String command = "";
        if (fsti == null) {
            Type type = identifier.accept(typeChecker);
            String typeSign = "a";
            if (type instanceof IntType)
                typeSign = "i";
            command += typeSign + "load " + slotOf(identifier.getName());
//            if (type instanceof IntType)
//                command += "invokevirtual java/lang/Integer/intValue()I";
//            else if (type instanceof BoolType)
//                command += "invokevirtual java/lang/Boolean/booleanValue()Z";
        } else {
            command += "new Fptr\n" + "dup\n" + "aload_0\n" + "ldc \"" + identifier.getName() + "\"\n" +
                    "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        }
        return command;
    }

    @Override
    public String visit(LoopDoStatement loopDoStatement){
        ArrayList<String> stmts = new ArrayList<String>();

        String startL = getFreshLabel();
        String exitL = getFreshLabel();
        loopStartLabels.push(startL);
        loopEndLabels.push(exitL);
        stmts.add(startL + ":");

        for (Statement statement : loopDoStatement.getLoopBodyStmts())
            stmts.add(statement.accept(this));

        stmts.add("goto " + startL);
        stmts.add(exitL + ":");
        return String.join("\n",stmts);
    }
    @Override
    public String visit(BreakStatement breakStatement){
        ArrayList<String> stmts = new ArrayList<>();
        stmts.add("goto " + loopEndLabels.peek());
        loopEndLabels.pop();
        loopStartLabels.pop();
        return String.join("\n", stmts);
    }
    @Override
    public String visit(NextStatement nextStatement){
        ArrayList <String> stmts = new ArrayList<>();
        stmts.add("goto " + loopStartLabels.peek());
        return String.join("\n", stmts);
    }
    @Override
    public String visit(LenStatement lenStatement){
        Type type = lenStatement.getExpression().accept(typeChecker);
        ArrayList<String> stmts = new ArrayList<>();
        stmts.add(lenStatement.getExpression().accept(this));
        if (type instanceof StringType) {
            stmts.add("invokevirtual java/lang/String/length()I");
        }
        if (type instanceof ListType) {
            stmts.add("invokevirtual List/size()I");
        }
        return String.join("\n", stmts);
    }

    @Override
    public String visit(ChopStatement chopStatement){
        //check
        ArrayList<String> stmts = new ArrayList<>();

        stmts.add(chopStatement.getChopExpression().accept(this));
        stmts.add("invokevirtual java/lang/String/length()I");
        stmts.add("ldc -1");
        stmts.add("iadd");
        stmts.add(chopStatement.getChopExpression().accept(this));
        stmts.add("invokevirtual java/lang/StringBuilder/deleteCharAt(I)Ljava/lang/StringBuilder;");
        stmts.add("invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");

        return String.join("\n", stmts);
    }

    @Override
    public String visit(FunctionPointer functionPointer){
        FptrType fptr = (FptrType) functionPointer.accept(typeChecker);
        String commands = "";
        commands += "new Fptr\n";
        commands += "dup\n";
        commands += "aload_0\n";
        commands += "ldc " + "\"" + fptr.getFunctionName() + "\"\n";
        commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        return commands;
    }
    @Override
    public String visit(ListValue listValue){
        ArrayList<String> stmts = new ArrayList<>();
        stmts.add("new java/util/ArrayList");
        stmts.add("dup");
        stmts.add("invokespecial java/util/ArrayList/<init>()V");
        int tempvar = slotOf("");
        stmts.add("astore " + tempvar);
        stmts.add("new List");
        stmts.add("dup");
        stmts.add("aload " + tempvar);
        stmts.add("invokespecial List/<init>(Ljava/util/ArrayList;)V");
        for (Expression element : listValue.getElements()) {
            stmts.add("aload " + tempvar);
            stmts.add(element.accept(this));
            //cast to Integer
            stmts.add("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            stmts.add("invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z");
            stmts.add("pop");
        }
        return String.join("\n", stmts);
    }
    @Override
    public String visit(IntValue intValue){
        //use "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer" to convert to primitive
        return "ldc " + intValue.getIntVal(); //+ "\n"
               // + "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;";
    }
    @Override
    public String visit(BoolValue boolValue){
        //use "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean" to convert to primitive
        return "ldc " + (boolValue.getBool() ? "1" : "0") ;//+ "\n"
             //   + "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
    }
    @Override
    public String visit(StringValue stringValue){
        return "ldc "  + stringValue.getStr();
    }
}