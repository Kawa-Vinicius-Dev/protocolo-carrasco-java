package exercicios.fundamentos.exercicio003;

//3. Leia dois números e mostre soma, subtração, multiplicação e divisão.  ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        try(Scanner input = new Scanner(System.in)){

            System.out.println("======= SOMA, SUBTRAÇÃO, MULTIPLICAÇÃO E DIVISÃO =======");

            int a, b;

            System.out.println("Digite o primeiro valor: ");

            a = input.nextInt();

            System.out.println("Digite o segundo valor: ");

            b = input.nextInt();

            System.out.println("SOMA = " + (a + b));

            System.out.println("SUBTRAÇÃO = " + (a - b));

            System.out.println("MULTIPLICAÇÃO = " + (a * b));

            System.out.println("DIVISÃO = " + (a / b));

        }

    }
}