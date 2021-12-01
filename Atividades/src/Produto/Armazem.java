package Produto;

import java.util.ArrayList;

public class Armazem {
    private ArrayList<Produto> produtos = new ArrayList<>() ;
    private String nome;

    public Armazem(){}

    public Armazem(String nome){
        this.nome = nome;
    }

    public double calcularEspaçoNecessario(){
        double total = 0;
        for(Produto produto : produtos){
            total = produto.calcularEspaço();
        }
        return total;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto){
        produtos.add(produto);
    }
}
