package ExerciciosAula.Ex2;

public class Contato {
    public String nome;
    public String cpf;
    public String email;
    public String telefone;

    public Contato(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato | Nome: " + this.nome + ", Email: " + this.email + ", Telefone: " + this.telefone + ", CPF: " + this.cpf;
    }
}
