package exercicios.m01_fundamentos.exercicio023;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//23. Faça uma calculadora usando switch.
public class Main {
    public static void main(String[] args) {
        executar23();
    }
    public static void executar23(){
        try (Scanner input = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Digite o primeiro número: ");
            double a = input.nextDouble();
            System.out.println("(+, -, *, /): ");
            char operador = input.next().charAt(0);
            System.out.println("Digite o segundo número: ");
            double b = input.nextDouble();

            System.out.println(operacaoCalculadora(a, b, operador));

            }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("Digite um número válido.");
        }
    }
    public static double operacaoCalculadora(double a, double b, char operador){
        double resultado = 0;
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
                if (b == 0) {
                    throw new IllegalArgumentException("Não é possível dividir por zero.");
                }
                resultado = a / b;
                break;
            default:
                throw new IllegalArgumentException("Operação inválida!");
        }
        return resultado;
    }
}
