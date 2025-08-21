grammar QuenyaCodeLanguage;

program: 'yesta' statement* 'metta';

statement
    : declaration
    | assignment
    | input
    | print
    | ifStatement
    | whileStatement
    | doWhileStatement
    ;

declaration
    : type ID 'harya' expression SC
    ;

assignment
    : ID 'harya' expression SC
    ;

input
    : type ID 'tulta' '-' STRING '-' SC
    ;

print
    : 'tancë' '-' STRING '-' SC
    | 'tancë' '-' ID '=' SC
    ;

ifStatement
    : 'ná' 'sandë' condition AC statement* FC
      ('lá' 'sandë' AC statement* FC)?
    ;

whileStatement
    : 'úrië' 'sandë' condition AC statement* FC
    ;

doWhileStatement
    : 'carë' 'úrië' '<' statement* '>' 'úrië' 'sandë' condition SC
    ;

condition
    : expression relationalOp expression
    ;

expression
    : expression mathOp expression
    | INT
    | FLOAT
    | ID
    ;

mathOp
    : 'yo'     // +
    | 'nac'    // -
    | 'etya'   // /
    | 'húta'   // *
    ;

relationalOp
    : 'hauta'  // >
    | 'nanca'  // <
    | 've'     // ==
    | 'úvëa'   // !=
    | 'hauta' 've' // >=
    | 'nanca' 've' // <=
    ;

type
    : 'nórëa'  // int
    | 'lúmëa'  // float
    ;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' (~["\\\r\n] | '\\' . | [áéíóúãõâêôç])* '"';
WS: [ \t\r\n]+ -> skip;
SC: '::';
AC: '<';
FC: '>';