package Aula04mesa;

public class Objeto {
    private int posx;
    private int posy;
    private char direcao;

    public Objeto(int x, int y, char direcao) {
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
    }

    public void irA(int x, int y, char direcao) {
        this.posy = y;
        this.posx = x;
        this.direcao = direcao;
        System.out.println(this.posx + " " + this.posy + " " + this.direcao);
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }
}
