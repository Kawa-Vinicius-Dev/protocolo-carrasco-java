package exercicios.fundamentos.exercicio024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 24. Converta número do mês para nome do mês.
public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> meses = List.of(
                "Janeiro",
                "Fevereiro",
                "Março",
                "Abril",
                "Maio",
                "Junho",
                "Julho",
                "Agosto",
                "Setembro",
                "Outubro",
                "Novembro",
                "Dezembro"
        );


        System.out.println("Digite o mês");
        int mes = input.nextInt();
        System.out.println(meses.get(mes - 1));
    }
}
