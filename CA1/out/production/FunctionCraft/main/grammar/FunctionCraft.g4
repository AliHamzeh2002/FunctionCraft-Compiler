grammar FunctionCraft;

function_craft
	: (function | comment | pattern)* main comment*
	;

comment
	: SINGLE_LINE_COMMENT
	| MULTI_LINE_COMMENT
	;

main
	: DEF MAIN LPAR RPAR function_scope END
	;

pattern
	: PATTERN IDENTIFIER LPAR (IDENTIFIER ( COMMA IDENTIFIER)*)? RPAR (
		PATTERN_TOKEN condition ASSIGN expr
	)* SEMICOLON
	;

function_scope
	: (statement | if_structure | comment)* (return_statement)?
	;

return_statement
	: RETURN (expr)? SEMICOLON
	;

statement
	: (expr | assignment) SEMICOLON
	| for_loop
	| loop
	;

function
	: DEF IDENTIFIER LPAR function_args RPAR function_scope END
	;

function_args
	: (
		(IDENTIFIER COMMA)* (
			(
				LBRACKET (IDENTIFIER ASSIGN expr COMMA)* (
					IDENTIFIER ASSIGN expr
				) RBRACKET
			)?
			| (IDENTIFIER)
		)
	)
	;

lambda_function
	: ARROW LPAR function_args RPAR LBRACE function_scope RBRACE
	;

primitive_value
	: INT_VAL
	| FLOAT_VAL
	| STRING_VAL
	| TRUE
	| FALSE
	| lambda_function
	;

list
	: LBRACKET ((expr COMMA)* expr)? RBRACKET
	;

range
	: LPAR IDENTIFIER
	| INT_VAL DOUBLEDOT IDENTIFIER
	| INT_VAL RPAR
	;

if_structure
	: IF condition function_scope (
		ELSEIF condition function_scope
	)* (ELSE function_scope)? END
	;

if_structure_loop
	: IF condition loop_scope (ELSEIF condition loop_scope)* (
		ELSE loop_scope
	)? END
	;

condition:
	condition_or
	;

condition_or
	: LPAR condition_and RPAR condition_or_
	| condition_and
	;

condition_or_
	: OR LPAR condition_and RPAR condition_or_
	|
	;

condition_and
	: LPAR condition_other RPAR condition_and_
	| condition_other
	;

condition_and_
	: AND LPAR condition_other RPAR condition_and_
	|
	;

condition_other:
	LPAR expr RPAR
	;

loop
	: LOOP DO loop_scope END
	;

for_loop
	: FOR IDENTIFIER IN list
	| IDENTIFIER
	| range loop_scope END
	;

list_element
	: IDENTIFIER (LBRACKET expr RBRACKET)+
	;

assignment
	: (IDENTIFIER | list | list_element) (
		ASSIGN
		| ADD_ASSIGN
		| SUB_ASSIGN
		| MOD_ASSIGN
		| DIV_ASSIGN
		| MUL_ASSIGN
	) expr
	;

loop_scope
	: (
		statement
		| comment
		| if_structure_loop
		| break_if_statement
		| next_if_statement
	)* (return_statement | break_statement | next_statement)?
	;

break_statement
	: BREAK SEMICOLON
	;

next_statement
	: NEXT SEMICOLON
	;

next_if_statement
	: NEXT IF condition SEMICOLON
	;

break_if_statement
	: BREAK IF condition SEMICOLON
	;

function_ptr
	: METHOD LPAR COLON IDENTIFIER RPAR
	;

expr
	: expr_append
	;

expr_append
	: expr_or expr_append_
	;

expr_append_
	: APPEND expr_or expr_append_
	|
	;

expr_or
	: LPAR expr_and RPAR expr_or_
	| expr_and
	;

expr_or_
	: OR LPAR expr_and RPAR expr_or_
	|
	;

expr_and
	: LPAR expr_eq RPAR expr_and_
	| expr_eq
	;

expr_and_
	: AND expr_eq expr_and_
	;

expr_eq
	: expr_cmp expr_eq_
	;

expr_eq_
	: EQL expr_cmp expr_eq_
	| NEQ expr_cmp expr_eq_
	|
	;

expr_cmp
	: expr_add_sub expr_cmp_
	;

expr_cmp_
	: GTR expr_add_sub expr_cmp_
	| LES expr_add_sub expr_cmp_
	| GEQ expr_add_sub expr_cmp_
	| LEQ expr_add_sub expr_cmp_
	|
	;

expr_add_sub
	: expr_mul_div expr_add_sub_
	;

expr_add_sub_
	: PLUS expr_mul_div expr_add_sub_
	| MINUS expr_mul_div expr_add_sub_
	|
	;

