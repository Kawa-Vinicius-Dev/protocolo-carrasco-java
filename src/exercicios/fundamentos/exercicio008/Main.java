package exercicios.fundamentos.exercicio008;

//8. Calcule a área de um círculo. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner input = new Scanner (System.in)){

            System.out.print("Digite o raio: ");

            double raio = input.nextDouble();

            double area = 2*Math.PI*raio*raio;

            System.out.printf("Area: %.2f", area);

        }

    }
}