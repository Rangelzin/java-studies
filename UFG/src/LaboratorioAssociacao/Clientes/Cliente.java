package LaboratorioAssociacao.Clientes;

public class Cliente {
    private String nome, cpf;
    private Endereco end;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public Endereco getEnd() {
        return end;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEnd(Endereco end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " | End: " + end;
    }
}