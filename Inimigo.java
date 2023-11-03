package GameRPG;

public class Inimigo {
    private String nome;
    private int nivel;
    private int saude;
    private int energia;
    private Habilidade habilidadeDeCombate;

    public Inimigo(String nome, int nivel, Habilidade habilidadeDeCombate) {
        this.nome = nome;
        this.nivel = nivel;
        this.saude = 100;
        this.energia = 100;
        this.habilidadeDeCombate = habilidadeDeCombate;
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

    public Habilidade getHabilidadeDeCombate() {
        return habilidadeDeCombate;
    }

    public void setHabilidadeDeCombate(Habilidade habilidadeDeCombate) {
        this.habilidadeDeCombate = habilidadeDeCombate;
    }
}
