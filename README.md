# Protocolo Carrasco — Java Backend Júnior

Esse repositório foi uma ideia. Eu estava estudando Spring Boot e vi a necessidade de voltar para aprender alguns conceitos. O objetivo é chegar preparado para o Spring Boot com fundamentos de Java, testes, SQL, JDBC e HTTP — sem framework e sem IA escrevendo código.

📄 **[Abrir a lista completa de exercícios (PDF)](./protocolo_carrasco_java_backend.pdf)** — 247 exercícios, cada um com o que fazer, exemplo e a pegadinha de entrevista.

---

## Regras

1. **IA não escreve código.** Só revisa depois de pronto e testado.
2. **Pronto =** compila, passa nos testes, está commitado aqui e eu explico em voz alta sem ler.
3. **Travou 60 min:** vejo a solução, apago meu código e refaço do zero no dia seguinte.
4. **Não pulo módulo.** Desafio que não cumpriu o critério é refeito.
5. **Revisão semanal:** 3 exercícios antigos refeitos do zero, sem olhar.
6. **SQL todo dia**, 40 min, em paralelo.

## Progresso

| Módulo | Exercícios | Status |
| --- | --- | --- |
| Fundamentos e lógica | 1–30 | ✅ feito |
| Correções dos bugs de 1–30 | C1–C10 | ✅ feito |
| Ferramentas: terminal, Git, Maven, stack trace, debugger | 31–41 | 🟡 em andamento |
| JUnit 5 | 42–51 | ⬜ |
| Strings e Arrays com TDD | 52–73 | ⬜ |
| POO (domínio de loja) + BigDecimal | 74–97 | ⬜ |
| Exceptions | 98–113 | ⬜ |
| Collections e Big-O | 114–138 | ⬜ |
| Generics, Enum e Date/Time | 139–153 | ⬜ |
| Lambda, Streams e Optional | 154–169 | ⬜ |
| Java Core, camadas e injeção de dependência | 170–189 | ⬜ |
| Mockito | 190–195 | ⬜ |
| Concorrência básica | 196–200 | ⬜ |
| Docker mínimo | 201–203 | ⬜ |
| JDBC | 204–214 | ⬜ |
| HTTP, REST e JSON (mini API sem Spring) | 215–224 | ⬜ |
| Projeto final | 225 | ⬜ |
| **Trilha paralela:** SQL com PostgreSQL | S1–S38 | ⬜ |
| **Trilha paralela:** treino de entrevista | E1–E4 | ⬜ |

Problemas resolvidos (LeetCode / HackerRank): **0 / 60**

## Estrutura

Dentro de `src/exercicios`, as pastas estão organizadas por módulo (`m01_fundamentos`, `m02_ferramentas`, ...). Dentro de cada módulo ficam os exercícios realizados do Protocolo Carrasco, um por pasta (`exercicio001`, `exercicio002`, ...).

Consultas SQL ficam em `sql/`, uma por arquivo, numeradas pelo exercício (`S17-group-by.sql`).

## Como compilar e rodar

Na raiz do repositório:

```bash
javac -d out src/exercicios/m01_fundamentos/exercicio030/Main.java
java -cp out exercicios.m01_fundamentos.exercicio030.Main
```

Para outro exercício, troque `m01_fundamentos/exercicio030` (e o pacote correspondente) pelo módulo e número desejados.

## Testes

Em breve, com Maven e JUnit 5 (exercícios 37 e 42).

## Stack

Java 21 · Maven · JUnit 5 · AssertJ · Mockito · PostgreSQL · JDBC · Jackson · Docker

## Critério para começar o Spring

Está no final do PDF. Só marco quando conseguir explicar cada item sem consultar.
