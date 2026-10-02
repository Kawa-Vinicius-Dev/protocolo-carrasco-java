package exercicios.m01_fundamentos.exercicio003;

//3. Leia dois números e mostre soma, subtração, multiplicação e divisão.  ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        try(Scanner input = new Scanner(System.in)){

            System.out.println("======= SOMA, SUBTRAÇÃO, MULTIPLICAÇÃO E DIVISÃO =======");

            double a, b;

            System.out.println("Digite o primeiro valor: ");

            a = input.nextDouble();

            System.out.println("Digite o segundo valor: ");

            b = input.nextDouble();

            System.out.printf("SOMA = %.2f", (a + b));

            System.out.printf("\nSUBTRAÇÃO = %.2f", (a - b));

            System.out.printf("\nMULTIPLICAÇÃO = %.2f", (a * b));

            if(b == 0){
                System.out.print("\nNão é possível dividir por zero.");
            }else{
                System.out.printf("\nDIVISÃO = %.2f", (a / b));
            }
        }
    }
}