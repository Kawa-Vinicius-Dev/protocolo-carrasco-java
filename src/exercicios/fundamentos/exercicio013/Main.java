package exercicios.fundamentos.exercicio013;

// Verifique qual de dois números é maior. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)) {

            Integer numero1 = input.nextInt();
            System.out.print("(1) - ");
            numero1 = input.nextInt();
            Integer numero2 = input.nextInt();
            System.out.println("(2) -");
            numero2 = input.nextInt();

            if (numero1 == numero2) {
                System.out.println("Números iguais! ");
            } else if (numero1 > numero2) {
                System.out.printf("(1) - 2.%n é maior que (2) - 2.%n" , numero1, numero2);
            }

        }

    }
}