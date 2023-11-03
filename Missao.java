package GameRPG;

import java.util.ArrayList;

public class Missao {
    private String titulo;
    private String descricao;
    private ArrayList<Item> recompensa = new ArrayList<>();
    private String objetivos;



    public Missao(String titulo, String descricao, Item recompensa, String objetivos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.recompensa.add(recompensa);
        this.objetivos = objetivos;
    }

    boolean statusDaMissao = true;
    public void iniciarMissao(Personagem personagem){
        System.out.println("\nA " + titulo + " foi iniciada por " + personagem.getNome() + "!\n");
    }
    public void completarMissao(Personagem personagem){
        System.out.println("A " + titulo + " foi completada!");
        personagem.setItens(this.recompensa);
        statusDaMissao = false;
    }
    public String atualizarMissao(){
        if (!statusDaMissao) {
            return "A missão " + titulo + " está finalizada!";
        }
        else{
            return "A missão " + titulo + "está em andamento!";
        }
    }




    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setRecompensa(ArrayList<Item> recompensa) {
        this.recompensa = recompensa;
    }

    public ArrayList<Item> getRecompensa() {
        return recompensa;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ";\nDescrição: " + descricao + ";\nRecompensa: " + recompensa.get(0).getNome() + ";\nObjetivo: " + objetivos + ";\nStatus da missao: " + atualizarMissao() + ".\n";
    }
}
