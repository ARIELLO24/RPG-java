public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome); // Chama o construtor da classe base
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com arco e flecha! Força: " + getForca());
    }
    

      // a função nova vai estar aqui 


    @Override
    public void usarMagia() {
        System.out.println(getNome() + " não pode usar magia. Mas tem muita agilidade!");
    }

    @Override
    public void fugir() {
        System.out.println(getNome() + " fugiu com grande agilidade!");
    }
}

//meu problema e quando for esse arrombado não ser magia e sim lançar flechas ja que esse cara é um bosta
