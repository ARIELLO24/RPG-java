import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Historia {
    private Scanner scanner;
    private Random random;

    public Historia() {
        scanner = new Scanner(System.in);
        random = new Random();  // Inicializando o objeto Random
    }

    public void iniciar(Personagem personagem) {
        Utils.limparTela();
        System.out.println("[------------------------------DUNGEONS & WOMAN`S------------------------------]");
        System.out.println("Aldric é um jovem camponês que parte em uma jornada para encontrar o Reino Esquecido e recuperar o Amuleto da Luz.");
        System.out.println("Ele enfrenta diversos desafios, incluindo criaturas místicas e locais perigosos como a Floresta Sombria, o Vale dos Ventos Uivantes, e a Caverna dos Ecos.");
        System.out.println("Finalmente, Aldric chega ao Portão do Reino Esquecido, onde encontra a Rainha Sábia.");
        System.out.println("Ela revela que ele é o escolhido para restaurar a glória do reino.");
        System.out.println("Com sua nova sabedoria, Aldric retorna à sua vila, lidera seu povo com justiça e transforma o Reino Esquecido em um lugar próspero.");        
        System.out.println("------------------------------------------------------------");
        System.out.println("       Esse é o mundo de  Dungeons & WOMAN`S!!!!            ");
        System.out.println("------------------------------------------------------------");
        System.out.println("                                                            ");
        System.out.println("Esses são seus status não esqueça deles seu merda:");
        System.out.println("                                                            ");
        System.out.println(personagem);
        System.out.println("                                                            ");
        System.out.println("[            Pressione Enter para continuar                ]");
                scanner.nextLine();
                Utils.limparTela();

        // Criação das áreas
        Caminho area1 = new Caminho("Entrada de Eldoria", "A majestosa entrada do reino de Eldoria.", null);
        Caminho area2 = new Caminho("Vale dos Ventos Uivantes", "Um vale onde o vento nunca para de sussurrar segredos antigos.", null);
        Caminho area3 = new Caminho("Floresta dos Sussurros", "Árvores antigas sussurram lendas perdidas enquanto você atravessa a floresta.", null);
        Caminho area4 = new Caminho("Túmulo do Herói", "Uma lápide antiga que guarda os restos de um herói lendário.", null);
        Caminho area5 = new Caminho("Cachoeira da Cura", "Uma cachoeira mágica que restaura 10 de vida com suas águas puras.", null);
        Caminho area6 = new Caminho("Desfiladeiro dos Gigantes", "Desfiladeiro traiçoeiro onde gigantes ancestrais andam à noite.", null);
        Caminho area7 = new Caminho("Labirinto das Sombras", "Um labirinto cheio de armadilhas onde sombras espreitam a cada esquina.", null);
        Caminho area8 = new Caminho("Ruínas do Velho Reino", "Ruínas cobertas por musgo e vestígios de batalhas antigas de Eldoria.", null);
        Caminho area9 = new Caminho("Santuário Esquecido", "Um local sagrado onde você recebe +20 de vida.", null);
        Caminho area10 = new Caminho("Fortaleza do Feiticeiro", "O feiticeiro Vordak protege a saída da masmorra com suas magias sombrias.", null);
        Caminho area11 = new Caminho("Entrada do Castelo Sombrio", null, null);
        Caminho area12 = new Caminho("O Fim", "O fim Só", null);

        // Lista de monstros para cada fase
        List<Monstro> monstrosArea2 = new ArrayList<>();
        monstrosArea2.add(new Monstro("Lobo Sombrio", 20, 10));
        monstrosArea2.add(new Monstro("Felipe DOIDO", 20, 12));

        List<Monstro> monstrosArea4 = new ArrayList<>();
        monstrosArea4.add(new Monstro("Esqueleto Guerreiro", 25, 10));
        monstrosArea4.add(new Monstro("Zumbi Antigo", 30, 12));        

        List<Monstro> monstrosArea6 = new ArrayList<>();
        monstrosArea6.add(new Monstro("Orc Furioso", 30, 30)); 
        monstrosArea6.add(new Monstro("Gigante das Montanhas", 25, 8));  

        List<Monstro> monstrosArea7 = new ArrayList<>();
        monstrosArea7.add(new Monstro("Dragão Menor", 40, 15));  
        monstrosArea7.add(new Monstro("Garganta Profunda", 35, 12)); 

        List<Monstro> monstrosArea8 = new ArrayList<>();
        monstrosArea8.add(new Monstro("Hitler", 69, 45));  

        List<Monstro> monstrosArea12 = new ArrayList<>();
        monstrosArea12.add(new Monstro("Leo O Barbosa", 50, 30));
        monstrosArea12.add(new Monstro("Leo o Tirano!!!!", 70, 40));

        // Conexão de caminhos picas
        area1.setCaminhos(area2, area3);
        area2.setCaminhos(area4, area5);
        area3.setCaminhos(area5, area6);
        area4.setCaminhos(area7, area8);
        area5.setCaminhos(area6, area9);
        area6.setCaminhos(area8, area7);
        area7.setCaminhos(area9, area8);
        area8.setCaminhos(area9, area6);
        area9.setCaminhos(area10, area11);
        area10.setCaminhos(area11, area12);
        area11.setCaminhos(area9,area12);
        area12.setCaminhos(area12,null);
        // tenho que melhorar esses caminhos

        // Definindo monstros aleatórios nas áreas
        area2.setMonstro(getMonstroAleatorio(monstrosArea2));
        area4.setMonstro(getMonstroAleatorio(monstrosArea4));
        area6.setMonstro(getMonstroAleatorio(monstrosArea6));
        area7.setMonstro(getMonstroAleatorio(monstrosArea7));
        area12.setMonstro(getMonstroAleatorio(monstrosArea12));

        // Caminho inicial
        Caminho atual = area1;

       // Começando a aventura dessa merda
        while (atual != null) { // Loop que continua enquanto houver uma área atual
        Utils.limparTela();
        atual.entrar(personagem); // Chama o método que representa o jogador entrando na área atual

            // Eventos de vida nas áreas sem inimigos
            if (atual == area5) {
                personagem.setVida(personagem.getVida() + 10);
                
            }
            if (atual == area8) {
                personagem.setVida(personagem.getVida() + 15);
                personagem.setForca(personagem.getForca() + 10);
                System.out.println(personagem);
                System.out.println("                                                          ");
                System.out.println("Você encontrou ervas medicinais que te deram vida e força.");
            }
            if (atual == area9) {
                personagem.setVida(personagem.getVida() + 20);
                System.out.println("O poder do Santuário Oculto restaura sua vida em +20!!!");
            }

            // Batalha contra monstros tenebrosos
            if (atual.getMonstro() != null) {
                realizarBatalha(personagem, atual.getMonstro(), scanner);
                if (personagem.getVida() <= 0) {
                    System.out.println("Você morreu. Fim de jogo.");
                    return;
                }
            }

            // Escolha de direção do personagem
            System.out.println("Escolha seu próximo caminho:");
            System.out.println("[1. Esquerda]");
            System.out.println("[2. Direita] ");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                atual = atual.getEsquerda();
            } else if (escolha == 2) {
                atual = atual.getDireita();
            } else {
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

           System.out.println("Você chegou ao final da sua aventura!");
    }

       // Método para sorteio de monstro
       // Recebe uma lista de monstros e retorna um monstro aleatório da lista.
       private Monstro getMonstroAleatorio(List<Monstro> monstros) {
    // Verifica se a lista está vazia para evitar erros
        if (monstros.isEmpty()) {
        return null; // Retorna null caso não existam monstros na lista
    }
    
    // Gera um índice aleatório baseado no tamanho da lista
    int indice = random.nextInt(monstros.size());
    
    // Retorna o monstro correspondente ao índice gerado
    return monstros.get(indice);
}


    private void realizarBatalha(Personagem personagem, Monstro monstro, Scanner scanner) {
        Dados dados = new Dados(); // Instancia a classe de dados
        System.out.println("Batalha iniciada contra: " + monstro.getNome());

        
        while (personagem.getVida() > 0 && monstro.getVida() > 0) {
            // Exibe o ASCII do monstro
            System.out.println(AsciiArt.getAsciiMonstro(monstro.getNome()));
            System.out.println("\nEscolha sua ação:");
            
            // Ações para cada personagem
            // usado para verificar se um objeto é uma instância de uma classe específica ou implementa uma interface.
            if (personagem instanceof Arqueiro) {
                System.out.println("1. Atacar com arco");
                System.out.println("2. Lançar flechas");
                System.out.println("3. Fugir com agilidade");
            } else if (personagem instanceof Guerreiro) {
                System.out.println("1. Atacar com espada");
                System.out.println("2. Lançar pedras");
                System.out.println("3. Fugir");
            } else if (personagem instanceof Mago) {
                System.out.println("1. Atacar com feitiço");
                System.out.println("2. Usar magia");
                System.out.println("3. Fugir com magia");
            }
            
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Utils.limparTela();
                    if (personagem instanceof Arqueiro) {
                        monstro.setVida(monstro.getVida() - personagem.getForca()); // Atacar com arco
                    } else if (personagem instanceof Guerreiro) {
                        monstro.setVida(monstro.getVida() - personagem.getForca()); // Atacar com espada
                    } else if (personagem instanceof Mago) {
                        monstro.setVida(monstro.getVida() - personagem.getForca()); // Atacar com feitiço
                    }
                    //Mostra vida do monstro. Trocar pro menu
                    System.out.println("Você atacou! Vida do monstro: " + monstro.getVida());
                    break;
                case 2:
                    Utils.limparTela();
                    if (personagem instanceof Arqueiro) {
                        // Lançar flechas (aumentar dano)
                        monstro.setVida(monstro.getVida() - personagem.getForca() * 2); // Exemplo de dano maior
                        System.out.println("Você lançou flechas! Vida do monstro: " + monstro.getVida());
                    } else if (personagem instanceof Guerreiro) {
                        // Lançar pedras (dano menor)
                        monstro.setVida(monstro.getVida() - personagem.getForca() / 2); // Exemplo de dano menor
                        System.out.println("Você lançou pedras! Vida do monstro: " + monstro.getVida());
                    } else if (personagem instanceof Mago) {
                        // Usar magia
                        monstro.setVida(monstro.getVida() - personagem.getMana());
                        System.out.println("Você usou magia! Vida do monstro: " + monstro.getVida());
                    }
                    break;
                case 3:
                    // Tentando fugir
                    int resultadoDado = dados.rolarDados(scanner, 1, 10); // Rola um dado d10
                    if (resultadoDado >= 4) { // Se o resultado for 4 ou mais
                        Utils.limparTela();
                        System.out.println("Você conseguiu fugir da batalha!");
                        return;
                    } else {
                        System.out.println("Fugir falhou! Você tomou dano!");
                        personagem.setVida(personagem.getVida() - monstro.getForca());
                        System.out.println("O monstro atacou! Sua vida: " + personagem.getVida());
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");
                    continue;
            }

            if (monstro.getVida() > 0) {
                personagem.setVida(personagem.getVida() - monstro.getForca());
                //Mostra a vida do monstro. Trocar pro menu.
                System.out.println("O monstro atacou! Sua vida: " + personagem.getVida());
            }
        }

        if (personagem.getVida() <= 0) {
            System.out.println("Você foi derrotado!");
        } else {
            System.out.println("Você derrotou o " + monstro.getNome() + "!!!");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////