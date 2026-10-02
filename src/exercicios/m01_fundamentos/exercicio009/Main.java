package exercicios.m01_fundamentos.exercicio009;

//9. Calcule o perímetro de um retângulo. ■ ■ ■ ■ ■ ■

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Digite a altura: ");

            double altura = input.nextDouble();

            System.out.print("Digite a largura: ");

            double largura = input.nextDouble();
            double perimetro = (altura * 2) + largura * 2;

            System.out.printf("Perimetro: %.2f", perimetro);

        }
    }

}
