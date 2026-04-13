package LaboratorioGeral.Ex7;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Criar 5 funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("João Silva", 3000));
        funcionarios.add(new Funcionario("Maria Santos", 3200));
        funcionarios.add(new Funcionario("Pedro Costa", 2800));
        funcionarios.add(new Funcionario("Ana Oliveira", 3500));
        funcionarios.add(new Funcionario("Carlos Pereira", 3100));

        // Criar 2 gerentes
        List<Gerente> gerentes = new ArrayList<>();
        gerentes.add(new Gerente("Paula Rodrigues", 5000, "Vendas"));
        gerentes.add(new Gerente("Marcos Lima", 5500, "Produção"));

        // Criar 5 vendedores
        List<Vendedor> vendedores = new ArrayList<>();
        Vendedor v1 = new Vendedor("Fernanda Alves", 2500, 5);
        Vendedor v2 = new Vendedor("Ricardo Souza", 2600, 6);
        Vendedor v3 = new Vendedor("Juliana Martins", 2400, 4);
        Vendedor v4 = new Vendedor("Lucas Barbosa", 2700, 7);
        Vendedor v5 = new Vendedor("Patricia Nunes", 2550, 5);

        // Configurar vendas mensais para os vendedores
        configurarVendas(v1);
        configurarVendas(v2);
        configurarVendas(v3);
        configurarVendas(v4);
        configurarVendas(v5);

        vendedores.add(v1);
        vendedores.add(v2);
        vendedores.add(v3);
        vendedores.add(v4);
        vendedores.add(v5);

        // Mostrar dados dos funcionários e proventos
        System.out.println("=== DADOS INICIAIS ===");
        mostrarProventos(funcionarios, gerentes, vendedores);

        // Aplicar aumento de 10%
        System.out.println("\n=== APÓS AUMENTO DE 10% ===");
        aplicarAumento(funcionarios, gerentes, vendedores, 10);
        mostrarProventos(funcionarios, gerentes, vendedores);

        // Criar empresa e cadastrar funcionários
        System.out.println("\n=== CADASTRO EM EMPRESA ===");
        Empresa empresa = new Empresa("12.345.678/0001-90", "Tech Solutions");

        for (Funcionario f : funcionarios) empresa.adicionarFuncionario(f);
        for (Gerente g : gerentes) empresa.adicionarFuncionario(g);
        for (Vendedor v : vendedores) empresa.adicionarFuncionario(v);

        empresa.mostrarFuncionarios();
    }

    private static void configurarVendas(Vendedor vendedor) {
        // Configurar vendas aleatórias para cada mês
        for (int mes = 1; mes <= 12; mes++) {
            double vendas = 5000 + (Math.random() * 15000); // Entre 5000 e 20000
            vendedor.setVendasMes(mes, vendas);
        }
    }

    private static void mostrarProventos(List<Funcionario> funcionarios, List<Gerente> gerentes, List<Vendedor> vendedores) {
        System.out.println("\n--- FUNCIONÁRIOS ---");
        for (Funcionario f : funcionarios) {
            System.out.println(f.toString() + ", Proventos anuais: R$" + f.calcularProventosAnuais());
        }

        System.out.println("\n--- GERENTES ---");
        for (Gerente g : gerentes) {
            System.out.println(g.toString() + ", Proventos anuais: R$" + g.calcularProventosAnuais());
        }

        System.out.println("\n--- VENDEDORES ---");
        for (Vendedor v : vendedores) {
            System.out.println(v.toString() + ", Proventos anuais: R$" + v.calcularProventosAnuais());
        }
    }

    private static void aplicarAumento(List<Funcionario> funcionarios, List<Gerente> gerentes, List<Vendedor> vendedores, double percentual) {
        for (Funcionario f : funcionarios) f.aumentarSalario(percentual);
        for (Gerente g : gerentes) g.aumentarSalario(percentual);
        for (Vendedor v : vendedores) v.aumentarSalario(percentual);
    }
}