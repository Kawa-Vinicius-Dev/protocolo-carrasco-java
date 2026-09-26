package exercicios.fundamentos.exercicio012;

// Verifique se um número é par ou ímpar. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    try(Scanner input = new Scanner (System.in)){

        System.out.print("Digite um número: ");
        Integer numero = input.nextInt();

        if(numero % 2 == 0 ){
            System.out.println("Número par!");
        }else{
            System.out.println("Número impar");
        }

    }

    }
}