package GameRPG;

public class Item {
    private String nome;
    private String descricao;
    private String tipo;
    private String efeitos;


    public Item(String nome, String descricao, String tipo, String efeitos) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.efeitos = efeitos;
    }

    public void usarItem(Personagem personagem){
        System.out.println("O item " + nome + " e seus efeitos de " + efeitos + " foram ativados!");
        personagem.setSaude(100);
        personagem.setEnergia(100);
        personagem.setNivel(personagem.getNivel() + 20);
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEfeitos() {
        return efeitos;
    }

    public void setEfeitos(String efeitos) {
        this.efeitos = efeitos;
    }
}
