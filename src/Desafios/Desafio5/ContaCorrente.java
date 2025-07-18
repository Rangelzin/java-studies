package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente() {
    }
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

        System.out.printf("\n======================================\n");
        System.out.printf("|%10s %-25s|\n", "", "Depósito Pop");
        System.out.printf("======================================\n");
        System.out.printf("| %-24s %-10.2f|\n","Seu saldo atual:", saldo);
        System.out.printf("| %-35s|\n","Depósito Realizado com sucesso");
        System.out.printf("======================================\n");

    }
}
