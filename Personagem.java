import java.util.Scanner;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int forca;
    protected int agilidade;
    protected int mana;

    protected Caminho posicao;

    public Personagem(String nome, Caminho caminho) {
        this.nome = nome;
        this.posicao = caminho;
        rolarAtributos();
    }

    // Método para sortear os atributos
    private void rolarAtributos() {
        Dados dados = new Dados();

        // Sorteia os atributos baseados na classe
        this.vida = dados.rolarDados(new Scanner(System.in), 1, 10) + 60;  // Sorteia vida e soma 50 como base
        this.forca = dados.rolarDados(new Scanner(System.in), 1, 6) + 5;    // Sorteia força e soma 5 como base
        this.agilidade = dados.rolarDados(new Scanner(System.in), 1, 6) + 2; // Sorteia agilidade e soma 2 como base
        this.mana = dados.rolarDados(new Scanner(System.in), 1, 4) + 10;    // Sorteia mana e soma 10 como base
    }

    // Métodos abstratos para ações específicas
    public abstract void atacar();
    public abstract void usarMagia();
    public abstract void fugir();

    // Método toString para exibir os atributos do personagem
    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nVida: " + vida +
               "\nForça: " + forca +
               "\nAgilidade: " + agilidade +
               "\nMana: " + mana;
    }

    // Métodos de acesso
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

    public int getAgilidade() {
        return agilidade;
    }

    public int getMana() {
        return mana;
    }

    public Caminho getPosicao() {
        return posicao;
    }
}

// alguem me ama??