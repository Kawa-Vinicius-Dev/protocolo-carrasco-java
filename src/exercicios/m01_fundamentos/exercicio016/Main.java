package exercicios.m01_fundamentos.exercicio016;

import java.util.Scanner;

//Verifique se uma pessoa pode dirigir pela idade.

public class Main {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)) {

            System.out.println("Digite sua idade:");
            byte idade = input.nextByte();
            System.out.println(podeDirigir(idade));
        }
    }
    public static String podeDirigir(byte idade){
        return idade >= 18 ? "Pode dirigir" : "Não pode dirigir";
    };
}
