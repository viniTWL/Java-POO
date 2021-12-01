package AtividadesAdd2;

public class CarroCorrida {
    private int numeroCarro;
    private String piloto;
    private String equipe;
    private float velocidadeMaxima;
    private float velocidadeAtualfloat;
    private boolean ligado;

    public CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima, float velocidadeAtualfloat, boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.equipe = equipe;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtualfloat = velocidadeAtualfloat;
        this.ligado = ligado;
    }

    public float acelerar (float acelerecao) {
        if (this.ligado ) {
            this.velocidadeAtualfloat = this.velocidadeAtualfloat + acelerecao;
            System.out.println("Acelerando...");
            if(this.velocidadeMaxima < this.velocidadeAtualfloat){
                System.out.println("O carro já atingiu sua velocidade máxima");
            }
        }
        else {
            System.out.println("O carro está desligado ou você já está na velocidade máxima!");
        }
            return this.velocidadeAtualfloat;

    };

    public float frear (float freio) {
        if (this.ligado) {
            this.velocidadeAtualfloat = this.velocidadeAtualfloat - freio;
            System.out.println("Freando...");
        }
        else {
            System.out.println("O carro está desligado!");
        }
        return this.velocidadeAtualfloat;
    };

    public void parar(){
        this.velocidadeAtualfloat -= this.velocidadeAtualfloat;
        System.out.println("Parando o carro!");
    }

    public void ligar(){
        if(!this.ligado){
            System.out.println("Ligando carro!");
            setLigado(true);
        }
        else {
            System.out.println("Carra já está ligado!");
        }
    }

    public void desligar(){
        if (this.ligado && this.velocidadeAtualfloat <= 0){
            System.out.println("Carro desligando!");
        }
        else {
            System.out.println("O carro precisa estar parado!");
        }
    }



    public int getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtualfloat() {
        return velocidadeAtualfloat;
    }

    public void setVelocidadeAtualfloat(float velocidadeAtualfloat) {
        this.velocidadeAtualfloat = velocidadeAtualfloat;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


}
