package exercicios.fundamentos.exercicio010;

//10. Calcule salário líquido considerando salário bruto e desconto. ■ ■ ■ ■ ■ ■

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Digite seu salário:");
            double salarioBruto = input.nextDouble();

            System.out.print("Digite o desconto:");
            double desconto = input.nextDouble();
            double salarioLiquido = salarioBruto - desconto;

            System.out.println("Salário liquido = " + salarioLiquido);

        }
    }
}
