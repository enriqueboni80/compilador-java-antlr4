# 🧠 Linguagem "MeuCompilador"

Este projeto implementa uma **linguagem de programação própria** chamada **MeuCompilador**, criada utilizando **ANTLR4** e **Java**.  
O objetivo é demonstrar conceitos de **análise léxica, sintática e semântica**, além de permitir a execução de programas simples com estruturas de controle, variáveis e entrada/saída.

---

## 🗣️ Descrição da Linguagem

A linguagem **MeuCompilador** possui uma sintaxe semelhante a linguagens de alto nível, com palavras-chave em **português**.  
Ela suporta **declarações de variáveis**, **operações aritméticas**, **condicionais**, **loops**, **entrada e saída de dados**.

### ✅ Estrutura geral de um programa

```txt
inteiro x = 10;
real y = 5.5;
texto nome = "Enrique";

se (x > 5) entao:
    escreva("x é maior que 5")
senao:
    escreva("x é menor ou igual a 5")
fimse

enquanto (x < 15) faca:
    escreva(x)
    x = x + 1;
fimenquanto
