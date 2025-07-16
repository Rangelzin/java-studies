package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja implements Sharigan{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    /*
    * Metodo:
    * Implementa a interface Sharigan
     */
    public void ShariganAtivado() {
        System.out.println(nome + ": um Uchiha ativou o Sharingan!!!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque de Fogo");
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


