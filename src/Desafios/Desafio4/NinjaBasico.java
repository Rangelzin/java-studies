package Desafios.Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    String aldeia;
    TipoHabilidade habilidade;
    int idade;

    public NinjaBasico() {
    }
    public NinjaBasico(String nome, String aldeia, TipoHabilidade habilidade, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.printf("\n===================================\n");
        System.out.printf("|%-10s %s %10s|\n","", "Informações", "");
        System.out.printf("===================================\n");
        System.out.printf("| Nome: %-25s |\n", nome);
        System.out.printf("| Idade: %-24s |\n", idade);
        System.out.printf("| Aldeia: %-23s |\n", aldeia);
        System.out.printf("| Habilidade: %-19s |\n", habilidade);
        System.out.printf("===================================\n");
    };

    @Override
    public void executarHabilidade(){
        System.out.printf("\n=================================================\n");
        System.out.printf("|%-16s %s %17s|\n","", "HAB ESPECIAL", "");
        System.out.printf("=================================================\n");
        System.out.printf("| Mensagem: Este ninja não possui hab especial! |\n");
        System.out.printf("=================================================\n");
    };

}
