public class TimeUtils {

    // Método para simular o carregamento com os pontinhos
    public static void mostrarCarregamento(String mensagem, int segundos) {
        for (int i = 0; i < segundos; i++) {
            try {
                System.out.print(mensagem);  // Imprime a mensagem inicial
                System.out.print(".");        // Adiciona um ponto
                Thread.sleep(3000);           // Espera 3 segundos
                System.out.print("\r");       // Apaga a linha atual no console
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" Carregamento concluído!");  // Mostra uma mensagem final
    }
}
