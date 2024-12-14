public class Guerreiro extends Personagem {
    public Guerreiro(String nome, Caminho caminho) {
        super(nome, caminho);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com espada! Força: " + getForca());
    }

    
    public void atacarComPedra() {
        // Lançando uma pedra com a força do guerreiro
        int danoComPedra = getForca() * 2; // dano multiplicado
        System.out.println(getNome() + " lançou uma pedra com força! Dano: " + danoComPedra);
    }

    @Override
    public void usarMagia() {
        // Não tem magia, mas o Guerreiro lança uma pedra
        System.out.println(getNome() + " não usa magia, mas com sua força, lança uma pedra!");
        atacarComPedra();  
    }

    @Override
    public void fugir() {
        System.out.println(getNome() + " fugiu da batalha!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nClasse: Guerreiro";
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////