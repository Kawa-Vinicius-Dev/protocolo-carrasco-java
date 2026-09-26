package exercicios.fundamentos.exercicio016;

import java.util.Scanner;

//Verifique se uma pessoa pode dirigir pela idade.
public class Main {
    static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)) {

            System.out.println("Digite sua idade:");
            byte idade = input.nextByte();
            String podeDirigir = idade >= 18 ? "Pode dirigir" : "Não pode dirigir";
            System.out.println(podeDirigir);
        }

    }
}
