package exercicios.m01_fundamentos.exercicio020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        executar20();
    }

    public static void executar20() {
        try (Scanner input = new Scanner(System.in)) {

            int a, b, c;
            System.out.print("Digite o primeiro valor: ");
            a = input.nextInt();
            System.out.print("Digite o segundo valor: ");
            b = input.nextInt();
            System.out.print("Digite o terceiro valor: ");
            c = input.nextInt();
            System.out.println(formaTriangulo(a, b, c));

        }
    }

    public static String formaTriangulo(int a, int b, int c) {
        boolean verificarTriangulo = a + b > c && a + c > b && b + c > a;
        if (!verificarTriangulo) {
            System.out.println("Não é um Triângulo. ");
        }
        if (a == b && a == c) {
            return "Triângulo equilátero";
        } else if (a == b || a == c || b == c) {
            return "Triângulo isósceles";
        } else {
            return "Triângulo escaleno";
        }
    }
}

