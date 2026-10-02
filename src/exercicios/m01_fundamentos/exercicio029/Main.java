package exercicios.m01_fundamentos.exercicio029;

//29. Some números de 1 a 100.

public class Main {
    public static void main(String[] args) {
        System.out.println(soma1a100());
    }
    public static int soma1a100(){
        int soma = 0;
        for (int i = 1; i <= 100; i++){
            soma += i;
        }
        return soma;
    }
}
