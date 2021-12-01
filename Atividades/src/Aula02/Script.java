package Aula02;

import java.util.Scanner;

public class Script {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Escreva seu sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite o dia do seu nascimento:");
        String dia = entrada.nextLine();
        System.out.println("Digite o mês do seu nascimento:");
        String mes = entrada.nextLine();
        System.out.println("Digite o ano do seu nascimento");
        String ano = entrada.nextLine();

        char inicialN = nome.charAt(0);
        char inicialS = sobrenome.charAt(0);

        System.out.println("Nome Completo: "+ nome + " " + sobrenome + "\nData de nascimento:" + dia + mes + ano + "\nInicial do  Nome: "+ inicialN + "\nInicial do Sobreome: "+ inicialS );

    }
}
