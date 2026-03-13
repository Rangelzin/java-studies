package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaBatalha {

    String nome;
    String aldeia;
    int idade;
    int NumeroDeMissoesConcluidas;
    RankNinja Rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        this(nome, aldeia, idade);
        NumeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        Rank = rank;
    }

    final void tacarKunai( ){
        System.out.println("Eu taquei uma kunai e sou da CLASSE MAE");
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e esse é minha ESTRATEGIA de batalha");
    }

    public void inteligenciaCombate() {
        System.out.println("Meu nome é " + nome + " e esse é minha INTELIGENCIA de batalha");
    }

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
