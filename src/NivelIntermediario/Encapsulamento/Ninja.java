package NivelIntermediario.Encapsulamento;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private double altura;

    public Ninja() {
    }
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
    }

    // tirar dados ou mostrar para o usuário eu uso GET
    public String getNome() {
        return nome;
    }
    public String getAldeia() {
        return aldeia;
    }
    public int getIdade() {
        return idade;
    }
    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }
    public double getAltura() {
        return altura;
    }

    // colocar dados para o usuário eu uso SET

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
