# 🧠 Projeto: Compilador - Linguagem "MeuCompilador"

Este projeto implementa um **compilador simples** desenvolvido com **ANTLR4**, capaz de interpretar e validar uma linguagem criada do zero — a **"MeuCompilador"**.  
A linguagem inclui **variáveis tipadas, estruturas condicionais, laços de repetição, operações matemáticas e comandos de entrada/saída**.

---

## 🧩 Sumário

1. [📘 Visão Geral](#-visão-geral)
2. [🧠 Estrutura da Linguagem](#-estrutura-da-linguagem)
3. [🧱 Compilação](#-compilação)
4. [💻 Execução do Projeto](#-execução-do-projeto)
5. [🧪 Exemplos de Teste](#-exemplos-de-teste)
6. [📂 Estrutura de Pastas](#-estrutura-de-pastas)
7. [🔗 Referência do Compilador ANTLR](#-referência-do-compilador-antlr)

---

## 📘 Visão Geral

O objetivo deste projeto é demonstrar os **conceitos fundamentais de construção de compiladores**, como:
- Definição de **gramática léxica e sintática**.
- **Análise léxica**, **parsing** e **geração de código intermediário**.
- Uso de **ANTLR4** para automatizar a geração de analisadores.

A linguagem “MeuCompilador” foi criada para ser **didática e expressiva**, permitindo que alunos e professores explorem:
- Tipagem básica (`inteiro`, `real`, `texto`).
- Estruturas de decisão (`se`, `senao`).
- Laços de repetição (`enquanto`, `para`).
- Operações aritméticas e lógicas.
- Comandos de **entrada/saída** (`leia`, `escreva`).

---

## 🧠 Estrutura da Linguagem

A linguagem **MeuCompilador** foi criada para demonstrar conceitos fundamentais de compiladores, como **análise léxica**, **análise sintática** e **interpretação de código**.  
Ela oferece suporte a **declarações de variáveis**, **operações aritméticas**, **estruturas condicionais**, **laços de repetição** e **comandos de entrada e saída**.

A gramática completa da linguagem está definida no arquivo:  
`src/main/antlr4/MeuCompilador.g4`

### 🔤 Tipos de Variáveis

A linguagem suporta três tipos de variáveis:

```antlr
tipo_var : 'inteiro' | 'real' | 'texto' ;

Exemplo:
inteiro a = 10;
real b = 2.5;
texto nome = "Enrique";
```
### 🧾 Declarações e Atribuições

```
inteiro x = 5;
x = x + 1;
```
### 🔁 Estruturas de Controle e Repetição
#### 🧠 Condicional se / senao
```
se (x > 10) entao:
    escreva("Maior que 10");
senao:
    escreva("Menor ou igual a 10");
fimse
```
#### 🔄 Laço enquanto

```
inteiro i = 0;

enquanto (i < 5) faca:
    escreva(i);
    i = i + 1;
fimenquanto
```
#### 🔂 Laço para
```
para i de 1 ate 10 passo 2 faca:
    escreva(i);
fimpara
```
### ⚙️ Estrutura Completa do Programa
```
inteiro contador = 0;

enquanto (contador < 3) faca:
    escreva("Contador: ");
    escreva(contador);
    contador = contador + 1;
fimenquanto

escreva("Fim da execução!");
```
---
## 🧱 Compilação

O projeto utiliza o **ANTLR4** para gerar automaticamente o analisador léxico e sintático da linguagem.  
Os arquivos gerados pelo ANTLR são salvos dentro do diretório:  
`target/generated-sources/antlr4`

### ⚙️ Requisitos

Antes de compilar, certifique-se de ter instalado:

- **Java 8+**
- **Apache Maven**
- **ANTLR 4 Plugin** (configurado no `pom.xml`)


### 🏗️ Etapas de Compilação

Para gerar e compilar o projeto, execute os comandos abaixo no terminal, dentro do diretório raiz do projeto:

```bash
mvn install
mvn compile
```
---
