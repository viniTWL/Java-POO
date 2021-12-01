package Animais;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
       public String EmitirSom() {
        return "O Cavalo relincha!";
    }

    @Override
        public String Locomocao() {
        return "O Cavalo galopa!";
    }
}

