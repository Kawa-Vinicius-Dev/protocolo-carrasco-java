package exercicios.m01_fundamentos.exercicio024;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// 24. Converta número do mês para nome do mês.
public class Main {
    public static void main(String[] args) {
        executar24();
    }

    public static void executar24() {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite o mês");
            int mes = input.nextInt();

            System.out.println(nomeDoMesSwitch(mes));
            System.out.println(nomeDoMesLista(mes));
            System.out.println(nomeDoMesMonth(mes));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static final List<String> MESES = List.of(
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

    public static String nomeDoMesSwitch(int mes) {
        return switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> throw new IllegalArgumentException("Mês inválido: " + mes);
        };
    }

    public static String nomeDoMesLista(int mes) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido: " + mes);
        } else {
            return MESES.get(mes - 1);
        }
    }

    public static String nomeDoMesMonth(int mes) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido: " + mes);
        } else {
            return Month.of(mes).getDisplayName(TextStyle.FULL, Locale.of("pt", "BR"));
        }
    }
}

