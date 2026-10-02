package exercicios.m01_fundamentos.exercicio022;

import java.util.Locale;
import java.util.Scanner;

//Calcule aumento salarial.

public class Main {
    public static void main(String[] args) {
        executar22();
    }

    public static void executar22() {
        try (Scanner input = new Scanner(System.in)) {
            double salario, percentual;
            System.out.println("salario: ");
            salario = input.nextDouble();
            System.out.println("percentual: ");
            percentual = input.nextDouble();

            System.out.printf(Locale.US, "Aumento: %.2f | Novo salário: %.2f", calcularValorPercentual(salario, percentual), calcularNovoSalario(salario, percentual));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculoPercentual(double percentual) {
        if (percentual < 0) {
            throw new IllegalArgumentException("Percentual invalido! ");
        } else {
            return percentual / 100;
        }
    }

    public static double calcularValorPercentual(double salario, double percentual) {
        if (salario < 0) {
            throw new IllegalArgumentException("Dígite um salário valido!");
        } else {
            return salario * calculoPercentual(percentual);
        }
    }

    public static double calcularNovoSalario(double salario, double percentual) {
        return salario + (calcularValorPercentual(salario, percentual));
    }
}
