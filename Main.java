package GameRPG;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Bem-vindo ao Game RPG! Por favor, digite o seu nickname:");
        String nomeJogador = read.nextLine();

        Habilidade habilidadePersonagem = new Habilidade("Edo tensei", "Jutsu fatal a qualquer inimigo", 80, 100);
        Personagem personagem = new Personagem(nomeJogador, habilidadePersonagem);


        ArrayList<Inimigo> listaDeInimigos = new ArrayList<>();

        Habilidade habilidadeBossUm = new Habilidade("Trovão Powertônico", "Um trovão capaz devastar áreas enormes", 50, 60);
        listaDeInimigos.add(new Inimigo("Shiski", 60, habilidadeBossUm));

        Habilidade habilidadeBossDois = new Habilidade("Mânipulação lendária", "Um poder capaz de deixar qualquer inimigo hipnotizado e drenar sua energia", 80, 90);
        listaDeInimigos.add(new Inimigo("Hakataki", 80, habilidadeBossDois));

        Habilidade habilidadeBossTres = new Habilidade("Lâmina de Zeus", "Uma lâmina capaz de matar qualquer inimigo", 99, 100);
        listaDeInimigos.add(new Inimigo("Zeus", 100, habilidadeBossTres));



        Item pocaoLendaria = new Item("Poção lendária", "Uma poção capaz de regenerar a energia e saúde do seu consumidor", "Cura", "Regeneração geral");


        ArrayList<Missao> listaDeMissoes = new ArrayList<>();

        listaDeMissoes.add(new Missao("Missão um", "O personagem terá de matar o Shiski para conseguir completar a missão", pocaoLendaria, "Matar o Shiski"));
        listaDeMissoes.add(new Missao("Missão dois", "O personagem terá de matar o Hakataki para conseguir completar a missão", pocaoLendaria, "Matar o Hakataki"));
        listaDeMissoes.add(new Missao("Missão três", "O personagem terá de matar Zeus para conseguir completar a missão", pocaoLendaria, "Matar Zeus"));


        MundoVirtual mundoVirtual = new MundoVirtual(personagem, listaDeMissoes, listaDeInimigos);

        mundoVirtual.gerenciarInteracao();
    }
}
