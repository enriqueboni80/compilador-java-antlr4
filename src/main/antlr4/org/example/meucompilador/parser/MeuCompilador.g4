grammar MeuCompilador; // Nome da Gramática deve ser igual ao nome do arquivo

// ----------------------------------------------------
// REGRA PRINCIPAL
// ----------------------------------------------------
programa : comando* EOF;

comando
    : declaracao_var ';'
    | atribuicao ';'
    | se_senao_stmt
    | enquanto_stmt
    | para_stmt
    | leia_stmt ';' // <-- AQUI ONDE ERAM AS REFERÊNCIAS
    | escreva_stmt ';' // <-- AQUI ONDE ERAM AS REFERÊNCIAS
    ;

// ----------------------------------------------------
// REQUISITO: TIPOS E DECLARAÇÃO (3 TIPOS)
// ----------------------------------------------------
tipo_var : 'inteiro' | 'real' | 'texto' ;

declaracao_var : tipo_var ID ('=' expressao)? ;

// ----------------------------------------------------
// REQUISITO: ATRIBUIÇÃO
// ----------------------------------------------------
atribuicao : ID '=' expressao ;

// ----------------------------------------------------
// BLOCO DE COMANDOS
// ----------------------------------------------------
bloco : comando* ;

// ----------------------------------------------------
// REQUISITO: ESTRUTURAS DE CONTROLE E REPETIÇÃO
// ----------------------------------------------------

// REQUISITO: IF ELSE (Sintaxe: entao: e senao:)
se_senao_stmt
    : 'se' '(' expressao_booleana ')' 'entao:' bloco 'fimse'
    | 'se' '(' expressao_booleana ')' 'entao:' bloco 'senao:' bloco 'fimse'
    ;

// REQUISITO: WHILE
enquanto_stmt
    : 'enquanto' '(' expressao_booleana ')' 'faca:' bloco 'fimenquanto'
    ;

// REQUISITO: FOR (A segunda estrutura de repetição)
para_stmt
    : 'para' ID 'de' expressao 'ate' expressao ('passo' expressao)? 'faca:' bloco 'fimpara'
    ;

// Expressão Booleana
expressao_booleana
    : expressao ('<' | '>' | '==' | '!=' | '<=' | '>=') expressao ;

// ----------------------------------------------------
// REQUISITO: I/O (LEIA/ESCREVA) <-- AS DEFINIÇÕES VOLTARAM AQUI
// ----------------------------------------------------
leia_stmt : 'leia' '(' ID ')' ; // <-- DEFINIÇÃO CORRETA
escreva_stmt : 'escreva' '(' expressao ')' ; // <-- DEFINIÇÃO CORRETA


// ----------------------------------------------------
// REQUISITO: EXPRESSÕES E PRECEDÊNCIA
// ----------------------------------------------------
expressao
    : expressao ('*' | '/') expressao // Precedência 2 (Multiplicação/Divisão)
    | expressao ('+' | '-') expressao // Precedência 1 (Soma/Subtração)
    | '-' expressao                 // Unário
    | atomo
    ;

atomo
    : ID
    | NUMERO_INTEIRO
    | NUMERO_REAL
    | VALOR_TEXTO
    | '(' expressao ')'
    ;

// ----------------------------------------------------
// TOKENS (LEXER) - CORREÇÃO UNIVERSAL APLICADA AQUI
// ----------------------------------------------------
ID           : [a-zA-Z] [a-zA-Z0-9]* ;
NUMERO_INTEIRO : [0-9]+ ;
NUMERO_REAL    : [0-9]+ '.' [0-9]+ ;

// CORREÇÃO: Usamos esta forma simples que não requer escapes complexos para barras invertidas.
// VALOR_TEXTO = Uma aspas, seguida de zero ou mais caracteres que NÃO sejam aspas de fechamento, seguida por aspas de fechamento.
VALOR_TEXTO : '"' ~('"' | '\n' | '\r')* '"' ;

// REQUISITO: Eliminar espaços em branco, tabs e enter
WS           : [ \t\r\n]+ -> skip ;