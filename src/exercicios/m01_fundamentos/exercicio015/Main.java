package exercicios.m01_fundamentos.exercicio015;

import java.util.InputMismatchException;
import java.util.Scanner;

// 15. Verifique se uma pessoa pode votar.

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Digite sua idade: ");
            int idade = input.nextInt();

            System.out.println(podeVotar(idade));

        } catch (InputMismatchException e) {
            System.out.println("Digite uma idade válida!");
        }catch (IllegalArgumentException e) {
            System.out.println("Digite um número válido!");
        }
    }

    public static String podeVotar(int idade) {

        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida.");
        }

        if (idade >= 18) {
            return "Pode votar.";
        }

        return "Não pode votar.";
    }
}