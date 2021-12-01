package Aula02;

import java.util.Scanner;


public class ex01 {
    public static boolean primo(int numero){
        int cont = 0;
        for(int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }

        if(cont > 2){
            return false;
        }
        else{
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner numEntrada = new Scanner(System.in);
        System.out.println("Digite o número para verificar se ele é primo:");
        int num = numEntrada.nextInt();
        System.out.println(primo(num));
    }
}




