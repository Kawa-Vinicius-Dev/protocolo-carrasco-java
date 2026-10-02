package exercicios.m01_fundamentos.exercicio007;

//7. Calcule a área de um retângulo. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main{
    public static void main() {

        try(Scanner input = new Scanner (System.in)){

            System.out.println("Digite a altura: ");

            float altura = input.nextFloat();

            System.out.println("Digite a largura: ");

            float largura = input.nextFloat();

            float area = altura*largura;

            System.out.println("Area: " + area);

        }

    }
}