package LaboratorioGeral.Ex7;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
        this.bonificacao = salario * 0.2; // 20% de bonificação para gerentes
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    @Override
    public String toString() {
        return "Gerente: " + nome + ", Departamento: " + departamento + ", Salário: R$" + salario + ", Bonificação: R$" + bonificacao;
    }
}