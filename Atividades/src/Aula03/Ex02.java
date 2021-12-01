package Aula03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int contp1 = 0;
        int contp2 = 0;
        String opc1f = "";
        String opc2f = "";
        String[] array = new String[3];
        array[0] = "Pedra";
        array[1] = "Papel";
        array[2] = "Tesoura";
        Scanner entrada = new Scanner(System.in);
        System.out.println("------ JOKENPO ------\n 1 - Pedra\n 2 - Papel\n 3 - Tesoura");
        System.out.println("Insira o nome do primeiro jogador: ");
        String player1 = entrada.nextLine();
        System.out.println("Insira o nome do segundo jogador: ");
        String player2 = entrada.nextLine();
        while (true) {
            System.out.println(player1 + " selecione sua opção: ");
            int player1opc = entrada.nextInt();
            System.out.println(player2 + " selecione sua opção: ");
            int player2opc = entrada.nextInt();
            if (player1opc == 1) {
                opc1f = array[0];
                if (player2opc == 2) {
                    opc2f = array[1];
                    contp2 += 1;
                } else if (player2opc == 3) {
                    opc2f = array[2];
                    contp1 += 1;
                }
                else if (player2opc == 1) {
                    opc2f = array[0];
                }
            } else if (player1opc == 2) {
                opc1f = array[1];
                if (player2opc == 1) {
                    opc2f = array[0];
                    contp1 += 1;
                } else if (player2opc == 3) {
                    opc2f = array[2];
                    contp2 += 1;
                }
                else if (player2opc == 2) {
                    opc2f = array[1];
                }
            } else if (player1opc == 3) {
                opc1f = array[2];
                if (player2opc == 1) {
                    opc2f = array[0];
                    contp2 += 1;
                } else if (player2opc == 2) {
                    opc2f = array[1];
                    contp1 += 1;
                } else if (player2opc == 3) {
                    opc2f = array[2];
                }
            }
            System.out.println(player1 + " jogou " + opc1f + " e "+player2 + " jogou "+opc2f);
            System.out.println("PLACAR:" + player1 + " " + contp1 + "x" + contp2 + " " + player2);
            if(contp1 == 3){
                System.out.println("Parabéns " +player1 + " você ganhou!");
                break;
            }
            if(contp2 == 3){
                System.out.println("Parabéns " + player2 + " você ganhou!");
                break;
            }
        }
    }
}

