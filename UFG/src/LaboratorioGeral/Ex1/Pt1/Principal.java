package LaboratorioGeral.Ex1.Pt1;

public class Principal {
    public static void main(String[] args) {
        // Instanciar um aluno
        Aluno aluno = new Aluno("João Silva");

        // Realizar a matrícula do aluno
        aluno.matricular(12345, "Sistemas de Informação", 2023);

        // Mostrar os dados do aluno
        System.out.println("Dados iniciais do aluno:");
        System.out.println(aluno);
        System.out.println();

        // Alterar o curso
        aluno.setCurso("Ciência da Computação");

        // Alterar o ano
        aluno.setAno(2024);

        // Mostrar novamente os dados alterados
        System.out.println("Dados alterados do aluno:");
        System.out.println(aluno);
    }
}