expr_mul_div
	: expr_unary expr_mul_div_
	;

expr_mul_div_
	: MULT expr_unary expr_mul_div_
	| DIV expr_unary expr_mul_div_
	| MOD expr_unary expr_mul_div_
	|
	;

expr_unary
	: NOT expr_other
	| MINUS expr_other
	| expr_other
	;

expr_other
	: LPAR expr RPAR
	| list
	| (IDENTIFIER | list_element) (INC | DEC)?
	| function_call
	| primitive_function_call
	| primitive_value
	| matching
	| function_ptr
	;

function_call
	: IDENTIFIER LPAR (expr ( COMMA expr)*)? RPAR
	;

primitive_function_call
	: puts
	| push
	| len
	| chop
	| chomp
	;

matching
	: IDENTIFIER DOT MATCH LPAR (expr ( COMMA expr)*)? RPAR
	;

puts
	: PUTS LPAR expr RPAR
	;

push
	: PUSH LPAR expr COMMA expr RPAR
	;

len
	: LEN LPAR expr RPAR
	;

chop
	: CHOP LPAR expr RPAR
	;

chomp
	: CHOMP LPAR expr RPAR
	;

// Keywords
END
	: 'end'
	;

DEF
	: 'def'
	;

IF
	: 'if'
	;

ELSE
	: 'else'
	;

ELSEIF
	: 'elseif'
	;

TRUE
	: 'true'
	;

FALSE
	: 'false'
	;

CHOP
	: 'chop'
	;

CHOMP
	: 'chomp'
	;

PUSH
	: 'push'
	;

MAIN
	: 'main'
	;

RETURN
	: 'return'
	;

PUTS
	: 'puts'
	;

METHOD
	: 'method'
	;

LEN
	: 'len'
	;

PATTERN
	: 'pattern'
	;

MATCH
	: 'match'
	;

NEXT
	: 'next'
	;

BREAK
	: 'break'
	;

LOOP
	: 'loop'
	;

DO
	: 'do'
	;

FOR
	: 'for'
	;

IN
	: 'in'
	;

// Types

// INT : 'int' ;

// FLOAT : 'float' ;

// STRING : 'string' ;

// BOOLEAN : 'bool' ;

// LIST : 'list' ;

// FUNCPTR : 'fptr' ;

// Type Values

INT_VAL
	: [1-9][0-9]*
	| [0]
	;

FLOAT_VAL
	: INT_VAL '.' [0-9]+
	| '0.' [0-9]*
	;

STRING_VAL
	: '"' ('\\' ["\\] | ~["\\\r\n])* '"'
	;

// Parenthesis

LPAR
	: '('
	;

RPAR
	: ')'
	;

// Brackets

LBRACKET
	: '['
	;

RBRACKET
	: ']'
	;

// Arithmetic Operators

PLUS
	: '+'
	;

MINUS
	: '-'
	;

MULT
	: '*'
	;

DIV
	: '/'
	;

MOD
	: '%'
	;

// NEG : '-' ;

INC
	: '++'
	;

DEC
	: '--'
	;

// Relational Operators

GEQ
	: '>='
	;

LEQ
	: '<='
	;

GTR
	: '>'
	;

LES
	: '<'
	;

EQL
	: '=='
	;

NEQ
	: '!='
	;

// Logical Operators

AND
	: '&&'
	;

OR
	: '||'
	;

NOT
	: '!'
	;

// Assignments

ASSIGN
	: '='
	;

ADD_ASSIGN
	: '+='
	;

SUB_ASSIGN
	: '-='
	;

MUL_ASSIGN
	: '*='
	;

DIV_ASSIGN
	: '/='
	;

MOD_ASSIGN
	: '%='
	;

// Other Operators
APPEND
	: '<<'
	;

// Symbols

LBRACE
	: '{'
	;

RBRACE
	: '}'
	;

COMMA
	: ','
	;

DOT
	: '.'
	;

DOUBLEDOT
	: '..'
	;

COLON
	: ':'
	;

SEMICOLON
	: ';'
	;

QUESTION
	: '?'
	;

// Other

IDENTIFIER
	: [a-zA-Z_][a-zA-Z0-9_]*
	;

ARROW
	: '->'
	;

PATTERN_TOKEN
	: [\r][\n] ([\t] | '    ') '|'
	| [\n] ([\t] | '    ') '|'
	;

SINGLE_LINE_COMMENT
	: '#' ~[\r\n]* -> skip
	;

MULTI_LINE_COMMENT
	: '=begin' .*? '=end' -> skip
	;

WS
	: [ \t\r\n]+ -> skip
	;