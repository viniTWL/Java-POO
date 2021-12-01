package Empresa;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double addAumento(double valor) {
        this.salario += valor;
        return this.salario;
    }

    public abstract double ganhoAnual();
    public abstract void exibeDados();





}