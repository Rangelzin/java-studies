package LaboratorioGeral.Ex7;

public class Funcionario {
    protected String nome;
    protected double salario;
    protected double bonificacao;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.bonificacao = 0;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    public double calcularProventosAnuais() {
        return (salario + bonificacao) * 12;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public double getBonificacao() { return bonificacao; }
    public void setBonificacao(double bonificacao) { this.bonificacao = bonificacao; }

    public String toString() {
        return "Funcionário: " + nome + ", Salário: R$" + salario + ", Bonificação: R$" + bonificacao;
    }
}