package LaboratorioAssociacao.Clientes;

public class MainClientes {
    public static void main(String[] args) {
        // Instanciando Endereços
        Endereco end1 = new Endereco("Rua das Flores");
        end1.setNumero(150);
        end1.setBairro("Jardim Primavera");
        end1.setCidade("São Paulo");
        end1.setEstado("SP");

        Endereco end2 = new Endereco("Avenida Brasil");
        end2.setNumero(2000);
        end2.setBairro("Centro");
        end2.setCidade("Rio de Janeiro");
        end2.setEstado("RJ");

        // Instanciando Clientes e vinculando aos endereços
        Cliente cli1 = new Cliente("Marcos Silva");
        cli1.setCpf("111.222.333-44");
        cli1.setEnd(end1);

        Cliente cli2 = new Cliente("Juliana Costa");
        cli2.setCpf("999.888.777-66");
        cli2.setEnd(end2);

        // Mostrando os resultados
        System.out.println("--- LISTA DE CLIENTES ---");
        System.out.println(cli1);
        System.out.println(cli2);
    }
}