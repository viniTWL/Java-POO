package Produto;

public class Bola extends Produto{
    private double raio;

    public Bola(){}

    public Bola(double raio, double peso){
        super(peso);
        this.raio = raio;
        this.peso = peso;
    }

    @Override
    public double calcularEspaço() {
        double area = (this.raio * this.raio) * Math.PI ;
        return area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
