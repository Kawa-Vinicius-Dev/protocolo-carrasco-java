package exercicios.fundamentos.exercicio028;
//28. Imprima números ímpares de 1 a 100.
public class Main {
    static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
