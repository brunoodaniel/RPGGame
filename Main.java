package GameRPG;

public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem("Bruno", 100, 100);
        Inimigo inimigo1 = new Inimigo("Pedro", 100, 100, 100);
        Habilidade habilidade1 = new Habilidade("Trovão", "Habilidade pika demais", 10);

        Item item1 = new Item("Maça", "Comestível", "Físico", "Soltar poderes");
        Item item2 = new Item("Banana", "Comestível", "Físico", "Soltar poderes");
        Item itemMissao = new Item("Uva", "Comestível", "Físico", "Soltar poderes");


        Missao missao1 = new Missao("Panzer", "Matar o panzer", itemMissao, "Matar 5 panzer");

        //personagem1.pegarItem(item1);
        //System.out.println(personagem1.getItens());

        System.out.println(missao1.atualizarMissao());

        missao1.iniciarMissao(personagem1);

        System.out.println(missao1.atualizarMissao());

        missao1.completarMissao(personagem1);

        System.out.println(missao1.atualizarMissao());
        System.out.println(personagem1.getItens());

        //personagem1.usarHabilidade(habilidade1);

        //System.out.println(personagem1.getEnergia());
    }
}
