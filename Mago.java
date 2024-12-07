public class Mago extends Personagem {
    public Mago(String nome, Caminho caminho) {
        super(nome, caminho); // Chama o construtor da classe base
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com um feitiço poderoso! Força: " + getForca());
    }

    @Override
    public void usarMagia() {
        System.out.println(getNome() + " lançou uma magia com " + getMana() + " de mana!");
    }

    @Override
    public void fugir() {
        System.out.println(getNome() + " fugiu rapidamente usando magia!");
    }
}
