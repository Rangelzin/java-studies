package LaboratorioAssociacao.AlunosMatriculados;

public class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public int getAno() {
        return ano;
    }
    public Curso getCurso() {
        return curso;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override public String toString() {
        return "Aluno: " + nome + " | Matrícula: " + matricula + " | Ano: " + ano + " | " + curso;
    }
}
