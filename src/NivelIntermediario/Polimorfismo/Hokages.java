package NivelIntermediario.Polimorfismo;

public abstract class Hokages {

    String nome;
    String aldeia;
    String missoes;
    int idade;
    boolean vivoOunao;


    public Hokages() {

    }

    public Hokages(String nome, String aldeia, String missoes, int idade, boolean vivoOunao) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.idade = idade;
        this.vivoOunao = vivoOunao;
    }

    public abstract void sabedoriaHokage();
}