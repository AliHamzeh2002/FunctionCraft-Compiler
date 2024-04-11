grammar FunctionCraft;

// Lexer rules
// The lexer rules define patterns for recognizing tokens like numbers, booleans, strings,
// comments, keywords, identifiers, and operators in the input text. These rules are used
// by the lexer to break the input into a token stream.

// TODO

// Parser rules
// The parser rules start with the program rule, which defines the overall structure of a
// valid program. They then specify how tokens can be combined to form declarations, control
// structures, expressions, assignments, function calls, and other constructs within a program.
// The parser rules collectively define the syntax of the language.

// TODO

// Keywords
END:       'end';
DEF:       'def';
IF:         'if';
ELSE:       'else';
ELSEIF:     'elseif';
TRUE:       'true';
FALSE:      'false';
CHOP:       'chop';
CHOMP:      'chomp';
PUSH:       'push';
MAIN:     'main';
RETURN:   'return';
PUTS:       'puts';
METHOD:     'method';
LEN:        'len';
PATTERN:     'patern';
MATCH:      'match';
NEXT:       'next';
BREAK:       'break';
LOOP:       'loop';
DO:         'do';
FOR:        'for';
IN:         'in';

// Types

INT:       'int';
FLOAT:     'float';
STRING:    'string';
BOOLEAN:   'bool';
LIST:      'list';
FUNCPTR:   'fptr';

// Type Values

ZERO:        '0';
INT_VAL:     [1-9][0-9]*;
FLOAT_VAL:   INT_VAL '.' [0-9]+ | '0.' [0-9]*;
STRING_VAL:  '"' ('\\' ["\\] | ~["\\\r\n])* '"';
BOOLEAN_VAL: 'true' | 'false';

// Parenthesis

LPAR: '(';
RPAR: ')';

// Brackets (array element access)

LBRACKET: '[';
RBRACKET: ']';

// Arithmetic Operators

PLUS:  '+';
MINUS: '-';
MULT:  '*';
DIV:   '/';
NEG:   '-';
INC:    '++';
DEC:    '--';

// Relational Operators

GEQ: '>=';
LEQ: '<=';
GTR: '>';
LES: '<';
EQL: '==';
NEQ: '!=';

// Logical Operators

AND: '&&';
OR:  '||';
NOT:  '!';

// Assignments

ASSIGN:     '=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';

// Other Operators
APPEND:     '<<';


// Symbols

LBRACE:    '{';
RBRACE:    '}';
COMMA:     ',';
DOT:       '.';
COLON:     ':';
SEMICOLON: ';';
QUESTION:  '?';

// Other

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
//PREDICATE:  [A-Z][a-zA-Z0-9_]*;
ARROW:      '->';
SINGLELINECOMMENT:    '#' ~[\r\n]* -> skip;
MULTILINECOMMENT:     '=begin' .*? '=end' -> skip;
WS:         [ \t\r\n]+ -> skip;