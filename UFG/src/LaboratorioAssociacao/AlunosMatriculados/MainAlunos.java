package LaboratorioAssociacao.AlunosMatriculados;

public class MainAlunos {
    public static void main(String[] args) {
        // Instanciando Departamentos
        Departamento deptoExatas = new Departamento("Ciências Exatas");
        deptoExatas.setSigla("DCE");

        Departamento deptoHumanas = new Departamento("Ciências Humanas");
        deptoHumanas.setSigla("DCH");

        // Instanciando Cursos e vinculando aos departamentos
        Curso cursoComp = new Curso("Ciência da Computação");
        cursoComp.setSigla("BCC");
        cursoComp.setDepto(deptoExatas);

        Curso cursoHist = new Curso("História");
        cursoHist.setSigla("HIS");
        cursoHist.setDepto(deptoHumanas);

        // Instanciando Alunos e vinculando aos cursos
        Aluno aluno1 = new Aluno("Ana Clara");
        aluno1.setMatricula(2023001);
        aluno1.setAno(2023);
        aluno1.setCurso(cursoComp);

        Aluno aluno2 = new Aluno("Carlos Mendes");
        aluno2.setMatricula(2022099);
        aluno2.setAno(2022);
        aluno2.setCurso(cursoHist);

        // Mostrando os resultados
        System.out.println("--- LISTA DE ALUNOS ---");
        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}
