package LaboratorioGeral.Ex7;

public class Vendedor extends Funcionario {
    private double[] vendasMensais;
    private double percentualComissao;

    public Vendedor(String nome, double salario, double percentualComissao) {
        super(nome, salario);
        this.vendasMensais = new double[12];
        this.percentualComissao = percentualComissao;
    }

    public void setVendasMes(int mes, double valor) {
        if (mes >= 1 && mes <= 12) {
            vendasMensais[mes - 1] = valor;
        }
    }

    public double getVendasMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            return vendasMensais[mes - 1];
        }
        return 0;
    }

    public double calcularComissaoTotal() {
        double totalVendas = 0;
        for (double venda : vendasMensais) {
            totalVendas += venda;
        }
        return totalVendas * (percentualComissao / 100);
    }

    @Override
    public double calcularProventosAnuais() {
        return (salario + bonificacao) * 12 + calcularComissaoTotal();
    }

    public double getPercentualComissao() { return percentualComissao; }
    public void setPercentualComissao(double percentualComissao) { this.percentualComissao = percentualComissao; }

    @Override
    public String toString() {
        return "Vendedor: " + nome + ", Salário: R$" + salario + ", Comissão: " + percentualComissao + "%";
    }
}