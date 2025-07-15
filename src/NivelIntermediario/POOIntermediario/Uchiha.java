package NivelIntermediario.POOIntermediario;

public class Uchiha extends Ninja implements Sharigan{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque de Fogo");
    }

    public void ShariganAtivado() {
        System.out.println(nome + ": um Uchiha ativou o Sharingan!!!");
    }
}


