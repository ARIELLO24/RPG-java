import java.util.List;
import java.util.Random;

public class Caminho {
    private String nome; // Nome do caminho
    private String descricao; // Descrição do que o jogador encontra
    private Caminho esquerda; // Referência ao caminho da esquerda
    private Caminho direita; // Referência ao caminho da direita
    private List<Monstro> monstrosPossiveis; // Lista de monstros possíveis para este caminho
    private Monstro monstro; // Monstro que vai aparecer no caminho atual

    
    public Caminho(String nome, String descricao, List<Monstro> monstrosPossiveis) {
        this.nome = nome;
        this.descricao = descricao;
        this.monstrosPossiveis = monstrosPossiveis;
        this.monstro = sortearMonstro(); // Sorteia um monstro no momento da criação
    }

    // Configura os caminhos para esquerda e direita
    public void setCaminhos(Caminho esquerda, Caminho direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    // Método para exibir o que acontece ao entrar no caminho
    public void entrar(Personagem jogador) {
        System.out.println("Você entrou no caminho: " + nome);
        System.out.println(descricao);
        if (monstro != null) {
            System.out.println("Cuidado! Há um monstro aqui: " + monstro.getNome());
        }
    }

    // Método para sortear um monstro aleatório da lista
    private Monstro sortearMonstro() {
        if (monstrosPossiveis != null && !monstrosPossiveis.isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(monstrosPossiveis.size());
            return monstrosPossiveis.get(index);
        }
        return null; // Se não houver monstros possíveis, retorna null
    }

    // Getters e Setters
    public Caminho getEsquerda() {
        return esquerda;
    }

    public Caminho getDireita() {
        return direita;
    }

    public Monstro getMonstro() {
        return monstro;
    }

    public void setMonstro(Monstro monstro) {
        this.monstro = monstro;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
