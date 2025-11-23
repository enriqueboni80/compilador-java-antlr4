grammar MeuCompilador;

// INÍCIO DE TUDO
programa : bloco EOF;
comando
    : declaracao_var ';'
    | atribuicao ';'
    | se_senao_stmt
    | enquanto_stmt
    | para_stmt
    | leia_stmt ';'
    | escreva_stmt ';'
    ;

// TIPOS DE VARIÁVEIS (3 TIPOS) E INSTANCIAMENTOS (OPCIONAL)
tipo_var : INTEIRO | REAL | TEXTO ; // CORRIGIDO: Uso dos tokens INTEIRO, REAL, TEXTO
declaracao_var : tipo_var ID ('=' expressao)? ;

// ATRIBUIÇÃO DE VARIÁVEIS
atribuicao : ID '=' expressao ;

// BLOCO DE COMANDOS
bloco : comando* ;

//ESTRUTURAS DE CONTROLE E REPETIÇÃO

//ESTRUTURAS DE CONTROLE E REPETIÇÃO -> IF ELSE (Sintaxe: entao: e senao:)
se_senao_stmt
    : SE '(' expressao_booleana ')' ENTAO ':' bloco
      ( SENAO ':' bloco )?
    FIMSE
    ;

// 2 - ESTRUTURAS DE CONTROLE E REPETIÇÃO -> WHILE (Sintaxe: enquanto (n>= 10) faca: <comando> fimenquanto)
enquanto_stmt
    : ENQUANTO '(' expressao_booleana ')' 'faca:' bloco FIMENQUANTO // CORRIGIDO: Uso dos tokens ENQUANTO e FIMENQUANTO
    ;

// 3 - ESTRUTURAS DE CONTROLE E REPETIÇÃO -> FOR (Sintaxe: para i de 1 ate 10 faca: <comando> fimpara)
para_stmt
    : PARA ID 'de' expressao ATE expressao (PASSO expressao)? 'faca:' bloco FIMPARA // CORRIGIDO: Uso dos tokens PARA, ATE, PASSO e FIMPARA
    ;

// EXPRESSÃO BOOLEANA
expressao_booleana
    : expressao ('<' | '>' | '==' | '!=' | '<=' | '>=') expressao ;

// REQUISITO: I/O (LEIA/ESCREVA)
leia_stmt : LEIA '(' ID ')' ; // CORRIGIDO: Uso do token LEIA
escreva_stmt : ESCREVA '(' expressao ')' ; // CORRIGIDO: Uso do token ESCREVA

//EXPRESSÕES E PRECEDÊNCIA
expressao
    : expressao ('*' | '/') expressao
    | expressao ('+' | '-') expressao
    | '-' expressao
    | atomo
    ;

// MENOR PARTE - ÁTOMO
atomo
    : ID
    | NUMERO_INTEIRO
    | NUMERO_REAL
    | VALOR_TEXTO
    | '(' expressao ')'
    ;

// PALAVRAS RESERVADAS
SE          : 'se' ;
SENAO       : 'senao' ;
ENTAO       : 'entao' ;
ENQUANTO    : 'enquanto' ;
PARA        : 'para' ;
ATE         : 'ate' ;
PASSO       : 'passo' ;
FIMSE       : 'fimse' ;
FIMPARA     : 'fimpara' ;
FIMENQUANTO : 'fimenquanto' ;
ESCREVA     : 'escreva' ;
LEIA        : 'leia' ;
INTEIRO     : 'inteiro' ;
REAL        : 'real' ;
TEXTO       : 'texto' ;


// COMENTÁRIOS (antes do WS)
COMENTARIO_LINHA
    : '//' ~[\r\n]* -> skip
    ;

COMENTARIO_BLOCO
    : '/*' .*? '*/' -> skip
    ;

// DEFINIÇÃO DOS TOKENS | REGEX DOS ATOMOS
ID           : [a-zA-Z] [a-zA-Z0-9]* ;
NUMERO_INTEIRO : [0-9]+ ;
NUMERO_REAL    : [0-9]+ '.' [0-9]+ ;
VALOR_TEXTO : '"' ~('"' | '\n' | '\r')* '"' ;
WS           : [ \t\r\n]+ -> skip ;