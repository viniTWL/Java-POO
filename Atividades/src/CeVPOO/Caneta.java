package CeVPOO;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor,int carga, boolean tampada){
        this.cor = cor;
        this.modelo = modelo;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
    public void rabiscar(){
        if (this.tampada){
            System.out.println("Não posso rabiscar! Está tamapada!");
        }
        else {
            System.out.println("Estou rabiscando!");
        }
    }
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Azul",1,  true);
        System.out.println("Modelo:" + c1.modelo);

    }
}
