package LaboratorioAssociacao.AlunosMatriculados;

public class Curso {
    private String nome;
    private String sigla;
    private Departamento depto;

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public Departamento getDepto() {
        return depto;
    }
    public String getSigla() {
        return sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public void setDepto(Departamento depto) {
        this.depto = depto;
    }

    @Override public String toString() {
        return nome + " - Depto: " + depto;
    }
}
