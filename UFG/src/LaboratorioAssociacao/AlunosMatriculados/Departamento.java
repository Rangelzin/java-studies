package LaboratorioAssociacao.AlunosMatriculados;

public class Departamento {
    private String nome;
    private String sigla;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
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

    @Override
    public String toString() {
        return nome + " (" + sigla + ")";
    }
}