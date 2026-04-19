package LaboratorioGeral.Ex2;

public class Cliente {
    private String nome;
    private String telefone;
    private int idade;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " - Idade: " + idade + " - Telefone: " + telefone;
    }
}