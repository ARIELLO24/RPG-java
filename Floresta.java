import java.util.*;

public class Floresta extends Caminho {
    public Floresta(String nome, String texto, Caminho esquerda, Caminho direita) {
        super(nome, texto, esquerda, direita, null);
    }

    @Override public void entrar(Personagem jogador) {
        super.entrar(jogador);
        /*  Aqui tu faz o esquema pra ele te dar vida */
    }
}