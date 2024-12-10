public class AsciiArt {

    // Método para retornar o ASCII Art do monstro com base no nome
    public static String getAsciiMonstro(String nome) {
        switch (nome) {
            case "Lobo Sombrio":
                return "\r\n" + //
                                        "\r\n" + //
                                        "\r\n" + //
                                        "                                                  \r\n" + //
                                        "                                                  \r\n" + //
                                        "                                                  \r\n" + //
                                        "                                                  \r\n" + //
                                        "          ####                        ####        \r\n" + //
                                        "          ########  ############  ########        \r\n" + //
                                        "          ################################        \r\n" + //
                                        "          ##############################          \r\n" + //
                                        "            ############################          \r\n" + //
                                        "            ##########################            \r\n" + //
                                        "          ################################        \r\n" + //
                                        "        ####################################      \r\n" + //
                                        "        ####################################      \r\n" + //
                                        "          ########  ############  ########        \r\n" + //
                                        "        ##########    ########    ########        \r\n" + //
                                        "        ############  ########  ############      \r\n" + //
                                        "            ############################          \r\n" + //
                                        "                ####################              \r\n" + //
                                        "                  ################                \r\n" + //
                                        "                  ####      ####                  \r\n" + //
                                        "                    ####    ####                  \r\n" + //
                                        "                    ##########                    \r\n" + //
                                        "                        ##                        \r\n" + //
                                        "                                           "; 
            case "Felipe DOIDO":
                return "ASCII do Felipe DOIDO aqui"; 

            case "Esqueleto Guerreiro":
                return "ASCII do Esqueleto Guerreiro aqui"; 

            case "Zumbi Antigo":
                return "ASCII do Zumbi Antigo aqui"; 

            case "Orc Furioso":
                return "ASCII do Orc Furioso aqui"; 

            case "Gigante das Montanhas":
                return "ASCII do Gigante das Montanhas aqui"; 

            case "Dragão Menor":
                return "ASCII do Dragão Menor aqui"; 

            case "Garganta Profunda":
                return "ASCII da Garganta Profunda aqui"; 

            case "Leo Barbosa":
                return "ASCII do Dragão Ancestral aqui"; 

            case "Leo o Tirano!!!!":
            return "ASCII do Leo o Tirano!!!! aqui";
            
            default:
                return "ASCII do monstro não encontrado.";
        }
    }
}
