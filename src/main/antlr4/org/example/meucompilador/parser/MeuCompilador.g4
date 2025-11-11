grammar MeuCompilador;

// INÍCIO DE TUDO
programa : comando* EOF;
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
tipo_var : 'inteiro' | 'real' | 'texto' ;
declaracao_var : tipo_var ID ('=' expressao)? ;

// ATRIBUIÇÃO DE VARIÁVEIS
atribuicao : ID '=' expressao ;

// BLOCO DE COMANDOS
bloco : comando* ;

//ESTRUTURAS DE CONTROLE E REPETIÇÃO

//ESTRUTURAS DE CONTROLE E REPETIÇÃO -> IF ELSE (Sintaxe: entao: e senao:)
se_senao_stmt
    : 'se' '(' expressao_booleana ')' 'entao:' bloco 'fimse'
    | 'se' '(' expressao_booleana ')' 'entao:' bloco 'senao:' bloco 'fimse'
    ;

// 2 - ESTRUTURAS DE CONTROLE E REPETIÇÃO -> WHILE (Sintaxe: enquanto (n>= 10) faca: <comando> fimenquanto)
enquanto_stmt
    : 'enquanto' '(' expressao_booleana ')' 'faca:' bloco 'fimenquanto'
    ;

// 3 - ESTRUTURAS DE CONTROLE E REPETIÇÃO -> FOR (Sintaxe: para i de 1 ate 10 faca: <comando> fimpara)
para_stmt
    : 'para' ID 'de' expressao 'ate' expressao ('passo' expressao)? 'faca:' bloco 'fimpara'
    ;

// EXPRESSÃO BOOLEANA
expressao_booleana
    : expressao ('<' | '>' | '==' | '!=' | '<=' | '>=') expressao ;

// REQUISITO: I/O (LEIA/ESCREVA)
leia_stmt : 'leia' '(' ID ')' ;
escreva_stmt : 'escreva' '(' expressao ')' ;

//EXPRESSÕES E PRECEDÊNCIA
expressao
    : expressao ('*' | '/') expressao
    | expressao ('+' | '-') expressao
    | '-' expressao
    | atomo
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

// MENOR PARTE - ÁTOMO
atomo
    : ID
    | NUMERO_INTEIRO
    | NUMERO_REAL
    | VALOR_TEXTO
    | '(' expressao ')'
    ;

// DEFINIÇÃO DOS TOKENS | REGEX DOS ATOMOS
ID           : [a-zA-Z] [a-zA-Z0-9]* ;
NUMERO_INTEIRO : [0-9]+ ;
NUMERO_REAL    : [0-9]+ '.' [0-9]+ ;
VALOR_TEXTO : '"' ~('"' | '\n' | '\r')* '"' ;
WS           : [ \t\r\n]+ -> skip ;