package Empresa;

public class Assistente extends Funcionario {

    private String matricula;

    public Assistente(String nome, double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public double ganhoAnual() {

        return 0;
    }

    @Override
    public void exibeDados() {
        System.out.printf("Nome: %s \nSalario: %.2f\nMatricula: %s\nGanhoanual: %.2f ",getNome(), getSalario(), this.matricula, ganhoAnual() );

    }


}
