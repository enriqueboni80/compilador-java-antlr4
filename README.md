# 🧠 Projeto: "MeuCompilador"
#### Aluno: Enrique Santos Bonifácio Leite | RA: 32523421 | (Una Nov/2025)
Git do projeto: https://github.com/enriqueboni80/compilador-java-antlr4

Este projeto implementa um **compilador simples** desenvolvido com **ANTLR4**, capaz de interpretar e validar uma linguagem criada do zero — a **"MeuCompilador"**.  
A linguagem inclui **variáveis tipadas, estruturas condicionais, laços de repetição, operações matemáticas e comandos de entrada/saída**.

---

## 🧩 Sumário

1. [📘 Visão Geral](#-visão-geral)
2. [🧠 Estrutura da Linguagem](#-estrutura-da-linguagem)
3. [🧱 Compilação e Execução](#-compilação-e-execução)
4. [🧪 Exemplos de Teste](#-exemplos-de-teste)
5. [📂 Estrutura de Pastas](#-estrutura-de-pastas)
6. [🔗 Referência do Compilador ANTLR](#-referência-do-compilador-antlr)

---

## 📘 Visão Geral

O objetivo deste projeto é demonstrar os **conceitos fundamentais de construção de compiladores**, como:
- Definição de **gramática léxica e sintática**.
- **Análise léxica**, **parsing** e **geração de código intermediário**.
- Uso de **ANTLR4** para automatizar a geração de analisadores.

A linguagem “MeuCompilador” foi criada para ser **didática** e reforçar os conceitos da disciplina:
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


**'inteiro' | 'real' | 'texto' ;**


```
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
para i de 1 ate 10 faca:
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
### ⚙️ 🔤 Palavras Reservadas

A linguagem **MeuCompilador** define um conjunto de **palavras reservadas** que não podem ser utilizadas como identificadores (nomes de variáveis, funções, etc.).  
Essas palavras representam comandos, estruturas de controle e tipos de dados da linguagem.

* Todas as palavras reservadas são **sensíveis a minúsculas** (case-sensitive).  
  Por exemplo, `se` é válido, mas `SE` ou `Se` não são reconhecidos pela gramática.

| Categoria | Palavras Reservadas | Descrição |
|------------|----------------------|------------|
| **Tipos de Dados** | `inteiro`, `real`, `texto` | Definem o tipo da variável declarada. |
| **Entrada e Saída** | `leia`, `escreva` | Permitem interação com o usuário. |
| **Estruturas Condicionais** | `se`, `senao`, `entao`, `fimse` | Representam blocos condicionais (if/else). |
| **Estruturas de Repetição** | `enquanto`, `fimenquanto`, `para`, `ate`, `passo`, `fimpara` | Representam laços de repetição e controle de fluxo. |
---

## 🧪 Exemplos de Teste

### 🧩 Exemplo 1 — Operações básicas
```
inteiro a = 5;
inteiro b = 10;
inteiro c = a + b;
escreva(c);
```
### 🔁 Exemplo 2 — Estrutura de repetição
```
inteiro i = 0;
enquanto (i < 5) faca:
    escreva(i);
    i = i + 1;
fimenquanto
```
### Exemplo 3 — Estrutura condicional
```
inteiro x = 8;

se (x > 10) entao:
    escreva("Maior que 10");
senao:
    escreva("Menor ou igual a 10");
fimse
```
---
## 🧱 Compilação e Execução

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

```
mvn install
mvn compile
```
### 🏗️ Rodando os tests

Comando para executar os tests:

```
mvn test
```
---
### 📂 Estrutura de Pastas
```        
meucompilador/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── antlr4/org/example/meucompilador/parser/
│   │   │   └── MeuCompilador.g4          # Definição da gramática ANTLR
│   │   ├── generated-sources/            # Cópia dos arquivos gerados (somente para visualização)
│   │   └── java/
│   │       └── org/example/meucompilador/     # Código-fonte principal do compilador
│   └── test/
│       └── java/      
|           └──  TesteCompilador.java      # Códigos de teste e exemplos     
└── target/
    └── generated-sources/
        └── antlr4/                        # Arquivos Java gerados automaticamente pelo ANTLR
```
---
