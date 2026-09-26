package exercicios.fundamentos.exercicio006;

//6. Converta Fahrenheit para Celsius. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    static void main() {

        try(Scanner input = new Scanner (System.in)){

            System.out.println("Digite Fahrenheit: ");

            float fahrenheit = input.nextFloat();

            float celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("Celsius: " + celsius);

        }

    }
}