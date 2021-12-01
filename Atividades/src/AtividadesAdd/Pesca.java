package AtividadesAdd;

import java.util.Scanner;

public class Pesca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso de seus peixes em kilo:");
        float kilo = entrada.nextFloat();
        float excess = 0;
        float value = 0;
        if(kilo > 50){
            excess = kilo - 50;
            value = excess * 4;
        }
        System.out.println("Você excedeu "+excess+" quilos, e sua multa é de R$"+value);
    }
}
