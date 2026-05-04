package LaboratorioClassesAbstratas;

public class TestaConta {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alice", "1111-1111");
        Cliente c2 = new Cliente("Bob", "2222-2222");

        // Requirement 5: Two references of type Conta
        Conta conta1 = new ContaCorrente(101, c1);
        Conta conta2 = new ContaPoupanca(201, c2);

        System.out.println("--- Initial State ---");
        System.out.println(conta1);
        System.out.println(conta2);

        // Requirement 6: Deposit and Withdraw
        System.out.println("\n--- Testing Deposit and Withdraw ---");
        conta1.depositar(100);
        System.out.println("CC Deposit 100: " + conta1);
        conta1.sacar(50);
        System.out.println("CC Withdraw 50: " + conta1);

        conta2.depositar(100);
        System.out.println("CP Deposit 100: " + conta2);
        conta2.sacar(50);
        System.out.println("CP Withdraw 50: " + conta2);

        // Requirement 7: Update balance with casting
        System.out.println("\n--- Testing updateBalance (Casting) ---");
        ((ContaPoupanca) conta2).atualizaSaldo(10);
        System.out.println("CP Updated (+10%): " + conta2);

        // Requirement 8: Own types, no casting
        ContaPoupanca cp = new ContaPoupanca(202, c2);
        cp.depositar(100);
        cp.atualizaSaldo(5);
        System.out.println("CP (Own Type) Updated (+5%): " + cp);

        // Requirement 9 & 10: Transfer
        System.out.println("\n--- Testing Transfer ---");
        ContaCorrente cc = new ContaCorrente(102, c1);
        cc.depositar(200);
        System.out.println("CC Source: " + cc);
        System.out.println("CP Dest: " + cp);

        cc.transferir(50, cp);
        System.out.println("After transfer 50 from CC to CP:");
        System.out.println("CC Source: " + cc);
        System.out.println("CP Dest: " + cp);

        // Requirement 11 & 12: ContaSalario
        System.out.println("\n--- Testing ContaSalario ---");
        ContaSalario cs = new ContaSalario(301, c1);
        cs.depositar(100);
        System.out.println("CS Deposit 100: " + cs);
        cs.sacar(50);
        System.out.println("CS Withdraw 50: " + cs);

        // Requirement 13: Transfer between different types
        System.out.println("\n--- Testing Inter-type Transfer ---");
        cs.transferir(20, cp);
        System.out.println("After transfer 20 from CS to CP:");
        System.out.println("CS Source: " + cs);
        System.out.println("CP Dest: " + cp);
    }
}
