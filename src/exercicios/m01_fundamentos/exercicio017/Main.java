package exercicios.m01_fundamentos.exercicio017;

import java.util.InputMismatchException;
import java.util.Scanner;

//Classifique uma nota em aprovado, recuperação ou reprovado

public class Main {
    public static void main(String[] args) {
        executar17();
    }
    public static String resultado(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Notas apenas de 0 á 10");
        }else{
            return nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado";

        }
    }
    public static void executar17() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite sua nota: ");

            double nota = input.nextDouble();

            System.out.println(resultado(nota));

        } catch (InputMismatchException e) {
            System.out.println("Digite uma nota válida.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
