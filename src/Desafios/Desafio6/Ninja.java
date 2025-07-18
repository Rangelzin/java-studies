package Desafios.Desafio6;

public class Ninja {
    private String nome;
    private String vila;
    private int idade;

    public Ninja() {
    }
    public Ninja(String nome, String vila, int idade) {
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public String getVila() {
        return vila;
    }
    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setVila(String vila) {
        this.vila = vila;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja = { NOME:" + nome +
                " | VILA: " + vila +
                " | IDADE: " + idade +
                " }";
    }
}
