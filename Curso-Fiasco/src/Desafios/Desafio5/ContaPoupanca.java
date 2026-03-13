package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
    }
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        valor *= 0.99;
        saldo += valor;

        System.out.printf("======================================\n");
        System.out.printf("|%10s %-25s|\n", "", "Depósito Pop");
        System.out.printf("======================================\n");
        System.out.printf("| %-24s %-10.2f|\n","Total depositado:", valor);
        System.out.printf("| %-24s %-10.2f|\n","Seu saldo atual:", saldo);
        System.out.printf("| %-35s|\n","Depósito Realizado com sucesso!!");
        System.out.printf("======================================\n");

    }
}
