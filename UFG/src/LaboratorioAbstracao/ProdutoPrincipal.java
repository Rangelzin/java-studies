package LaboratorioAbstracao;

import java.util.Scanner;
import java.util.Locale;

public class ProdutoPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("========================================");
        System.out.println("       BEM VINDO AO SISTEMA DE LOJA     ");
        System.out.println("========================================");


        // ─────────────────────────────────────────
        // P1 - Criado apenas com o código
        // Depois os dados são preenchidos via inserir
        // ─────────────────────────────────────────
        System.out.println("\n--- Cadastro P1 (somente código por enquanto) ---");
        System.out.print("Digite o código do P1: ");
        String cod1 = sc.nextLine();
        Produto p1 = new Produto(cod1);

        System.out.println("\n--- Atualizando os dados de P1 via método 'inserir' ---");
        System.out.print("Nome do produto: ");
        String nome1 = sc.nextLine();
        System.out.print("Quantidade inicial em estoque: ");
        int qtd1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Tipo do produto: ");
        String tipo1 = sc.nextLine();
        System.out.print("Valor do produto (ex: 99.90): ");
        double valor1 = sc.nextDouble();
        sc.nextLine();
        p1.InserirProduto(nome1, qtd1, tipo1, valor1);


        // ─────────────────────────────────────────
        // P2 - Criado com código e nome
        // ─────────────────────────────────────────
        System.out.println("\n--- Cadastro P2 (código e nome) ---");
        System.out.print("Código: ");
        String cod2 = sc.nextLine();
        System.out.print("Nome do produto: ");
        String nome2 = sc.nextLine();
        Produto p2 = new Produto(cod2, nome2);

        // P2 não tem tipo/valor ainda, então vamos inserir também para poder operar
        System.out.println("--- Completando dados de P2 via 'inserir' ---");
        System.out.print("Quantidade inicial: ");
        int qtd2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Tipo do produto: ");
        String tipo2 = sc.nextLine();
        System.out.print("Valor do produto: ");
        double valor2 = sc.nextDouble();
        sc.nextLine();
        p2.InserirProduto(nome2, qtd2, tipo2, valor2);


        // ─────────────────────────────────────────
        // P3 - Criado com código, nome e quantidade
        // ─────────────────────────────────────────
        System.out.println("\n--- Cadastro P3 (código, nome e quantidade) ---");
        System.out.print("Código: ");
        String cod3 = sc.nextLine();
        System.out.print("Nome do produto: ");
        String nome3 = sc.nextLine();
        System.out.print("Quantidade inicial: ");
        int qtd3 = sc.nextInt();
        sc.nextLine();
        Produto p3 = new Produto(cod3, nome3, qtd3);

        // Completando dados de P3 para poder operar
        System.out.println("--- Completando dados de P3 via 'inserir' ---");
        System.out.print("Tipo do produto: ");
        String tipo3 = sc.nextLine();
        System.out.print("Valor do produto: ");
        double valor3 = sc.nextDouble();
        sc.nextLine();
        p3.InserirProduto(nome3, qtd3, tipo3, valor3);


        // ─────────────────────────────────────────
        // P4 - Criado com todos os dados de uma vez
        // ─────────────────────────────────────────
        System.out.println("\n--- Cadastro P4 (todos os dados de uma vez) ---");
        System.out.print("Código: ");
        String cod4 = sc.nextLine();
        System.out.print("Nome do produto: ");
        String nome4 = sc.nextLine();
        System.out.print("Quantidade inicial: ");
        int qtd4 = sc.nextInt();
        sc.nextLine();
        System.out.print("Tipo do produto: ");
        String tipo4 = sc.nextLine();
        System.out.print("Valor do produto: ");
        double valor4 = sc.nextDouble();
        sc.nextLine();
        Produto p4 = new Produto(cod4, nome4, qtd4, tipo4, valor4);


        // ═══════════════════════════════════════════════
        //         OPERAÇÕES EM CADA PRODUTO
        // ═══════════════════════════════════════════════

        Produto[] produtos = {p1, p2, p3, p4};

        for (int i = 0; i < produtos.length; i++) {
            Produto p = produtos[i];
            int numero = i + 1;

            System.out.println("\n========================================");
            System.out.println("       OPERAÇÕES NO PRODUTO P" + numero);
            System.out.println("========================================");

            // Consultar estado atual
            System.out.println("\n[CONSULTA INICIAL]");
            System.out.println(p.toString());

            // Vender
            System.out.println("\n[VENDA]");
            System.out.print("Quantos itens deseja vender de P" + numero + "? ");
            int vender = sc.nextInt();
            sc.nextLine();
            p.VenderProduto(vender);

            // Comprar só quantidade
            System.out.println("\n[COMPRA SEM ALTERAR VALOR]");
            System.out.print("Quantos itens deseja repor no estoque de P" + numero + "? ");
            int repor = sc.nextInt();
            sc.nextLine();
            p.ComprarQuantidade(repor);
            System.out.println("Estoque reabastecido com " + repor + " unidade(s).");

            // Comprar com novo valor
            System.out.println("\n[COMPRA COM NOVO VALOR]");
            System.out.print("Quantos itens deseja adicionar ao estoque de P" + numero + " (com novo valor)? ");
            int reporValor = sc.nextInt();
            sc.nextLine();
            System.out.print("Novo valor do produto: ");
            double novoValor = sc.nextDouble();
            sc.nextLine();
            p.ComprarNovoValor(reporValor, novoValor);
            System.out.println("Estoque e valor atualizados com sucesso.");

            // Consultar estado final
            System.out.println("\n[CONSULTA FINAL]");
            System.out.println(p.toString());

            // Comparar com os outros produtos
            System.out.println("\n[COMPARAÇÕES DE P" + numero + " COM OS DEMAIS]");
            for (int j = 0; j < produtos.length; j++) {
                if (i != j) {
                    boolean iguais = p.EqualsProduto(produtos[j]);
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