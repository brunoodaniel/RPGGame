package GameRPG;

import java.util.ArrayList;
import java.util.Scanner;

public class MundoVirtual {
    private Personagem personagem;
    private ArrayList<Missao> listaDeMissoes;
    private ArrayList<Inimigo> listaDeInimigos;

    Scanner read = new Scanner(System.in);

    public MundoVirtual(Personagem personagem,ArrayList<Missao> listaDeMissoes, ArrayList<Inimigo> listaDeInimigos) {
        this.personagem = personagem;
        this.listaDeMissoes = listaDeMissoes;
        this.listaDeInimigos = listaDeInimigos;
    }

    public void gerenciarInteracao(){
        System.out.println("\n_____________________________________________________________________________________________");
        System.out.println("Olá " + personagem.getNome() + ", Você está começando o Game RPG. Escolha as opções com cuidado para terminar o jogo!");
        System.out.println("_____________________________________________________________________________________________");

        System.out.println("\nEssa é a sua habilidade: " + personagem.getHabilidade());

        boolean usarHabilidade= false;

        int missaoAtual = 0;

        while (missaoAtual < 3){
            listaDeMissoes.get(missaoAtual).iniciarMissao(personagem);
            System.out.println(listaDeMissoes.get(missaoAtual).toString() + "\nVocê deseja ativar a sua habilidade?\n- Sim\n- Não");
            String escolha = read.next().toLowerCase();
            if(escolha.equals("sim")) {
                if (personagem.getEnergia() < personagem.getHabilidade().getCustoDeEnergia()){
                    System.out.println("\nVocê não tem energia suficiente para ativar essa habilidade!");
                    listaDeInimigos.get(missaoAtual).atacar(personagem, listaDeInimigos.get(missaoAtual));
                    if (personagem.getSaude() < 0){
                        personagem.setSaude(0);
                        System.out.println(personagem.toString());
                        System.out.println(gameOver());
                        break;
                    }
                }
                else {
                    personagem.usarHabilidade(personagem.getHabilidade());
                    usarHabilidade = true;
                }
            }

            listaDeInimigos.get(missaoAtual).atacar(personagem, listaDeInimigos.get(missaoAtual));

            System.out.println("\nVocê deseja atacar o inimigo " + listaDeInimigos.get(missaoAtual).getNome() + "?");
            String escolha2 = read.next().toLowerCase();

            if (escolha2.equals("não")){
                listaDeInimigos.get(missaoAtual).atacar(personagem, listaDeInimigos.get(missaoAtual));
                if (personagem.getSaude() < 0){
                    personagem.setSaude(0);
                    System.out.println(personagem.toString());
                    System.out.println(gameOver());
                    break;
                }
            }
            else{
                if(usarHabilidade){
                    personagem.atacar(personagem, listaDeInimigos.get(missaoAtual));

                    if (personagem.getSaude() <= 0) {
                        System.out.println(Empate(missaoAtual));
                        break;
                    }

                    else if (listaDeInimigos.get(missaoAtual).getSaude() <= 100){
                        listaDeMissoes.get(missaoAtual).completarMissao(personagem);


                        //problema aqui, qnd ataco o 2º inimigo o codigo quebra aqui sendo q na 1º vez funciona normalmente


                        System.out.println("\nVocê adquiriu o item " + listaDeMissoes.get(missaoAtual).getRecompensa().getNome() + ", você deseja usá-lo?");
                        String escolha3 = read.next().toLowerCase();

                        if (escolha3.equals("não")){
                            usarHabilidade = false;
                            missaoAtual++;
                        }
                        else {
                            personagem.usarItem(personagem, listaDeMissoes.get(missaoAtual).getRecompensa());
                            usarHabilidade = false;
                            missaoAtual++;
                        }
                    }
                }
                else {
                    System.out.println("\nVocê não pode atacar o inimigo!");
                    listaDeInimigos.get(missaoAtual).atacar(personagem, listaDeInimigos.get(missaoAtual));
                    if (personagem.getSaude() < 0){
                        personagem.setSaude(0);
                        System.out.println(personagem.toString());
                        System.out.println(gameOver());
                        break;
                    }
                }
            }
        }

    }

    public String gameOver(){
        return "\nGame over!\n" + "Tente novamente!";
    }

    public String Empate(int missaoAtual){
        return "\nParabéns, você derrotou o inimigo " + listaDeInimigos.get(missaoAtual).getNome() + " e morreu como herói!";
    }
}
