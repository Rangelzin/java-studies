package Desafios.Desafio5;

public class Main {
    public static void main(String[] args) {
        System.out.printf("======================================\n");
        System.out.printf("|%10s %-25s|\n", "", "Banco de Konoha");
        System.out.printf("======================================\n");

        ContaCorrente ContaCorrenteNaruto = new ContaCorrente(300);
        ContaPoupanca ContaPoupancaNaruto = new ContaPoupanca(1500);

        ContaCorrenteNaruto.consultarSaldo();
        ContaPoupancaNaruto.consultarSaldo();

        ContaCorrenteNaruto.depositar(500);
        ContaPoupancaNaruto.depositar(500);

        ContaCorrenteNaruto.consultarSaldo();
        ContaPoupancaNaruto.consultarSaldo();

    }
}
