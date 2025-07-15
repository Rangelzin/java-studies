package NivelIntermediario.POOIntermediario;

public abstract class Ninja implements EstrategiaBatalha {

    //TODO: incluir 2 novos atributos: NumeroDeMissoesConcluidas e Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin e Kage

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

    //TODO: Sobrecarga do construtor

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        this(nome, aldeia, idade);
        NumeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        Rank = rank;
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e esse é minha estrategia de batalha");
    }



}
