package exercicios.m01_fundamentos.exercicio021;

import java.util.InputMismatchException;
import java.util.Scanner;

//21. Calcule desconto de uma compra.

public class Main {
    public static void main(String[] args) {
        executar21();
    }

    public static void executar21() {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Digite o valor: ");
            double valor = input.nextDouble();

            System.out.print("Digite o valor do desconto: ");
            double desconto = input.nextDouble();

            System.out.printf(
                    "Desconto de: %.2f%nValor com desconto: %.2f",
                    calcularDesconto(valor, desconto),
                    valorComDesconto(valor, desconto)
            );

        } catch (InputMismatchException ex) {
            System.out.println("Digite um número válido!");

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double calcularPercentual(double desconto) {
        if (desconto < 0) {
            throw new IllegalArgumentException("Desconto invalido!");
        }
        return desconto / 100;
    }

    public static double calcularDesconto(double valor, double desconto) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor invalido!");
        }
        return valor * calcularPercentual(desconto);
    }

    public static double valorComDesconto(double valor, double desconto) {
        return valor - calcularDesconto(valor, desconto);
    }
}