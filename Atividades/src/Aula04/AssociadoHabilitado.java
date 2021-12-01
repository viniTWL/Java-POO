package Aula04;

public class AssociadoHabilitado extends Associado{

    private double custoPiscina;
    private boolean habilitado;

    public AssociadoHabilitado (String numAssociado, String nome,
                                double valor, String atividade, double custoPiscina){
        super(numAssociado, nome, valor, atividade);
        this.custoPiscina = custoPiscina;
    }

    public double custoMensal(){
        if (this.habilitado){
            return super.custoMensal() + this.custoPiscina;
        }else{
            return super.custoMensal();
        }
    }


}
