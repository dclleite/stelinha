grammar Stelinha;

inicio: TIPO | SE | ENQUANTO | PARA | LER | IMPRIMIR;
TIPO: 'INTEIRO' | 'FLUTUANTE' | 'CARACTER' | 'BOOLEANO';
SE: 'SE';
SENAO: 'SENAO';
ENTAO: 'ENTAO';
ENQUANTO: 'ENQUANTO';
PARA: 'PARA';
LER: 'LER';
IMPRIMIR: 'IMPRIMIR';
RETORNAR: 'RETORNAR';
FUNCAO: 'FUNCAO';
ID: LETRAMINUSCULA+(DIGITO | LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
CARAC: '"' ~('\r' | '\n' )* '"' ;
VERDADE: 'VERDADE';
MENTIRA: 'MENTIRA';
RECEBE: '=';
OPARIT: '+' | '-' | '*' | '/' | '%';
OPREL: '==' | '<=' | '>=' | '<' | '>' | '!=';
OPBOL: 'E' | 'OU' | '!';
OPINCR: '++';
OPDECR: '--';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
FL: ';';
WS : [ \t\r\n]+ -> skip;
ErrorChar: . ;
fragment DIGITO: [0-9];
fragment LETRA: [a-zA-Z];
fragment LETRAMINUSCULA: [a-z];