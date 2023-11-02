package GameRPG;

import java.util.ArrayList;

public class Personagem {
    private String nome;
    private int nivel;
    private int saude;
    private int energia;
    private ArrayList<Habilidade> habilidade = new ArrayList<>();
    private ArrayList<Item> itens = new ArrayList<>();

    public Personagem(String nome, int nivel, int energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.energia = energia;
    }

    public void atacar(Inimigo inimigo){
        System.out.println("Você atacou o inimigo " + inimigo.getNome());
        inimigo.setEnergia(getEnergia() - 10);
    }
    public void pegarItem(Item item){
        System.out.println("Você pegou o item " + item.getNome());
        this.itens.add(item);

    }
    public void caminhar(double x, double y){
        System.out.println("Você foi para o ponto " + x + " e " + y);
    }
    public void usarHabilidade(Habilidade habilidade){
        habilidade.ativarHabilidade();
        energia = energia - habilidade.getCustoDeEnergia();
    }
    public void usarItem(Item item){
        item.usarItem();
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

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public ArrayList<Habilidade> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(ArrayList<Habilidade> habilidade) {
        this.habilidade = habilidade;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public String getItens() {
        if(this.itens.size() != 0){
            for (Item item : this.itens) {
                return item.getNome();
            }
        }
        return "Não há nenhum item com este personagem!";
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens.addAll(itens);
    }
}
