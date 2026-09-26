package exercicios.fundamentos.exercicio030;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, soma = 0, media, contador = 0;
        do{
            System.out.println("Digite um numero: ");
            num = input.nextInt();

            if(num != 0){
                soma += num;
                contador++;
            }

        }while(num != 0);

        media = soma / contador;

        System.out.printf("media: %d", media);
    }
}
