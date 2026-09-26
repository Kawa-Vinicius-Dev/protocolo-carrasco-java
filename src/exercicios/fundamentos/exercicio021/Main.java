package exercicios.fundamentos.exercicio021;

import java.util.Scanner;

//21. Calcule desconto de uma compra.
public class Main {
    static void main(String[] args) {

        int desconto = 15;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = input.nextDouble();
        System.out.println(valor - valor * desconto / 100);

    }
}
