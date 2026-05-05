package LaboratorioClassesAbstratas;

public class TestaConta {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alice", "1111-1111");
        Cliente c2 = new Cliente("Bob", "2222-2222");

        // Requisito 5: Duas referências do tipo Conta
        Conta conta1 = new ContaCorrente(101, c1);
        Conta conta2 = new ContaPoupanca(201, c2);

        System.out.println("--- Estado Inicial ---");
        System.out.println(conta1);
        System.out.println(conta2);

        // Requisito 6: Depósito e Saque
        System.out.println("\n--- Testando Depósito e Saque ---");
        conta1.depositar(100);
        System.out.println("CC Depósito 100: " + conta1);
        conta1.sacar(50);
        System.out.println("CC Saque 50: " + conta1);

        conta2.depositar(100);
        System.out.println("CP Depósito 100: " + conta2);
        conta2.sacar(50);
        System.out.println("CP Saque 50: " + conta2);

        // Requisito 7: Atualizar saldo com casting
        System.out.println("\n--- Testando atualizarSaldo (Casting) ---");
        ((ContaPoupanca) conta2).atualizaSaldo(10);
        System.out.println("CP Atualizada (+10%): " + conta2);

        // Requisito 8: Tipos próprios, sem casting
        ContaPoupanca cp = new ContaPoupanca(202, c2);
        cp.depositar(100);
        cp.atualizaSaldo(5);
        System.out.println("CP (Tipo Próprio) Atualizada (+5%): " + cp);

        // Requisito 9 & 10: Transferência
        System.out.println("\n--- Testando Transferência ---");
        ContaCorrente cc = new ContaCorrente(102, c1);
        cc.depositar(200);
        System.out.println("CC Origem: " + cc);
        System.out.println("CP Destino: " + cp);

        cc.transferir(50, cp);
        System.out.println("Após transferir 50 de CC para CP:");
        System.out.println("CC Origem: " + cc);
        System.out.println("CP Destino: " + cp);

        // Requisito 11 & 12: ContaSalário
        System.out.println("\n--- Testando ContaSalário ---");
        ContaSalario cs = new ContaSalario(301, c1);
        cs.depositar(100);
        System.out.println("CS Depósito 100: " + cs);
        cs.sacar(50);
        System.out.println("CS Saque 50: " + cs);

        // Requisito 13: Transferência entre tipos diferentes
        System.out.println("\n--- Testando Transferência entre tipos ---");
        cs.transferir(20, cp);
        System.out.println("Após transferir 20 de CS para CP:");
        System.out.println("CS Origem: " + cs);
        System.out.println("CP Destino: " + cp);
    }
}
