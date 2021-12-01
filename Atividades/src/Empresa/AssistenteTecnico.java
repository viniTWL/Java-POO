package Empresa;

public class AssistenteTecnico extends Assistente {

    private double bonusSalarial;


    public AssistenteTecnico(String nome, double salario, String matricula, double bonusSalarial) {
            super(nome, salario, matricula);
            this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        double salario = (getSalario() * 13) + bonusSalarial;
        return salario;

            // super.ganhoAnual();
            // System.out.println("Seu ganho: " + super.ganhoAnual()+bonusSalarial);
        }
    }

