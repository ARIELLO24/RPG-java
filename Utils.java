import java.io.IOException;

public class Utils {
    // Função para limpar a tela
    public static void limparTela() {
        try {
            // Se o sistema for Windows
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            // Se for Unix/Linux
            else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
