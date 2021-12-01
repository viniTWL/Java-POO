package AtividadesAdd;

import java.util.Scanner;
import java.util.Locale;

public class Interrogatorio {
        public static int pergunta(String ask, Scanner entrada ){
            int pa;
            do {
                System.out.printf("%s", ask);
                pa = entrada.nextInt();
                if (pa !=1 && pa != 0){
                    System.err.println("Opcao Invalida! Digite 0 ou 1");
                }}while ( pa !=1 && pa != 0);
            return pa;

        }


        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            System.out.println(" Por favor responda as nossas perguntas");
            System.out.println("Responda:\n 1 - Sim \n 0 - Nao");

            int pa = pergunta("1.Telefonou para a vítima?\n Resposta:",entrada);
            int pb = pergunta("2.Esteve no local do crime?\n Resposta:",entrada);
            int pc = pergunta("3.Mora perto da vítima?\n Resposta:",entrada);
            int pd = pergunta("4.Devia para a vítima?\n Resposta:",entrada);
            int pe = pergunta("5.Já trabalhou com a vítima?\n Resposta:",entrada);

            int soma = pa + pb + pc + pd + pe;
            System.out.print("Voce e: ");


            if (soma == 5) {
                System.out.println("\"Assassino\"");
            } else if (soma == 3 || soma == 4) {
                System.out.println("\"Cúmplice\"");
            } else if (soma == 2) {
                System.out.println("\"Suspeita\"");
            } else {
                System.out.println("\"Inocente\"");

            }
        }
    }
