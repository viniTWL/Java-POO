package AtividadesAdd;

import java.util.Locale;
import java.util.Scanner;

public class Posto {
    public static String  validacao(String ask, Scanner entrada ){
        String opc;
        do {
            System.out.printf("%s", ask);
            opc = entrada.nextLine().toUpperCase(Locale.ROOT);
            if (!opc.equals("A") && !opc.equals("G")){
                System.err.println("Opcao Invalida! Digite G ou A");
            }}while (!opc.equals("A") && !opc.equals("G"));
        return opc;

    }

    public static void main(String[] args) {
        double GasPrice = 2.50;
        double AlcPrice = 1.90;
        Scanner entrada = new Scanner(System.in);
        System.out.println("----- TABELA DE PREÇOS -----\n" +
                "G - Gasolina - 2,50 - Acima de 20 litros, 6% de desconto\n" +
                "A - Alcool - 1,90 - Acima de 20 litros, 5% de desconto");
        String opc = validacao("Qual sera sua opção? G/A\n", entrada).toUpperCase(Locale.ROOT);
        System.out.println("Quantos litros irá colocar?");
        int litters = entrada.nextInt();
        double value = 0;
        if (opc.equals("G")) {
            value = litters * GasPrice;
            if (litters > 20) {
                value = value - (value * 0.06);
                System.out.printf("Voce escolheu a opção Gasolina, e como está acima de 20 litros, o preço é R$ %.2f", (value));
            } else {
                value = value - (value * 0.04);
                System.out.printf("Voce escolheu a opção Gasolina, o preço é R$ %.2f",(value));
            }
        } else if (opc.equals("A")) {
            value = litters * AlcPrice;
            if (litters > 20) {
                value = value - (value * 0.05);
                System.out.printf("Voce escolheu a opção Alcool e como está acima de 20 litros, o preço é R$ %.2f", (value));
            } else {
                value = value - (value * 0.03);
                System.out.printf("Voce escolheu a opção Alcool o preço é R$ %.2f", (value));
            }
        }
    }
}
