package AtividadesAdd;

import java.util.Scanner;
import java.math.BigDecimal;

public class PesoIdeal {
    public static double heavy(double height){
        double ideal = 72.7 * height - 58;
        return ideal;
    }

    public static void main(String[] args) {
        Scanner heightget = new Scanner(System.in);
        System.out.println("Digite sua altura para verificar seu peso ideal:");
        double heightuser = heightget.nextDouble();
        System.out.println(heavy(heightuser));
    }
}
