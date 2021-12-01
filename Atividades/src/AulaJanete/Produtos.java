package AulaJanete;

public class Produtos {
    public int cod;
    public String descPro;
    public double preço;
    public int qtd;

    public Produtos(int cod, String descPro, double preço, int qtd) {
        this.cod = cod;
        this.descPro = descPro;
        this.preço = preço;
        this.qtd = qtd;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescPro() {
        return descPro;
    }

    public void setDescPro(String descPro) {
        this.descPro = descPro;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
