import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            Utils.limparTela(); // Chama o método da classe Utils
            System.out.println("\r\n" + //
                    "·▄▄▄▄  ▄• ▄▌ ▐ ▄  ▄▄ • ▄▄▄ .       ▐ ▄ .▄▄ · \r\n" + //
                    "██▪ ██ █▪██▌•█▌▐█▐█ ▀ ▪▀▄.▀·▪     •█▌▐█▐█ ▀. \r\n" + //
                    "▐█· ▐█▌█▌▐█▌▐█▐▐▌▄█ ▀█▄▐▀▀▪▄ ▄█▀▄ ▐█▐▐▌▄▀▀▀█▄\r\n" + //
                    "██. ██ ▐█▄█▌██▐█▌▐█▄▪▐█▐█▄▄▌▐█▌.▐▌██▐█▌▐█▄▪▐█\r\n" + //
                    "▀▀▀▀▀•  ▀▀▀ ▀▀ █▪·▀▀▀▀  ▀▀▀  ▀█▄▀▪▀▀ █▪ ▀▀▀▀ \r\n" + //
                    " ");
                    System.out.println("\r\n" + //
                            "▄▄▄ .\r\n" + //
                            "▀▄.▀·\r\n" + //
                            "▐▀▀▪▄\r\n" + //
                            "▐█▄▄▌\r\n" + //
                            " ▀▀▀ \r\n" + //
                            "");
                            System.out.println("\r\n" + //
                                    "▄▄▌ ▐ ▄▌      • ▌ ▄ ·.  ▄▄▄·  ▐ ▄     .▄▄ · \r\n" + //
                                    "██· █▌▐█▪     ·██ ▐███▪▐█ ▀█ •█▌▐█    ▐█ ▀. \r\n" + //
                                    "██▪▐█▐▐▌ ▄█▀▄ ▐█ ▌▐▌▐█·▄█▀▀█ ▐█▐▐▌    ▄▀▀▀█▄\r\n" + //
                                    "▐█▌██▐█▌▐█▌.▐▌██ ██▌▐█▌▐█ ▪▐▌██▐█▌    ▐█▄▪▐█\r\n" + //
                                    " ▀▀▀▀ ▀▪ ▀█▄▀▪▀▀  █▪▀▀▀ ▀  ▀ ▀▀ █▪     ▀▀▀▀ \r\n" + //
                                    "");                                                                            
            System.out.println(" ╔════════════════════════════════════════════════════════════════════════════╗");
            System.out.println(" ║                             DUNGEONS & WOMAN'S                             ║");
            System.out.println(" ║                                                                            ║");
            System.out.println(" ║ [1] NEW GAME                                                               ║");
            System.out.println(" ║ [2] EXIT                                                                   ║");
            System.out.println(" ║                                                                            ║");
            System.out.println(" ╚════════════════════════════════════════════════════════════════════════════╝");
            System.out.println("                               Escolha uma opção:                              ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o newline após o número

            switch (opcao) {
                case 1:
                TimeUtils.mostrarCarregamento("Carregando", 3);
                    Utils.limparTela();
                    System.out.println("\n[INICIANDO A LADAIA]\n");

                    // Pergunta ao jogador o nome do personagem
                    System.out.print("Qual o nome do seu personagem? ");
                    String nome = scanner.nextLine();

                    // Escolha da classe
                    System.out.println("\nEscolha sua classe:");
                    System.out.println("1. Guerreiro");
                    System.out.println("2. Mago");
                    System.out.println("3. Arqueiro");
                    int escolhaClasse = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    Personagem personagem = null;
                    switch (escolhaClasse) {
                        case 1:
                            personagem = new Guerreiro(nome);
                            break;
                        case 2:
                            personagem = new Mago(nome);
                            break;
                        case 3:
                            personagem = new Arqueiro(nome);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            continue; // Volta para o menu principal
                    }

                    // Inicia o jogo com a história
                    Historia historia = new Historia();
                    historia.iniciarAventura(personagem);
                    break;

                case 2:
                    System.out.println("\nPor que voce seu verme esta saindo dessa obra prima AAAAAAAAAAAA");
                    running = false;
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
