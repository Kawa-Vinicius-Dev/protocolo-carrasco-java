package exercicios.fundamentos.exercicio020;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("Digite o primeiro valor: ");
        a = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = input.nextInt();
        System.out.print("Digite o terceiro valor: ");
        c = input.nextInt();

        boolean triangulo = a + b > c && a + c > b && b + c > a;

        String tipo = triangulo ? a == b && a == c ? "Equilátero" : (a == b && a != c) || b == c && b != a ? "Isósceles" : "Escaleno" : "Não é um triangulo";

        System.out.println(tipo);

        input.close();
    }
}
