package GameRPG;

import java.util.ArrayList;

public class MundoVirtual {
    private int[] mapaDoMundo;
    private Personagem personagem;
    private ArrayList<Missao> missao;
    private ArrayList<Inimigo> listaDeInimigos;

    public MundoVirtual(Personagem personagem,ArrayList<Missao> missao, ArrayList<Inimigo> listaDeInimigos) {
        this.mapaDoMundo = new int[] {1, 2, 3};
        this.personagem = personagem;
        this.missao = missao;
        this.listaDeInimigos = listaDeInimigos;
    }

    public void gerenciarInteracao(){

    }

    public int[] getMapaDoMundo() {
        return mapaDoMundo;
    }

    public void setMapaDoMundo(int[] mapaDoMundo) {
        this.mapaDoMundo = mapaDoMundo;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public ArrayList<Missao> getMissao() {
        return missao;
    }

    public void setMissao(ArrayList<Missao> missao) {
        this.missao = missao;
    }

    public ArrayList<Inimigo> getListaDeInimigos() {
        return listaDeInimigos;
    }

    public void setListaDeInimigos(ArrayList<Inimigo> listaDeInimigos) {
        this.listaDeInimigos = listaDeInimigos;
    }
}
