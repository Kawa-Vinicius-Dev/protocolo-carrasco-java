package exercicios.fundamentos.exercicio015;

//15. Verifique se uma pessoa pode votar pela idade.

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        try(Scanner input = new Scanner (System.in)){

            System.out.print("Digite sua idade: ");

            byte idade = input.nextByte();
            String votar = idade >= 18 ? "pode votar! " : "Não pode votar!";
            System.out.println(votar);
        }

    }
}