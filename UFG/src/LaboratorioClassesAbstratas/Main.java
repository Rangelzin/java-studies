package LaboratorioClassesAbstratas;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        while (true) {
            String numeroStr = JOptionPane.showInputDialog("Digite o número da conta (0 para sair):");
            if (numeroStr == null) break;
            int numero = Integer.parseInt(numeroStr);

            if (numero == 0) break;

            String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
            String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
            Cliente cliente = new Cliente(nome, telefone);

            String tipoStr = JOptionPane.showInputDialog("Tipo de conta:\n1 - Corrente\n2 - Salário\n3 - Poupança");
            if (tipoStr == null) break;
            int tipo = Integer.parseInt(tipoStr);

            Conta conta = null;
            switch (tipo) {
                case 1:
                    conta = new ContaCorrente(numero, cliente);
                    break;
                case 2:
                    conta = new ContaSalario(numero, cliente);
                    break;
                case 3:
                    conta = new ContaPoupanca(numero, cliente);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de conta inválido!");
                    continue;
            }

            if (conta != null) {
                contas.add(conta);
            }
        }

        StringBuilder sb = new StringBuilder("Contas Cadastradas:\n");
        for (Conta c : contas) {
            sb.append(c.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
