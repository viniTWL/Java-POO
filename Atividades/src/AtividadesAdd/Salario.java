package AtividadesAdd;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu salario:");
        float salary = entrada.nextFloat();
        double newSalary = 0;
        String percent = "";
        double profit = 0;
        if (salary <= 280){
            profit = (salary * 0.2);
            newSalary = profit + salary;
            percent = "20%";
        }
        else if (salary >= 280 && salary <= 700){
            profit = (salary * 0.15);
            newSalary = profit + salary;
            percent = "15%";
        }
        else if (salary >= 700  && salary < 1500){
            profit = (salary * 0.1);
            newSalary = profit + salary;
            percent = "10%";
        }
        else if(salary >= 1500){
            profit = (salary * 0.05);
            newSalary = profit + salary;
            percent = "5%";
        }
        System.out.printf("Seu salário antes era de %.2f, teve um aumento de %s, o que resultou em um acréscimo de %2.2f.\nValor Total: %2.2f",
                (salary),(percent),(profit),(newSalary));
    }

}
