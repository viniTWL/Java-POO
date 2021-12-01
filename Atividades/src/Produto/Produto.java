package Produto;

public abstract class Produto {
    protected double peso;

    public Produto(){}
    public Produto(double peso) {
        this.peso = peso;
    }

    public abstract double calcularEspaço();
}
