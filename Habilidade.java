package GameRPG;

public class Habilidade {
    private String nome;
    private String descricao;
    private int custoDeEnergia;


    public Habilidade(String nome, String descricao, int custoDeEnergia) {
        this.nome = nome;
        this.descricao = descricao;
        this.custoDeEnergia = custoDeEnergia;
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
}
