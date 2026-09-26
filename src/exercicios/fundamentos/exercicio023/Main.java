package exercicios.fundamentos.exercicio023;

import java.util.Scanner;

//23. Faça uma calculadora usando switch.
public class Main {
    static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            double a = input.nextInt();
            System.out.println("(+, -, *, /): ");
            char operador = input.next().charAt(0);
            System.out.println("Digite o segundo número: ");
            double b = input.nextInt();
            double resultado;
            switch (operador) {
                case '+':
                    resultado = a + b;
                    break;

                case '-':
                    resultado = a - b;
                    break;
                case '*':
                    resultado = a * b;
                    break;

                case '/':
                    resultado = a / b;
                    break;
                    default:
                        System.out.println("Operação invalida!");
                        return;
            }
            System.out.println("Resultado: " + resultado);
        }
    }
}
