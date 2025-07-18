package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;

    public ContaBancaria() {
    }
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {

        System.out.printf("\n======================================\n");
        System.out.printf("|%15s %-20s|\n", "", "Saldos");
        System.out.printf("======================================\n");
        System.out.printf("| %5s %-27s|\n", "SALDO: ", saldo);
        System.out.printf("======================================\n");

    }

    @Override
    public abstract void depositar(double valor);
}
