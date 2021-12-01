package Produto;

public class Principal {
    public static void main(String[] args) {
        ProdutoFactory factory = ProdutoFactory.getInstance();
        Produto caixaLeite = factory.criarProduto("CAIXA5x5");
        Produto bolaWilson = factory.criarProduto("WILSON");
        Produto caixaSapato = factory.criarProduto("CAIXA3x4");

        Armazem armazem = new Armazem();

        armazem.addProduto(caixaLeite);
        armazem.addProduto(bolaWilson);
        armazem.addProduto(caixaSapato);

        System.out.printf("\nEspaco Total: %.2f cm", armazem.calcularEspaçoNecessario());
        System.out.printf("\nEspaco Bola Futebol: %.2f cm", armazem.getProdutos().get(1).calcularEspaço());
        System.out.printf("\nEspaco Caixa: %.2f cm", caixaSapato.calcularEspaço());
        System.out.printf("\nEspaco Bola Tenis: %.2f cm\n\n", bolaWilson.calcularEspaço());
    }
}
