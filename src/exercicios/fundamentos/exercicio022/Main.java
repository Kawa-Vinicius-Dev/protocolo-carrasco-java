package exercicios.fundamentos.exercicio022;

import java.util.Scanner;

//Calcule aumento salarial.
public class Main {
    static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
        double salario, novoSalario;
            System.out.println("Digite seu antigo salario: ");
            salario = input.nextDouble();
            System.out.println("Digite seu novo salario: ");
            novoSalario = input.nextDouble();
            System.out.println("aumento de salario = " + (novoSalario - salario));

        }
    }
}
