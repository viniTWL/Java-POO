package AtividadesAdd2;
import java.time.Year;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Pessoa {
    int year = Year.now().getValue();

    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private int idade;
    private String nome;

    public Pessoa(int diaNasc, int mesNasc, int anoNasc, int idade, String nome) {
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.idade = idade;
        this.nome = nome;
    }

    public void calculaIdade(int anoNasc){
        int tot = year - anoNasc;
        this.idade = tot;
    }

    public int getIdade(){
       return idade;
    }

    public String getNome(){
        return nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano){
        this.diaNasc = dia;
        this.mesNasc = mes;
        this.anoNasc = ano;
    }

}

