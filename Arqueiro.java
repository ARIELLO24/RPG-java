public class Arqueiro extends Personagem {
    private int contagemAtaques;  // Contador para os ataques

    public Arqueiro(String nome, Caminho caminho) {
        super(nome, caminho);
        this.contagemAtaques = 0;  // Inicia a contagem de ataques
    }

    @Override
    public void atacar() {
        contagemAtaques++;  // Incrementa o contador de ataques

        // Verifica o tipo de ataque com base na contagem
        if (contagemAtaques == 1) {
            System.out.println(getNome() + " atacou com arco e flecha! Força: " + getForca());
        } else if (contagemAtaques == 2) {
            System.out.println(getNome() + " atirou várias flechas em direção ao inimigo!");
        } else if (contagemAtaques == 3) {
            System.out.println(getNome() + " fugiu rapidamente com sua agilidade!");
            contagemAtaques = 0;  // Reseta a contagem
        }
    }

    @Override
    public void usarMagia() {
        System.out.println(getNome() + " não pode usar magia, mas é especialista em ataques com flechas!");
    }

    @Override
    public void fugir() {
        System.out.println(getNome() + " fugiu da batalha com grande agilidade!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nClasse: Arqueiro";
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
