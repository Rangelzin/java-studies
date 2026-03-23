package LaboratorioEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoPrincipalEncapsulado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("========================================");
        System.out.println("       BEM VINDO AO SISTEMA DE LOJA     ");
        System.out.println("========================================");

        // ─────────────────────────────────────────
        // P1 - Criado sem nenhum dado
        // Código gerado automaticamente: 001
        // Dados preenchidos depois via inserir()
        // ─────────────────────────────────────────
        System.out.println("\n--- Cadastro P1 (sem dados por enquanto) ---");
        ProdutoEncapsulado p1 = new ProdutoEncapsulado();

        System.out.println("Código gerado automaticamente: " + p1.getCodigo());
        System.out.println("\n--- Atualizando os dados de P1 via método 'inserir' ---");
        System.out.print("Nome do produto: ");
        String nome1 = sc.nextLine();
        System.out.print("Quantidade inicial em estoque: ");
        int qtd1 = sc.nextInt(); sc.nextLine();
        System.out.print("Tipo do produto: ");
        String tipo1 = sc.nextLine();
        System.out.print("Valor do produto (ex: 99.90): ");
        double valor1 = sc.nextDouble(); sc.nextLine();
        p1.inserir(nome1, qtd1, tipo1, valor1);


        // ─────────────────────────────────────────
        // P2 - Criado apenas com o nome
        // Código gerado automaticamente: 002
        // ─────────────────────────────────────────
        System.out.println("\n--- Cadastro P2 (apenas nome) ---");
        System.out.print("Nome do produto: ");
        String nome2 = sc.nextLine();
        ProdutoEncapsulado p2 = new ProdutoEncapsulado(nome2);

        System.out.println("Código gerado automaticamente: " + p2.getCodigo());
        System.out.println("--- Completando dados de P2 via 'inserir' ---");
        System.out.print("Quantidade inicial: ");
        int qtd2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Tipo do produto: ");
        String tipo2 = sc.nextLine();
        System.out.print("Valor do produto: ");
        double valor2 = sc.nextDouble();
        sc.nextLine();
        p2.inserir(nome2, qtd2, tipo2, valor2);


        // ─────────────────────────────────────────
        // P3 - Criado com nome e quantidade
        // Código gerado automaticamente: 003
        // ─────────────────────────────────────────
        System.out.println("\n--- Cadastro P3 (nome e quantidade) ---");
        System.out.print("Nome do produto: ");
        String nome3 = sc.nextLine();
        System.out.print("Quantidade inicial: ");
        int qtd3 = sc.nextInt();
        sc.nextLine();
        ProdutoEncapsulado p3 = new ProdutoEncapsulado(nome3, qtd3);

        System.out.println("Código gerado automaticamente: " + p3.getCodigo());
        System.out.println("--- Completando dados de P3 via 'inserir' ---");
        System.out.print("Tipo do produto: ");
        String tipo3 = sc.nextLine();
        System.out.print("Valor do produto: ");
        double valor3 = sc.nextDouble();
        sc.nextLine();
        p3.inserir(nome3, qtd3, tipo3, valor3);


        // ─────────────────────────────────────────
        // P4 - Criado com todos os dados de uma vez
        // Código gerado automaticamente: 004
        // ─────────────────────────────────────────
        System.out.println("\n--- Cadastro P4 (todos os dados de uma vez) ---");
        System.out.print("Nome do produto: ");
        String nome4 = sc.nextLine();
        System.out.print("Quantidade inicial: ");
        int qtd4 = sc.nextInt(); sc.nextLine();
        System.out.print("Tipo do produto: ");
        String tipo4 = sc.nextLine();
        System.out.print("Valor do produto: ");
        double valor4 = sc.nextDouble(); sc.nextLine();
        ProdutoEncapsulado p4 = new ProdutoEncapsulado(nome4, qtd4, tipo4, valor4);
        System.out.println("Código gerado automaticamente: " + p4.getCodigo());


        // ═══════════════════════════════════════════════
        //         OPERAÇÕES EM CADA PRODUTO
        // ═══════════════════════════════════════════════

        ProdutoEncapsulado[] produtos = {p1, p2, p3, p4};

        for (int i = 0; i < produtos.length; i++) {
            ProdutoEncapsulado p = produtos[i];
            int numero = i + 1;

            System.out.println("\n========================================");
            System.out.println("       OPERAÇÕES NO PRODUTO P" + numero);
            System.out.println("========================================");

            // Consulta inicial via toString
            System.out.println("\n[CONSULTA INICIAL]");
            System.out.println(p.consultar());

            // Demonstração dos getters
            System.out.println("\n[LENDO DADOS VIA GETTERS]");
            System.out.println("Código:    " + p.getCodigo());
            System.out.println("Nome:      " + p.getNomeProduto());
            System.out.println("Tipo:      " + p.getTipo());
            System.out.println("Valor:     R$ " + p.getValorProduto());
            System.out.println("Estoque:   " + p.getQuantidade());

            // Demonstração dos setters — corrigindo nome e valor
            System.out.println("\n[ALTERANDO DADOS VIA SETTERS]");
            System.out.print("Novo nome para P" + numero + " (ou Enter para manter): ");
            String novoNome = sc.nextLine();
            if (!novoNome.isBlank()) {
                p.setNomeProduto(novoNome);
                System.out.println("Nome atualizado para: " + p.getNomeProduto());
            }

            System.out.print("Novo valor para P" + numero + " (0 para manter): ");
            double novoValorSetter = sc.nextDouble(); sc.nextLine();
            if (novoValorSetter > 0) {
                p.setValorProduto(novoValorSetter);
                System.out.println("Valor atualizado para: R$ " + p.getValorProduto());
            }

            // Vender
            System.out.println("\n[VENDA]");
            System.out.print("Quantos itens deseja vender de P" + numero + "? ");
            int qtdVender = sc.nextInt(); sc.nextLine();
            p.vender(qtdVender);

            // Comprar sem alterar valor
            System.out.println("\n[COMPRA SEM ALTERAR VALOR]");
            System.out.print("Quantos itens deseja repor no estoque de P" + numero + "? ");
            int qtdRepor = sc.nextInt(); sc.nextLine();
            p.comprar(qtdRepor);

            // Comprar com novo valor
            System.out.println("\n[COMPRA COM NOVO VALOR]");
            System.out.print("Quantos itens deseja adicionar com novo valor em P" + numero + "? ");
            int qtdReporValor = sc.nextInt(); sc.nextLine();
            System.out.print("Novo valor do produto: ");
            double novoValor = sc.nextDouble(); sc.nextLine();
            p.comprar(qtdReporValor, novoValor);

            // Consulta final via toString
            System.out.println("\n[CONSULTA FINAL]");
            System.out.println(p.consultar());

            // Comparações com os demais produtos
            System.out.println("\n[COMPARAÇÕES DE P" + numero + " COM OS DEMAIS]");
            for (int j = 0; j < produtos.length; j++) {
                if (i != j) {
                    boolean iguais = p.igual(produtos[j]);
                    System.out.println("P" + numero + " e P" + (j + 1) +
                            " têm mesmo nome e tipo? " + (iguais ? "Sim" : "Não"));
                }
            }
        }

        System.out.println("\n========================================");
        System.out.println("     OBRIGADO POR USAR O SISTEMA!       ");
        System.out.println("========================================");

        sc.close();
    }
}