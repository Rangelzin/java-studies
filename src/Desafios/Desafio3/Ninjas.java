package Desafios.Desafio3;

public class Ninjas {
    protected String nome;
    protected String missao;
    protected String nivelDificuldade;
    protected String statusMissao;
    protected int idade;


    public void mostrarInformações(){
        System.out.printf("| Nome: %-30s \t |\n",nome);
        System.out.printf("| Missao: %-25s \t |\n",missao);
        System.out.printf("| Nivel de dificuldade: %-12s \t |\n",nivelDificuldade);
        System.out.printf("| Status da Missao: %-18s \t |\n",statusMissao);
        System.out.printf("| Idade: %-27d \t |\n",idade);

    }

}
