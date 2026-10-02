package exercicios.m01_fundamentos.exercicio011;

//Verifique se um número é positivo, negativo ou zero. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner input = new Scanner (System.in)){
            System.out.print("Dígite um número: ");
            int x = input.nextInt();

            System.out.println(verificarNumero(x));
        }

    }
    public static String verificarNumero(int x){
        if(x > 0){
            return " é positivo!";
        } else if (x < 0) {
            return  " é negativo!";
        }else{
            return " é igual a zero!";
        }
    }
}