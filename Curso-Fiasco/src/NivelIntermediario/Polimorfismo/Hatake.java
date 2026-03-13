package NivelIntermediario.Polimorfismo;

public class Hatake extends Ninja implements Sharigan, Anbu {
    public Hatake() {
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Hatake(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void BoasVindasHatake() {
        System.out.println(nome + " , eu sou um Hatake!");
    }

    public void NinjadeElite() {
        System.out.println("Eu sou um Ninja de Elite da Ambu");
    }

    public void ShariganAtivado() {
        System.out.println(nome + ": ativou o Sharingan!!!");
    }

}
