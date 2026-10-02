package exercicios.m01_fundamentos.exercicio028;

//28. Imprima números ímpares de 1 a 100.

public class Main {
    public static void main(String[] args) {
        contar1a100Impares();
    }

    public static void contar1a100Impares() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
