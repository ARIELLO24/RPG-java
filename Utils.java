import java.io.IOException;

public class Utils {
    // Função para limpar a tela

    private static int compareVersion(String v1, String v2) {
        String[] v1Parts = v1.split("\\.");
        String[] v2Parts = v2.split("\\.");
        int length = Math.max(v1Parts.length, v2Parts.length);
        for (int i = 0; i < length; i++) {
            int v1Part = i < v1Parts.length ? Integer.parseInt(v1Parts[i]) : 0;
            int v2Part = i < v2Parts.length ? Integer.parseInt(v2Parts[i]) : 0;
            if (v1Part < v2Part) return -1;
            if (v1Part > v2Part) return 1;
        }
        return 0;
    }
    /////////////////////////////////////////////////////////////////////////////////////////
    public static void limparTela() {
        try {
            // Se o sistema for Windows
            if (System.getProperty("os.name").contains("Windows") && compareVersion(System.getProperty("os.version"), "7.0") < 0) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            // Se for Unix/Linux
            else {
                System.out.print((char) 27 + "[H" + (char) 27 + "[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
