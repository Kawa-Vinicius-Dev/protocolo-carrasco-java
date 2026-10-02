package exercicios.m01_fundamentos.exercicio019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        executar19();
    }

    public static void executar19() {
        try (Scanner input = new Scanner(System.in)) {
            List<Integer> lados = new ArrayList<>();
            System.out.print("Digite lado (a): ");
            lados.add(input.nextInt());
            System.out.print("Digite lado (b): ");
            lados.add(input.nextInt());
            System.out.print("Digite lado (c): ");
            lados.add(input.nextInt());
            System.out.print(validarTriangulo(lados));
        }
    }
    public static String validarTriangulo(List<Integer> lados) {
        boolean triangulo = lados.get(0) + lados.get(1) > lados.get(2)
                && lados.get(0) + lados.get(2) > lados.get(1)
                && lados.get(1) + lados.get(2) > lados.get(0);
        return triangulo ? "Triangulo!" : "Não pode ser Triangulo!";
    }
}