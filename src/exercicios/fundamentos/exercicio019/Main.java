package exercicios.fundamentos.exercicio019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            List<Integer> lados = new ArrayList<>();
            System.out.print("Digite lado (a): ");
            lados.add(input.nextInt());
            System.out.print("Digite lado (b): ");
            lados.add(input.nextInt());
            System.out.print("Digite lado (c): ");
            lados.add(input.nextInt());

            boolean triangulo = lados.get(0) + lados.get(1) > lados.get(2)
                    && lados.get(0) + lados.get(2) > lados.get(1)
                    && lados.get(1) + lados.get(2) > lados.get(0);

            System.out.println(triangulo ? "Triangulo!" : "Não pode ser Triangulo!");
        }
    }
}
