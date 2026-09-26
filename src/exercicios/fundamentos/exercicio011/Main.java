package exercicios.fundamentos.exercicio011;

//Verifique se um número é positivo, negativo ou zero. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner input = new Scanner (System.in)){
            System.out.print("Dígite um número: ");
            Integer x = input.nextInt();

            if(x > 0){
                System.out.println(x + " é positivo!");
            } else if (x < 0) {
                System.out.println(x + " é negativo!");
            }else{
                System.out.println(x + " é igual a zero!");
            }

        }

    }
}