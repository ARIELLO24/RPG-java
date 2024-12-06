import java.util.Scanner;

public class Historia {
    private Scanner scanner;
    private Dados dados;

    public Historia() {
        scanner = new Scanner(System.in);
        dados = new Dados();
    }

    public void iniciarAventura(Personagem personagem) {
        Utils.limparTela();
        System.out.println("[------------------------------DUNGEONS & WOMAN`S------------------------------]");
        System.out.println("Após o misterioso desaparecimento de sua irmã, você descobre pistas que a levam a Corinto, \n" +
        "uma cidade distante envolta em mistérios. Para chegar lá, é preciso atravessar masmorras \n" +
        "traiçoeiras e florestas repletas de monstros, enfrentando perigos a cada passo. \n" +
        "Sua determinação será testada enquanto desvenda segredos que podem mudar seu destino \n" +
        "e o dela para sempre💀💀💀💀💀💀💀💀.");
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Encontre a sua irmã nesse mundo de Dungeons & WOMAN`S!!!!");
        System.out.println("------------------------------------------------------------");
        System.out.println("                                                            ");
        System.out.println("                                                            ");
        System.out.println("Pressione Enter para continuar");
        scanner.nextLine();
        Utils.limparTela();
        System.out.println("Esses são seus status não esqueça deles seu merda:");
        // Exibe os atributos do personagem
        //tenho preguiça de fazer algo decente
        System.out.println(personagem);
        
        System.out.println("\nVocê se encontra em uma encruzilhada, no lado direito tem, \n" +
        "tem uma floresta de acácia e no lado esquerdo tem uma caverna que pode conter itens, \n" +
        "por qual caminho voce vai?"
        );

        System.out.println("                                                                        ");
        System.out.println("Escolha seu caminho:");
        System.out.println("1. Ir pela estrada da esquerda.");
        System.out.println("2. Ir pela estrada da direita.");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        if (escolha == 1) {
            Utils.limparTela();
            System.out.println("\nVocê escolheu o caminho da esquerda.");
            encontrarMonstro(personagem); // Encontro com o primeiro monstro
            continuarHistoria(personagem); // Continuar a história após a batalha
        } else if (escolha == 2) {
            Utils.limparTela();
            System.out.println("\nVocê escolheu o caminho da direita.");
            System.out.println("                                                            ");
            System.out.println("Voce esta no meio da floresta e encontra um veio chamado Leonardo barbosa \n" +
            "Leonardo te da uma maça encantada que te da 10 vida para te ajudar na missão");
            personagem.setVida(personagem.getVida() + 10); // Soma 10 à vida existente
            System.out.print(personagem);
            System.out.println("                                                            ");
            System.out.println("                                                            ");
            System.out.println("agora voce esta muito bem pode continuar");
            System.out.println("Pressione Enter para continuar");
            scanner.nextLine();
            continuarHistoria(personagem); // Continuar a história após a batalha
            
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void continuarHistoria(Personagem personagem) {
        Utils.limparTela();
        System.out.println("\n Vamo dale gurizão");

        System.out.println("\nVocê chega a uma nova encruzilhada.");
        System.out.println("Escolha seu caminho:");
        System.out.println("1. Ir pela estrada da esquerda.");
        System.out.println("2. Ir pela estrada da direita.");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        if (escolha == 1) {
            System.out.println("\nVocê escolheu o caminho da esquerda.");
            encontrarMonstro2(personagem); // Encontro com o segundo monstro
        } else {
            System.out.println("\nVocê escolheu o caminho da direita.");
            encontrarMonstro3(personagem); // Encontro com o terceiro monstro
        }
    }

    public void encontrarMonstro(Personagem personagem) {
        System.out.println("\nVocê encontra um monstro!");
        Monstro monstro = criarMonstro();

        System.out.println("Batalha contra o monstro: " + monstro.getNome());
        System.out.println("Monstro tem " + monstro.getVida() + " de vida e " + monstro.getForca() + " de força.");

        while (monstro.getVida() > 0 && personagem.getVida() > 0) {
            System.out.println("\nEscolha sua ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Usar magia");
            System.out.println("3. Fugir");
            int acao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (acao) {
                case 1:
                    personagem.atacar();
                    monstro.setVida(monstro.getVida() - personagem.getForca());
                    break;
                case 2:
                    personagem.usarMagia();
                    monstro.setVida(monstro.getVida() - personagem.getMana());
                    break;
                case 3:
                    personagem.fugir();
                    break;
                case 4:   
                personagem.fugir();
                //modo pacifista hihihihihi
                return;
                default:
                    System.out.println("Opção invalida doente");
                    break;
            }

            if (monstro.getVida() > 0) {
                monstro.atacar();
                personagem.setVida(personagem.getVida() - monstro.getForca());
            }
        }

        if (personagem.getVida() <= 0) {
            System.out.println("Você morreu no combate😭😭......");
        } else {
            System.out.println("Você derrotou o " + monstro.getNome() + "!!!!!!!");
        }
    }

    public Monstro criarMonstro() {
        String[] nomesMonstros = {"Goblin", "Orc", "Tua mãe"};
        String nome = nomesMonstros[(int) (Math.random() * nomesMonstros.length)];
        int vida = (int) (Math.random() * 20) + 10;
        int forca = (int) (Math.random() * 5) + 5;
        return new Monstro(nome, vida, forca);
    }
/////////////////////////////////////////////////////////////////////////////////////////
    public void continuarHistoria2(Personagem personagem) {
        System.out.println("\nApós derrotar o monstro, você continua sua jornada.");

        System.out.println("\nVocê chega a uma nova encruzilhada.");
        System.out.println("Escolha seu caminho:");
        System.out.println("1. Ir pela estrada da esquerda.");
        System.out.println("2. Ir pela estrada da direita.");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        if (escolha == 1) {
            System.out.println("\nVocê escolheu o caminho da esquerda.");
            encontrarMonstro2(personagem); // Encontro com o segundo monstro
        } else {
            System.out.println("\nVocê escolheu o caminho da direita.");
            encontrarMonstro3(personagem); // Encontro com o terceiro monstro
        }
    }

    public void encontrarMonstro2(Personagem personagem) {
        System.out.println("\nVocê encontra um monstro!");
        Monstro monstro = criarMonstro2();

        System.out.println("Batalha contra o monstro: " + monstro.getNome());
        System.out.println("Monstro tem " + monstro.getVida() + " de vida e " + monstro.getForca() + " de força.");

        while (monstro.getVida() > 0 && personagem.getVida() > 0) {
            System.out.println("\nEscolha sua ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Usar magia");
            System.out.println("3. Fugir");
            int acao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (acao) {
                case 1:
                    personagem.atacar();
                    monstro.setVida(monstro.getVida() - personagem.getForca());
                    break;
                case 2:
                    personagem.usarMagia();
                    monstro.setVida(monstro.getVida() - personagem.getMana());
                    break;
                    case 3:
                    // Rolagem de dados para determinar o sucesso da fuga
                    int resultadoFuga = dados.rolarDados(scanner, 1, 6);  // Rola 1 dado de 6 faces para a fuga
                    System.out.println("Você rolou: " + resultadoFuga);
                    // Defina o valor necessário para a fuga ser bem-sucedida
                    int valorNecessario = 5;  // Por exemplo, se o resultado for 4 ou mais, a fuga será bem-sucedida
                    if (resultadoFuga >= valorNecessario) {
                        System.out.println("Você conseguiu fugir com sucesso!");
                        return;  // Fuga bem-sucedida, retorna para a história
                    } else {
                        System.out.println("A fuga falhou! Você foi alcançado pelo monstro!");
                        monstro.atacar();  // O monstro ataca já que a fuga falhou
                        personagem.setVida(personagem.getVida() - monstro.getForca());
                    }
                    break;
                    case 4:
                     personagem.fugir();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (monstro.getVida() > 0) {
                monstro.atacar();
                personagem.setVida(personagem.getVida() - monstro.getForca());
            }
        }

        if (personagem.getVida() <= 0) {
            System.out.println("Você morreu no combate...");
        } else {
            System.out.println("Você derrotou o " + monstro.getNome() + "!!!!!!!");
        }
    }

    public Monstro criarMonstro2() {
        String[] nomesMonstros = {"Guerreiro espartano", "Chupa cu do ceara", "Caneta vermelha"};
        String nome = nomesMonstros[(int) (Math.random() * nomesMonstros.length)];
        int vida = (int) (Math.random() * 20) + 25;
        int forca = (int) (Math.random() * 5) + 9;
        return new Monstro(nome, vida, forca);
    }
    //aiiiiii neymar
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void continuarHistoria3(Personagem personagem) {
        System.out.println("\nApós derrotar o monstro, você continua sua jornada.");

        System.out.println("\nVocê chega a uma nova encruzilhada.");
        System.out.println("Escolha seu caminho:");
        System.out.println("1. Ir pela estrada da esquerda.");
        System.out.println("2. Ir pela estrada da direita.");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        if (escolha == 1) {
            System.out.println("\nVocê escolheu o caminho da esquerda.");
            encontrarMonstro2(personagem); // Encontro com o segundo monstro
        } else {
            System.out.println("\nVocê escolheu o caminho da direita.");
            encontrarMonstro3(personagem); // Encontro com o terceiro monstro
        }
    }

    public void encontrarMonstro3(Personagem personagem) {
        System.out.println("\nVocê encontra um monstro!");
        Monstro monstro = criarMonstro3();

        System.out.println("Batalha contra o monstro: " + monstro.getNome());
        System.out.println("Monstro tem " + monstro.getVida() + " de vida e " + monstro.getForca() + " de força.");

        while (monstro.getVida() > 0 && personagem.getVida() > 0) {
            System.out.println("\nEscolha sua ação:");
            System.out.println("1. Atacar");
            System.out.println("2. Usar magia");
            System.out.println("3. Fugir");
            int acao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (acao) {
                case 1:
                    personagem.atacar();
                    monstro.setVida(monstro.getVida() - personagem.getForca());
                    break;
                case 2:
                    personagem.usarMagia();
                    monstro.setVida(monstro.getVida() - personagem.getMana());
                    break;
                case 3:
                    personagem.fugir();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (monstro.getVida() > 0) {
                monstro.atacar();
                personagem.setVida(personagem.getVida() - monstro.getForca());
            }
        }

        if (personagem.getVida() <= 0) {
            System.out.println("Você morreu no combate...");
        } else {
            System.out.println("Você derrotou o " + monstro.getNome() + "!!!!!!!");
            
        }
    }

    public Monstro criarMonstro3() {
        String[] nomesMonstros = {"Hitler", "Diogo rei do fifa", "SOR LEO ,o tirano!!!!!"};
        String nome = nomesMonstros[(int) (Math.random() * nomesMonstros.length)];
        int vida = (int) (Math.random() * 20) + 40;
        int forca = (int) (Math.random() * 5) + 20;
        return new Monstro(nome, vida, forca);
    }
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////


 public void continuarHistoria4(Personagem personagem) {
    System.out.println("\nApós derrotar o monstro, você continua sua jornada.");

    System.out.println("\nVocê chega a uma nova encruzilhada.");
    System.out.println("Escolha seu caminho:");
    System.out.println("1. Ir pela estrada da esquerda.");
    System.out.println("2. Ir pela estrada da direita.");
    int escolha = scanner.nextInt();
    scanner.nextLine(); // Limpa o buffer

    if (escolha == 1) {
        System.out.println("\nVocê escolheu o caminho da esquerda.");
        encontrarMonstro2(personagem); // Encontro com o segundo monstro
    } else {
        System.out.println("\nVocê escolheu o caminho da direita.");
        encontrarMonstro3(personagem); // Encontro com o terceiro monstro
    }
}

public void encontrarMonstro4(Personagem personagem) {
    System.out.println("\nVocê encontra um monstro!");
    Monstro monstro = criarMonstro3();

    System.out.println("Batalha contra o monstro: " + monstro.getNome());
    System.out.println("Monstro tem " + monstro.getVida() + " de vida e " + monstro.getForca() + " de força.");

    while (monstro.getVida() > 0 && personagem.getVida() > 0) {
        System.out.println("\nEscolha sua ação:");
        System.out.println("1. Atacar");
        System.out.println("2. Usar magia");
        System.out.println("3. Fugir");
        int acao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        switch (acao) {
            case 1:
                personagem.atacar();
                monstro.setVida(monstro.getVida() - personagem.getForca());
                break;
            case 2:
                personagem.usarMagia();
                monstro.setVida(monstro.getVida() - personagem.getMana());
                break;
            case 3:
                personagem.fugir();
                return;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        if (monstro.getVida() > 0) {
            monstro.atacar();
            personagem.setVida(personagem.getVida() - monstro.getForca());
        }
    }

    if (personagem.getVida() <= 0) {
        System.out.println("Você morreu no combate...");
    } else {
        System.out.println("Você derrotou o " + monstro.getNome() + "!!!!!!!");
    }
}

public Monstro criarMonstro4() {
    String[] nomesMonstros = {"Hitler", "Diogo rei do fifa", "SOR LEO ,o tirano!!!!!"};
    String nome = nomesMonstros[(int) (Math.random() * nomesMonstros.length)];
    int vida = (int) (Math.random() * 20) + 40;
    int forca = (int) (Math.random() * 5) + 20;
    return new Monstro(nome, vida, forca);
}

}
