# Protocolo Carrasco — Java Backend Júnior

Minha trilha de estudos para chegar pronto ao Spring Boot: Java de verdade, testes, SQL, JDBC e HTTP — sem framework e sem IA escrevendo código.

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
| Fundamentos e lógica | 1–30 | ✅ feito (com correções pendentes) |
| Correções dos bugs de 1–30 | C1–C10 | ⬜ |
| Ferramentas: terminal, Git, Maven, stack trace, debugger | 31–41 | ⬜ |
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

Cada módulo vira uma pasta com um projeto Maven próprio (código em `src/main/java`, testes em `src/test/java`). Rodar os testes de um módulo:

```bash
cd <modulo>
mvn test
```

Consultas SQL ficam em `sql/`, uma por arquivo, numeradas pelo exercício (`S17-group-by.sql`).

## Stack

Java 21 · Maven · JUnit 5 · AssertJ · Mockito · PostgreSQL · JDBC · Jackson · Docker

## Critério para começar o Spring

Está no final do PDF. Só marco quando conseguir explicar cada item sem consultar.
