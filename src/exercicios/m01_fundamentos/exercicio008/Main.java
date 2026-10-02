package exercicios.m01_fundamentos.exercicio008;

//8. Calcule a área de um círculo. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner input = new Scanner (System.in)){

            System.out.print("Digite o raio: ");

            double raio = input.nextDouble();

            double area = Math.PI * Math.pow(raio, 2);

            System.out.printf("Area: %.2f", area);

        }

    }
}