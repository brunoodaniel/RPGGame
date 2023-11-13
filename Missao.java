package GameRPG;

public class Missao {
    private String titulo;
    private String descricao;
    private Item recompensa;
    private String objetivos;

    public Missao(String titulo, String descricao, Item recompensa, String objetivos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.recompensa = recompensa;
        this.objetivos = objetivos;
    }

    boolean statusDaMissao = true;
    public void iniciarMissao(Personagem personagem){
        System.out.println("\nA " + titulo + " foi iniciada por " + personagem.getNome() + "!\n");
    }
    public void completarMissao(Personagem personagem){
        System.out.println("\nA " + titulo + " foi completada!");
        personagem.setItens(this.recompensa);
        statusDaMissao = false;
    }
    public String atualizarMissao(){
        if (!statusDaMissao) {
            return "A " + titulo + " está finalizada!";
        }
        else{
            return "A " + titulo + " está em andamento!";
        }
    }
    public Item getRecompensa() {
        return recompensa;
    }
    @Override
    public String toString() {
        return "_______________________________________________________________________________________\n" + "Título: " + titulo + ";\nDescrição: " + descricao + ";\nRecompensa: " + recompensa.getNome() + ";\nObjetivo: " + objetivos + ";\nStatus da missao: " + atualizarMissao() + ".\n" + "_______________________________________________________________________________________";
    }
}
