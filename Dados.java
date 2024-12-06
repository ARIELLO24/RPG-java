import java.util.Scanner;

public class Dados {
    
    // Método que pede ao jogador para rolar os dados
    public int rolarDados(Scanner scanner, int quantidade, int faces) {
        // Limpa a tela antes de começar a rolagem dos dados
        int resultadoTotal = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Pressione Enter para rolar o dado " + i + " de " + quantidade + " (d" + faces + ").");
            scanner.nextLine(); // Aguarda o Enter do jogador
            int resultado = (int) (Math.random() * faces) + 1; // Gera o número aleatório entre 1 e o número de faces
            System.out.println("Você rolou: " + resultado);
            resultadoTotal += resultado;
        }
        return resultadoTotal;
    }
}
