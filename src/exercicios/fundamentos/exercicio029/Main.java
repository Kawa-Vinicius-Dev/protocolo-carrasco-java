package exercicios.fundamentos.exercicio029;
//29. Some números de 1 a 100.
public class Main {
    static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i++){
            soma += i;
        }
        System.out.println(soma);
    }
}
