package NivelIntermediario.Heranças;

public class Uchiha extends Ninja {

    public void ShariganAtivado() {
        System.out.println("Meu nome é " + nome + ", o meu Sharingan ativou, eu sou um Uchiha!\n");
    }

    @Override
    public String EuSouUmNinja() {
        return "Oi, eu sou um Ninja Uchiha!\n";
    }
}
