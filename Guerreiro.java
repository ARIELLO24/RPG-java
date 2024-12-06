public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome); // Chama o construtor da classe base
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com espada! Força: " + getForca());
    }

    // a função nova vai estar aqui 

    
    @Override
    public void usarMagia() {
        System.out.println(getNome() + " não pode usar magia, mas lança uma pedra com sua força!");
    }

    @Override
    public void fugir() {
        System.out.println(getNome() + " fugiu da batalha!");
    }
}

//vou mudar algumas coisas aqui,so não sei quando
//meu problema e quando for esse arrombado não ser magia e tacar pedras ja que esse cara é um bosta