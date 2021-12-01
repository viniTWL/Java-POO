package Animais;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String EmitirSom() {
        return "O Cachorro late!";
    }

    @Override
    public String Locomocao(){
        return "O Cachorro corre!";
    }
}
