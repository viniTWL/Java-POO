package Aula06;

public class Principal {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador(10, "Neymar",true, true);
        Jogador jogador2 = new Jogador(7,"Mbappe",false, true);
        Jogador jogador3 = new Jogador(30, "Messi",true, true);
        Jogador jogador4 = new Jogador(11,"Di Maria",false,true);

        Equipe equipe = new Equipe("PSG");

        equipe.addJogadore(jogador1);
        equipe.addJogadore(jogador2);
        equipe.addJogadore(jogador3);
        equipe.addJogadore(jogador4);

        equipe.mostrarTitulares();
        System.out.println(equipe.getQtdJogadoresLesionados());
    }
}
