import java.util.*;

public class Caminho {
    private String  nome;
    private String  texto;

    private Caminho esquerda;
    private Caminho direita;

    private ArrayList<Monstro> monstros;

    public Caminho(String nome, String texto, Caminho esquerda, Caminho direita, ArrayList<Monstro> monstros) {
        this.nome = nome;
        this.texto = texto;
        this.esquerda = esquerda;
        this.direita  = direita;
        this.monstros = monstros;
    }

    public void entrar(Personagem jogador) {
        System.out.println("Entrando na " + nome);
        System.out.println(texto);
    }

    public void irParaEsquerda(Personagem jogador) {
        jogador.posicao = esquerda;
        esquerda.entrar(jogador);
    }

    public void irParaDireita(Personagem jogador) {
        jogador.posicao = direita;
        direita.entrar(jogador);
    }

    public Caminho getDireita() {
        return direita;
    }

    public Caminho getEsquerda() {
        return esquerda;
    }

    public String getNome() {
        return nome;
    }

    public void setMonstro(int id, Monstro monstro) {
        if (monstros == null) return;
        monstros.set(id, monstro);
    }

    public Monstro getMonstro(int id) {
        if (monstros == null) return null;
        return monstros.get(id);
    }
}