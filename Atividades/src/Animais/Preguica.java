package Animais;

public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String EmitirSom() {
        return "A preguiça não emiti som...";
    }

    @Override
    public String Locomocao() {
        return "A preguiça sobe nas árvores!";
    }

}
