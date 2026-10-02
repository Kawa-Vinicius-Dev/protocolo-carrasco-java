package exercicios.m01_fundamentos.exercicio002;

//2. Leia dois números e mostre a soma.  ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner input = new Scanner (System.in)){
            System.out.println("====== Soma dois números ======");
            System.out.print("(1): ");
            int a = input.nextInt();
            System.out.print("(2): ");
            int b = input.nextInt();

            System.out.println("Soma = " + (a + b));
        }

    }
}