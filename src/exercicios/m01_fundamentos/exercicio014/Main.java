package exercicios.m01_fundamentos.exercicio014;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 14. Encontre o maior número de uma lista.

public class Main {
    public static void main(String[] args) {
        executar14();
    }

    public static void executar14() {
        try (Scanner input = new Scanner(System.in)) {

            List<Double> numeros = new ArrayList<>();

            System.out.print("Quantos números deseja informar? ");
            int quantidade = input.nextInt();

            if (quantidade <= 0) {
                throw new IllegalArgumentException(
                        "A quantidade deve ser maior que zero."
                );
            }

            for (int i = 0; i < quantidade; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                numeros.add(input.nextDouble());
            }

            System.out.println("Maior número: " + maiorNumero(numeros));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double maiorNumero(List<Double> numeros) {

        if (numeros.isEmpty()) {
            throw new IllegalArgumentException(
                    "A lista não pode estar vazia."
            );
        }

        double maior = numeros.get(0);

        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }

        return maior;
    }
}