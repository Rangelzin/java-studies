package LaboratorioAssociacao.Empregado;

public class Empresa {
    private String razao, cnpj;
    private Endereco endereco;

    public Empresa(String razao) {
        this.razao = razao;
    }

    public String getRazao() {
        return razao;
    }
    public String getCnpj() {
        return cnpj;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override public String toString() {
        return razao + " (CNPJ: " + cnpj + ")";
    }
}