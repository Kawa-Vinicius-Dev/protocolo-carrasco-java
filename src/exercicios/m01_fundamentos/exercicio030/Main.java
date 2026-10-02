package exercicios.m01_fundamentos.exercicio030;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 30. Calcule a média de vários números até o usuário digitar 0.

public class Main {
    public static void main(String[] args) {

        List<Double> numeros = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {

            double numero;

            System.out.println("Digite os números (0 para encerrar):");

            do {
                System.out.print("Número: ");
                numero = input.nextDouble();

                if (numero != 0) {
                    numeros.add(numero);
                }

            } while (numero != 0);

            System.out.printf("Média: %.2f%n", media(numeros));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double media(List<Double> numeros) {

        if (numeros.isEmpty()) {
            throw new IllegalArgumentException(
                    "Nenhum número foi informado."
            );
        }

        double soma = 0;

        for (double numero : numeros) {
            soma += numero;
        }

        return soma / numeros.size();
    }
}