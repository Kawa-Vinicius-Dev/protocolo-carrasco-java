package exercicios.m01_fundamentos.exercicio018;

import java.util.InputMismatchException;
import java.util.Scanner;

//18. Verifique se um ano é bissexto.

public class Main {
    public static void main(String[] args) {
        executar18();
    }

    public static void executar18() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um ano: ");
            int ano = input.nextInt();
            String bissexto = isBissexto(ano) ? "Bissexto" : "Não é bissexto";
            System.out.println(bissexto);
        } catch (InputMismatchException ex) {
            System.out.println("Digite um ano valido!");
        }
    }
    public static boolean isBissexto(int ano) {
        return ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0;

    }
}