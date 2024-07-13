# FunctionCraft-Compiler
This is a compiler for the FunctionCraft programming language which is a language that is designed for the Programming Languages and Compilers course at the University of Tehran in the Spring of 2024. The compiler is written in Java and uses ANTLR4 for parsing and generating the Abstract Syntax Tree (AST). The compiler is able to generate the Java bytecode for the FunctionCraft language and run it on the JVM.

## FunctionCraft Language

The FunctionCraft language is a simple functional programming language. Here we provide a brief overview of the language. For more information, please refer to the [documentation](./Documentation.pdf). Also note that some of the features of the language are not implemented in the final phases for the sake of simplicity.

### Code Structure
Each FunctionCraft program consists of some pattern definitions and some function definitions, then the main function is defined. Here is an example of a FunctionCraft program:
```
def sum(a, b)
    return a + b;
end

pattern fib(n)
    | (n == 0) = 1
    | (n == 1) = 1
    | (n > 2) = fib (n-1) + fib (n-2)
;

=begin
This is a comment
=end

#This is also a comment

def main()
    a = 5;
    b = 6;
    c = sum(a, b);
    d = fib.match(5);
    return c + d;
end

```
### Functions
functions are defined using `def` keyword. At the end of each scope in this language, `end` keyword comes. functions can also have default values. Here is an example of a function definition:
```
def f(x, [y = 2])
    return x + y;
end
```

#### Lambda Functions
We can define lambda functions as well. Here is an example of a lambda function definition:
```
-> (x, y) {return x  + y}
```

#### Function Pointers
Function pointers are defined using the `method` keyword. Here is an example of a function pointer definition:
```
def f(x)
    return x + 1;
end

def main()
    f_ptr = method(:f);
    a = f_ptr(5);
    puts(a);
end
```

### Patterns
Patterns are defined using the `pattern` keyword. Patterns are used to match the value of a variable. Each case is separated by whitespace(tab or 4 spaces) + `|`. Here is an example of a pattern definition:
```
pattern fact(n)
    | (n == 0) = 1
    | (n > 0) = n * fact(n-1)
;
```

### Main Function
The main function is defined using the `def main()` keyword. The main function is the entry point of the program.

### Data Types
The FunctionCraft language is statically typed but the type of the variables is inferred by the compiler. The language supports the following data types:

```int, float, bool, string, list, fptr(function pointer).```

### If Statement
The if statement is like the one in C but each condition should be in parentheses. Here is an example of an if statement:
```
if (a == 5) && (b == 6)
    # do something
else 
    # do something else
end
```

### Loops

#### For Loop
The for loop is like the one in Python. Here are the examples of for loops:
```
for i in 0..10
    # do something
end

a = [1,2,3,4];
for i in a
    # do something
end
```

#### Do Loops
The do loop is like a while loop in C but with no conditions! We can use `break` and `next` keywords to control the flow of the program. Here is an example of a do loop:

```
loop do
    # do something
    if (...)
        break;
    end
end
```

### Default Functions

#### puts
The `puts` function is used to print the value of a variable. Here is an example of using the `puts` function:
```
def main()
    a = 5;
    puts(a);
end
```

#### push
The `push` function is used to append an element to a list or string. Here is an example of using the `push` function:
```
def main()
    a = [1,2,3];
    push(a, 4);
    puts(a);
end
```

#### len
The `len` function is used to get the length of a list or a string. Here is an example of using the `len` function:
```
def main()
    a = [1,2,3];
    b = len(a);
    puts(b);
end
```

#### chop
The `chop` function is used to remove the last element of a string. Here is an example of using the `chop` function:
```
def main()
    a = "Hello";
    chop(a);
    puts(a);
end
```

#### chomp
The `chomp` function is used to remove the newline characters from the string. Here is an example of using the `chomp` function:
```
def main()
    a = "Hello\n";
    chomp(a);
    puts(a);
end
```

## Phases 

### [Phase 1](./CA1): Lexical and Syntax Analysis
In this phase, we implemented the lexical and syntax analysis of the FunctionCraft language using ANTLR4. The output of this phase is the parse tree of the input program.

### [Phase 2](./CA2): Name Analysis
In this phase, we created the abstract syntax tree (AST) of the input program, then we implement the name analysis of the FunctionCraft language. The output of this phase is the compile time errors related to the name analysis. More information about the errors can be found in the project [description](./CA2/description.pdf) file.


### [Phase 3](./CA3): Type Analysis
In this phase, we implemented the type analysis of the FunctionCraft language. The output of this phase is the compile time errors related to the type analysis. More information about the errors can be found in the project [description](./CA3/description.pdf) file.

### [Phase 4](./CA4): Code Generation
In this phase, we used the jasmin library to generate the Java bytecode of the FunctionCraft language. The output of this phase is the Java bytecode of the input program that can be run on the JVM.

Note that for the simplicity of the project, we didn't implement these features of the FunctionCraft language:

1. Lambda function
2. elseif
3. two or multi-dimensional lists
4. empty lists
5. float type
6. pattern
7. append operator, push
8. chomp
9. break if, next if
10. for loop, range expression

## How to Use
In order to compile and run the FunctionCraft compiler, clone the repository and navigate to the [build](./build) directory. Then run the following commands:

```
java -jar FunctionCraft.jar PATH_TO_INPUT_FILE
```
Note that you need both `FunctionCraft.jar` and the utilities directory in the same directory. This command will compile and run the FunctionCraft program in the terminal. The compiled Java bytecode will be saved in the `codeGenOutput` directory.
