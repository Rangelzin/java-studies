package LaboratorioAssociacao.Empregado;

public class Empregado {
    private String nome;
    private int matricula;
    private Empresa empresa;
    // Associação 1
    public Empregado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override public String toString() {
        return "Func: " + nome + " na empresa " + empresa;
    }
}
