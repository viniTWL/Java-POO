package Aula06;

import java.util.ArrayList;
import java.util.Collections;


public class Equipe {
    private String nome;
    private ArrayList<Jogador> listaJogadores = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void addJogadore(Jogador jogador){
        listaJogadores.add(jogador);
    }

    public void mostrarTitulares(){

        Collections.sort(listaJogadores);

        for(int i = 0;  i < listaJogadores.size(); i++){
            if(listaJogadores.get(i).isTitular()){
                System.out.println("Nome do Jogador: "+listaJogadores.get(i).getNome() +
                "\n Numéro da camisa: "+listaJogadores.get(i).getNumCamisa());
            }
        }
    }

    public int getQtdJogadoresLesionados(){

        int count = 0;

        for(int i = 0;  i < listaJogadores.size(); i++){
            if(listaJogadores.get(i).isTitular() && listaJogadores.get(i).isLesionado()){
               count++;
            }
        }
        return count;
    }


}
