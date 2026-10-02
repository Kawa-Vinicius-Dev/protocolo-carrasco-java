package exercicios.m01_fundamentos.exercicio025;

import java.util.InputMismatchException;
import java.util.Scanner;

// 25. Crie um menu de operações usando switch.

public class Main {
    public static void main(String[] args) {
        executar25();
    }

    public static void executar25() {
        try (Scanner input = new Scanner(System.in)) {

            int selecao;

            do {
                selecaoMenu();
                selecao = input.nextInt();

                if (selecao == 0) {
                    System.out.println("Programa encerrado!");
                    break;
                }

                try {
                    if (selecao < 1 || selecao > 4) {
                        throw new IllegalArgumentException("Opção inválida!");
                    }

                    System.out.print("Digite o primeiro valor: ");
                    double a = input.nextDouble();

                    System.out.print("Digite o segundo valor: ");
                    double b = input.nextDouble();

                    System.out.println(
                            "Resultado: " + calculoOperacaoMenu(a, b, selecao)
                    );

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números.");
                    input.nextLine();
                }

            } while (true);
        }
    }

    public static void selecaoMenu() {
        System.out.println("""
                
                (1) - Somar
                (2) - Subtrair
                (3) - Multiplicar
                (4) - Dividir
                (0) - Sair
                """);

        System.out.print("Escolha uma opção: ");
    }

    public static double calculoOperacaoMenu(
            double a,
            double b,
            int selecaoMenu) {

        return switch (selecaoMenu) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;

            case 4 -> {
                if (b == 0) {
                    throw new IllegalArgumentException(
                            "Não é possível dividir por zero."
                    );
                }

                yield a / b;
            }

            default -> throw new IllegalArgumentException(
                    "Opção inválida!"
            );
        };
    }
}