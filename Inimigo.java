package GameRPG;

import java.util.ArrayList;
import java.util.List;

public class Inimigo {
    private String nome;
    private int nivel;
    private int saude;
    private int energia;
    private ArrayList<Habilidade> habilidadeDeCombate = new ArrayList<>();

    public Inimigo(String nome, int nivel, int saude, int energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.saude = saude;
        this.energia = energia;
    }

    public void atacar(Personagem personagem){
        System.out.println("Você atacou o personagem " + personagem.getNome());
        personagem.setEnergia(personagem.getEnergia() - 10);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setHabilidadeDeCombate(ArrayList<Habilidade> habilidadeDeCombate) {
        this.habilidadeDeCombate = habilidadeDeCombate;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public List<Habilidade> getHabilidadeDeCombate() {
        return habilidadeDeCombate;
    }

}
