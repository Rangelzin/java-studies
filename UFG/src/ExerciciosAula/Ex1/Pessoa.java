package ExerciciosAula.Ex1;

public class Pessoa {
    public String nome;
    public String sexo;
    public String telefone;
    public Integer idade;

    public Pessoa(String nome, String sexo, String telefone, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "PESSOA | Nome: " + this.nome + ", Idade: " + this.idade + ", Telefone: " + this.telefone + ", Sexo: " + this.sexo;
    }
}
