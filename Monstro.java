import java.util.Random;
import java.util.List;

public class Monstro {
    private String nome;
    private int vida;
    private int forca;

    public Monstro(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void atacar(Personagem personagem) {
        Random random = new Random();
        int dano = forca;

        // Chance de crítico (20% de chance)
        if (random.nextInt(100) < 20) {
            dano *= 2;  // Dano dobrado no crítico
            System.out.println(nome + " fez um ataque crítico!");
        }

        personagem.setVida(personagem.getVida() - dano);
        System.out.println(nome + " atacou com força de " + forca + " causando " + dano + " de dano!");
    }

    // Método para gerar monstro aleatório
    public static Monstro gerarMonstroAleatorio(List<Monstro> monstros) {
        Random random = new Random();
        int indice = random.nextInt(monstros.size());
        return monstros.get(indice);
    }
}
