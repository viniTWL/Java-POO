package Produto;

public class ProdutoFactory {
    private static ProdutoFactory instance;

    private ProdutoFactory() {
    }

    public static ProdutoFactory getInstance() {
        if (instance == null) {
            instance = new ProdutoFactory();
        }

        return instance;
    }

    public Produto criarProduto(String product) {
        return switch (product) {
            case "CAIXA5x5" -> new Caixa(5, 5, 5, 3.2);
            case "WILSON" -> new Bola(43, 0.8);
            case "CAIXA3x4" -> new Caixa(5, 3, 4, 2.0);
            default -> null;
        };
    }
}