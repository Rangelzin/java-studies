package LaboratorioEncapsulamento;


public class ProdutoEncapsulado {
    private static int contadorCodigo = 1;

    // Atributos privados
    private String codigo;
    private String nomeProduto;
    private int quantidade;
    private String tipo;
    private double valorProduto;

    // ─────────────────────────────────────────
    // Getters e Setters
    // ─────────────────────────────────────────
    public String getCodigo() {
        return codigo;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public String getTipo() {
        return tipo;
    }
    public double getValorProduto() {
        return valorProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    // ─────────────────────────────────────────
    // Construtores — código gerado automaticamente
    // ─────────────────────────────────────────
    public ProdutoEncapsulado() {
        this.codigo = gerarCodigo();
    }
    public ProdutoEncapsulado(String nomeProduto) {
        this.codigo = gerarCodigo();
        this.nomeProduto = nomeProduto;
    }
    public ProdutoEncapsulado(String nomeProduto, int quantidade) {
        this.codigo = gerarCodigo();
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }
    public ProdutoEncapsulado(String nomeProduto, int quantidade, String tipo, double valorProduto) {
        this.codigo = gerarCodigo();
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valorProduto = valorProduto;
    }

    // ─────────────────────────────────────────
    // Método privado que gera o código sequencial
    // ─────────────────────────────────────────
    private static String gerarCodigo() {
        return String.format("%03d", contadorCodigo++);
    }

    // ─────────────────────────────────────────
    // Operações
    // ─────────────────────────────────────────
    public void vender(int quantidade) {
        if (quantidade >= this.quantidade) {
            System.out.println("Estoque insuficiente para \"" + nomeProduto + "\"! " +
                    "Disponível: " + this.quantidade + " unidade(s).");
        } else {
            this.quantidade -= quantidade;
            double totalVenda = quantidade * valorProduto;
            System.out.printf("Venda realizada! Produto: %s | Qtd: %d | Total: R$ %.2f%n",
                    nomeProduto, quantidade, totalVenda);
        }
    }

    public void comprar(int quantidade, double novoValor) {
        this.quantidade += quantidade;
        this.valorProduto = novoValor;
        System.out.printf("Compra realizada! Produto: %s | Qtd adicionada: %d | Novo valor: R$ %.2f%n",
                nomeProduto, quantidade, novoValor);
    }

    public void comprar(int quantidade) {
        this.quantidade += quantidade;
        System.out.printf("Estoque reabastecido! Produto: %s | Qtd adicionada: %d%n",
                nomeProduto, quantidade);
    }

    public void inserir(String nomeProduto, int quantidade, String tipo, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valorProduto = valorProduto;
    }

    public boolean igual(ProdutoEncapsulado outro) {
        if (outro == null) return false;
        return this.nomeProduto.equals(outro.getNomeProduto()) &&
                this.tipo.equals(outro.getTipo());
    }

    public String consultar() {
        return String.format("Cod: %s | Nome: %s | Tipo: %s | Valor: R$ %.2f | Estoque: %d",
                codigo, nomeProduto, tipo, valorProduto, quantidade);
    }
}