package Empresa;

public class AssistenteAdministrativo extends Assistente {
    private boolean turnoTrabalho;
    private double adicionalNoturno;


    public AssistenteAdministrativo(String nome, double salario, String matricula, boolean turnoTrabalho, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turnoTrabalho = turnoTrabalho;
        this.adicionalNoturno = adicionalNoturno;

    }

    @Override
    public double ganhoAnual() {
        double salario;
        if (this.turnoTrabalho) {
            salario = (getSalario() * 13) + adicionalNoturno;
        } else{
            salario = (getSalario() * 13);
        }
        return salario;
    }
}
