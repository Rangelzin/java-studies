package Desafios.Desafio3;

public class Uchiha extends Ninjas{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.printf("\nHABILIDADE ULTRAESPECIAL: %s \n",habilidadeEspecial);
    }

    public void mostrarInformações() {
        System.out.printf("| Nome: %-30s \t |\n",nome);
        System.out.printf("| Idade: %-27d \t |\n",idade);
        System.out.printf("| Missao: %-25s \t |\n",missao);
        System.out.printf("| Nivel de dificuldade: %-12s \t |\n",nivelDificuldade);
        System.out.printf("| Status da Missao: %-18s \t |\n",statusMissao);
        System.out.printf("| Habilidade Esp: %-20s \t |\n",habilidadeEspecial);
    }

}
