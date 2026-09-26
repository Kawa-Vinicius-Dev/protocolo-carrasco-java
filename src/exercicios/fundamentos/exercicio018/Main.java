package exercicios.fundamentos.exercicio018;

import java.util.Scanner;
//18. Verifique se um ano é bissexto.
public class Main {
    static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um ano: ");
            int ano = input.nextInt();
            boolean bissexto = ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0;
            System.out.println(bissexto ? "Bissexto" : "Não é bissexto");
        }
    }
}