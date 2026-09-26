package exercicios.fundamentos.exercicio025;

import java.util.Scanner;

//25. Crie um menu de operações usando switch.
public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,resultado;

        System.out.println(" (1) - Somar\n" +
                           " (2) - Subtrair\n" +
                           " (3) - Multiplicar\n" +
                           " (4) - Dividir\n" +
                           " (0) - Sair"
        );
        int selecaoMenu = input.nextInt();
        System.out.println("Digite o primeiro valor: ");
        a = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = input.nextInt();
        switch (selecaoMenu) {
            case 1:
                resultado = a + b;
                break;
                case 2:
                    resultado = a - b;
                    break;
            case 3:
                    resultado = a * b;
                    break;
            case 4 :
                resultado = a / b;
                break;
                case 0:
                    System.out.println("Saindo do menu.");
                    default:
                        System.out.println("Operação invalida!");
                        return;
        }
        System.out.println("Resultado = " + resultado);
    }
}
