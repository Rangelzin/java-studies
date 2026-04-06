package LaboratorioAssociacao.Clientes;

public class Endereco {
    private String rua, bairro, cidade, estado;
    private String complemento, cep;
    private int numero;

    public Endereco(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }
    public int getNumero() {
        return numero;
    }
    public String getEstado() {
        return estado;
    }
    public String getCidade() {
        return cidade;
    }
    public String getBairro() {
        return bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return rua + ", " + numero + " - " + cidade + "/" + estado;
    }
}