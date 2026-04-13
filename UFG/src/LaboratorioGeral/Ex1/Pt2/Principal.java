package LaboratorioGeral.Ex1.Pt2;

public class Principal {
    public static void main(String[] args) {
        // Instanciar um aluno
        Aluno aluno = new Aluno("João Silva");

        // Criar o Curso
        Curso curso1 = new Curso("SI", "Sistemas de Informação");

        // Realizar a matrícula do aluno
        aluno.matricular(12345, curso1, 2025);

        // Mostrar os dados do aluno
        System.out.println("Dados iniciais do aluno:");
        System.out.println(aluno);
        System.out.println();

        // Alterar o curso
        Curso curso2 = new Curso("CC","Ciência da Computação");
        aluno.setCurso(curso2);

        // Alterar o ano
        aluno.setAno(2026);

        // Mostrar novamente os dados alterados
        System.out.println("Dados alterados do aluno:");
        System.out.println(aluno);
    }
}