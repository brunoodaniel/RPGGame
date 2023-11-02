package GameRPG;

import java.util.ArrayList;

public class MundoVirtual {
    private int[][] mapaDoMundo;
    private ArrayList<Personagem> listaDePersonagens;
    private ArrayList<Missao> listaDeMissoes;
    private ArrayList<Inimigo> listaDeInimigos;

    public MundoVirtual(int linhas, int colunas) {
        this.mapaDoMundo =  new int[linhas][colunas];
    }

    public void gerenciarInteracao(){

    }

    public void setMapaDoMundo(int[][] mapaDoMundo) {
        this.mapaDoMundo = mapaDoMundo;
    }

    public int[][] getMapaDoMundo() {
        return mapaDoMundo;
    }

    public ArrayList<Personagem> getListaDePersonagens() {
        return listaDePersonagens;
    }

    public ArrayList<Missao> getListaDeMissoes() {
        return listaDeMissoes;
    }

    public ArrayList<Inimigo> getListaDeInimigos() {
        return listaDeInimigos;
    }

    public void setListaDePersonagens(ArrayList<Personagem> listaDePersonagens) {
        this.listaDePersonagens = listaDePersonagens;
    }

    public void setListaDeMissoes(ArrayList<Missao> listaDeMissoes) {
        this.listaDeMissoes = listaDeMissoes;
    }

    public void setListaDeInimigos(ArrayList<Inimigo> listaDeInimigos) {
        this.listaDeInimigos = listaDeInimigos;
    }
/* private int[][] minhaMatriz;

    // Construtor da classe
    public MinhaClasse(int linhas, int colunas) {
        // Inicializar a matriz com o número de linhas e colunas desejado
        minhaMatriz = new int[linhas][colunas];
    }

    // Método para acessar e modificar elementos da matriz
    public int getElemento(int linha, int coluna) {
        return minhaMatriz[linha][coluna];
    }

    public void setElemento(int linha, int coluna, int valor) {
        minhaMatriz[linha][coluna] = valor;
    }

    */
}
