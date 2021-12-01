package AtividadesAdd;

import java.util.Scanner;

public class LojaTintas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho em metros quadrados da área a ser pintada:");
        double m2 = entrada.nextFloat();
        double paint = m2 / 3;
        double value = 0;
        double latas = 0;
        if (paint == 0) {
            System.out.println("Você não precisa de nenhuma lata!");
        } else {
            latas = (int) Math.ceil(paint / 18);
            value = latas * 80;
            System.out.println("Você terá que comprar " + latas + " latas, e isso custurá R$" + value);
        }
    }
}