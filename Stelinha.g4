grammar Stelinha;

inicio: PROGRAMA bloco FIM EOF #NInicio;
bloco: (comando)+ #NBloco;
comando: comandoLeitura | comandoEscrita | comandoAtrib | comandoDeclaracao | comandoCondicao | comandoEnquanto | comandoCondicao;
comandoLeitura: 'LER' ID FL #NLeitura;
comandoEscrita: 'IMPRIMIR' expressao FL #NEscrita;
comandoAtrib: ID RECEBE (termo | expressao) FL #NAtribuicao;
comandoDeclaracao: TIPO ID (RECEBE expressao)* FL #NDeclaracao;
comandoEnquanto: ENQUANTO expressao subBloco #NEnquanto;
comandoCondicao: ((SE AP expressao FP) | SENAO) subBloco #NCondicional;
subBloco: AC (comando)+ FC #NSubBloco;
expressao: (AP)* '!'* termo (FP)* ((OPBOL | OPREL | OPARIT) expressao)* #NExpressao;

termo: ID | NUM | CARAC | VERDADE | MENTIRA #NTermo;

PROGRAMA: 'programa';
FIM: 'fim';
TIPO: 'INTEIRO' | 'FLUTUANTE' | 'CARACTER' | 'BOOLEANO';
SE: 'SE';
SENAO: 'SENAO';
ENQUANTO: 'ENQUANTO';
PARA: 'PARA';
LER: 'LER';
IMPRIMIR: 'IMPRIMIR';
RETORNAR: 'RETORNAR';
FUNCAO: 'FUNCAO';
ID: LETRAMINUSCULA+(DIGITO | LETRA)*;
NUM: DIGITO+('.'DIGITO+)?;
CARAC: '"' ~('\r' | '\n' )* '"';
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