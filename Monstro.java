public class Monstro {
    private String nome;
    private int vida;
    private int forca;

    public Monstro(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void atacar() {
        System.out.println(nome + " atacou com força de " + forca + "!");
    }
}
