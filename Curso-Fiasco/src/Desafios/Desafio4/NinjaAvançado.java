package Desafios.Desafio4;

public class NinjaAvançado implements Ninja{
    String nome;
    String aldeia;
    TipoHabilidade habilidade;
    String especialidade;
    int idade;

    public NinjaAvançado() {
    }
    public NinjaAvançado(String nome, String aldeia, TipoHabilidade habilidade, String especialidade, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
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
        System.out.printf("| Hab. Espcial: %-17s |\n", especialidade);
        System.out.printf("===================================\n");
    };

    @Override
    public void executarHabilidade(){
        System.out.printf("\n=================================================\n");
        System.out.printf("|%-16s %s %17s|\n","", "HAB ESPECIAL", "");
        System.out.printf("=================================================\n");
        System.out.printf("| EXECUTANDO: %-33s |\n", especialidade);
        System.out.printf("=================================================\n");
    };
}
