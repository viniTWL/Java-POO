package AtividadesAdd;

import java.util.Locale;
import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = 0;
        int total = 0;
        for(int i = 1; i < 6; i++) {
                System.out.println("Digite a idade da pessoa " + i + ":");
                idade = entrada.nextInt();
                total += idade;
        }
        int media = total/5;
        if(media <= 25){
            System.out.printf("A média das pessoas é %s, a turma é jovem.", (media));
        }
        else if(media >= 25 && media <= 60){
            System.out.printf("A média das pessoas é %s, a turma é adulta.", (media));
        }
        else if(media >= 60){
            System.out.printf("A média das pessoas é %s, a turma é idosa.", (media));
        }
    }
}
