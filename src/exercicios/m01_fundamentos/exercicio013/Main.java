package exercicios.m01_fundamentos.exercicio013;

// Verifique qual de dois números é maior. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Digite número 1: ");
            int numero1 = input.nextInt();
            System.out.print("Digite número 2: ");
            int numero2 = input.nextInt();
            System.out.println(numeroMaiorouMenor(numero1, numero2));
        }
    }

    public static String numeroMaiorouMenor(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1 + " é maior que " + numero2 + ".";
        } else if (numero2 > numero1) {
            return numero2 + " é maior que " + numero1 + ".";
        } else {
            return "Números iguais.";
        }
    }
}