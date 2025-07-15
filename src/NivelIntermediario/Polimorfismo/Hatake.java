package NivelIntermediario.Polimorfismo;

public class Hatake extends Ninja implements Sharigan,Ambu {
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

    @Override
    public void inteligenciaCombate() {
        System.out.println("Meu nome é " + nome + " e esse é minha INTELIGENCIA de batalha");
    }

    @Override
    public void inteligenciaCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é um promissor!");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suaa inteligencia!");
        }
    }
}
