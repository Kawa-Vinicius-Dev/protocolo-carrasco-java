package exercicios.fundamentos.exercicio017;

import java.util.Scanner;

//Classifique uma nota em aprovado, recuperação ou reprovado
public class Main {
    static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Digite sua nota: ");
            double nota = input.nextDouble();
            String resultadoNota = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado";
            System.out.println(resultadoNota);
        }
    }

}
