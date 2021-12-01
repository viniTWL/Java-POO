package Produto;

public class Caixa extends Produto{
    private double comprimento;
    private double altura;
    private double largura;

    public Caixa(){}

    public Caixa (double comprimento, double altura, double largura, double peso){
        super(peso);
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularEspaço() {
        double area = this.comprimento * this.largura * this.altura;
        return area;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
