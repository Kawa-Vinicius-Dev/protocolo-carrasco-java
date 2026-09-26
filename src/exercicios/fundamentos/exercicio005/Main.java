package exercicios.fundamentos.exercicio005;

//5. Converta Celsius para Fahrenheit. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    static void main() {

        try(Scanner input = new Scanner (System.in)){
            System.out.println("Digite o valor de Celsius: ");

            float celsius = input.nextFloat();
            float fahrenheit = (float) (celsius * 1.8) + 32;

            System.out.println("Fahrenheit: " + fahrenheit);

        }

    }
}