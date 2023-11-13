package GameRPG;

public class Habilidade {
    private String nome;
    private String descricao;
    private int custoDeEnergia;
    private int dano;


    public Habilidade(String nome, String descricao, int custoDeEnergia, int dano) {
        this.nome = nome;
        this.descricao = descricao;
        this.custoDeEnergia = custoDeEnergia;
        this.dano = dano;
    }

    public void ativarHabilidade(){
        System.out.println("A habilidade " + nome + " foi ativada!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCustoDeEnergia() {
        return custoDeEnergia;
    }

    public void setCustoDeEnergia(int custoDeEnergia) {
        this.custoDeEnergia = custoDeEnergia;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "\nHabilidade: " + nome + ";\nDescrição: " + descricao + ";\nCusto de energia: " + custoDeEnergia + ";\nDano: " + dano + ".";
    }
}
