package exercicios.m01_fundamentos.exercicio012;

// Verifique se um número é par ou ímpar. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            System.out.println(parOuImpar(numero));

        }
    }
    public static String parOuImpar(int numero) {

        if (numero % 2 == 0) {
            return "Número par!";
        } else {
            return "Número impar";
        }
    }
}