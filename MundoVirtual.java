package GameRPG;

import java.util.ArrayList;
import java.util.Scanner;

public class MundoVirtual {
    Scanner read = new Scanner(System.in);
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
        System.out.println("\n-----------------------------------------------------------------------------------------------------------");
        System.out.println("Olá " + personagem.getNome() + ", Você está começando o Game RPG. Escolha as opções com cuidado para terminar o jogo!");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("\nEssa é a sua habilidade: " + personagem.getHabilidade());

        boolean usarHabilidade= false;


        missao.get(0).iniciarMissao(personagem);
        System.out.println(missao.get(0).toString() + "\nVocê deseja ativar a sua habilidade?\n- Sim\n- Não");
        String escolha = read.next().toLowerCase();
        if(escolha.equals("sim")) {
            personagem.usarHabilidade(personagem.getHabilidade());
            usarHabilidade = true;
        }

        listaDeInimigos.get(1).atacar(personagem, listaDeInimigos.get(1));
        System.out.println("\nVocê deseja atacar o inimigo " + listaDeInimigos.get(1).getNome() + "?");
        String escolha2 = read.next().toLowerCase();

        if (escolha2.equals("não")){
            listaDeInimigos.get(1).atacar(personagem, listaDeInimigos.get(1));
            if (personagem.getSaude() < 0){
                personagem.setSaude(0);
                System.out.println(personagem.toString());
                System.out.println(gameOver());
            }
        }
        else{
            if(usarHabilidade){
                personagem.atacar(listaDeInimigos.get(1));
                if (listaDeInimigos.get(1).getSaude() <= 100){
                    missao.get(0).completarMissao(personagem);
                    System.out.println("\nParabéns, você derrotou o inimigo " + listaDeInimigos.get(1).getNome() + " e finalizou a " + missao.get(0).getTitulo() + "!\n");


                }
            }
            else {
                System.out.println("\nVocê não pode atacar o inimigo, você não usou a sua habilidade!\n");
                listaDeInimigos.get(1).atacar(personagem, listaDeInimigos.get(1));
                if (personagem.getSaude() < 0){
                    personagem.setSaude(0);
                    System.out.println(personagem.toString());
                    System.out.println(gameOver());
                }
            }
        }
    }

    public String gameOver(){
        return "\nGame over!\n" + "Tente novamente!";
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
