package exercicios.fundamentos.exercicio014;

// Encontre o maior de três números. ■ ■ ■ ■ ■ ■


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(91);
        lista.add(132);
        lista.add(41);

        int contador = lista.get(0);
        for (int i = 0;  i<lista.size();i++) {
            if (contador < lista.get(i)) {
                contador = lista.get(i);
            }
        }
        System.out.printf("Maior numero: %d\n", contador);
    }
}
