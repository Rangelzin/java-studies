package LaboratorioGeral.Ex1.Pt2;

public class Aluno {
    private final String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void matricular(int matricula, Curso curso, int ano) {
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public Curso getCurso() {
        return curso;
    }
    public int getAno() {
        return ano;
    }
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " - matricula: " + matricula + " - Curso: " + curso + " - " + ano;
    }
}