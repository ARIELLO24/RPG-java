public class Mago extends Personagem {
    private int contagemAtaques;  // Contador para os ataques

    public Mago(String nome, Caminho caminho) {
        super(nome, caminho);
        this.contagemAtaques = 0;  // Inicia a contagem de ataques
    }

    @Override
    public void atacar() {
        contagemAtaques++;  // Incrementa o contador de ataques

        // Verifica o tipo de ataque com base na contagem
        if (contagemAtaques == 1) {
            System.out.println(getNome() + " atacou com um feitiço poderoso! Força: " + getForca());
        } else if (contagemAtaques == 2) {
            System.out.println(getNome() + " lançou uma rajada mágica causando dano ao inimigo!");
        } else if (contagemAtaques == 3) {
            System.out.println(getNome() + " usou um feitiço de cura em si mesmo!");
            contagemAtaques = 0;  // Reseta a contagem para o próximo ciclo
        }
    }

    @Override
    public void usarMagia() {
        System.out.println(getNome() + " lançou uma magia com " + getMana() + " de mana!");
    }

    @Override
    public void fugir() {
        System.out.println(getNome() + " fugiu rapidamente usando magia!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nClasse: Mago";
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////