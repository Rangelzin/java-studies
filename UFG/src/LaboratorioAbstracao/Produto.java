package LaboratorioAbstracao;

public class Produto {
    // Variaveis usadas
    public String codigo;
    public String nome_produto;
    public int quantidade;
    public String tipo;
    public double valor_produto;

    // Construtores
    public Produto(String codigo) {
        this.codigo = codigo;
    }
    public Produto(String codigo, String nome_produto) {
        this.codigo = codigo;
        this.nome_produto = nome_produto;
    }
    public Produto(String codigo, String nome_produto, int quantidade) {
        this.codigo = codigo;
        this.nome_produto = nome_produto;
        this.quantidade = quantidade;
    }
    public Produto(String codigo, String nome_produto, int quantidade, String tipo, double valor_produto) {
        this.codigo = codigo;
        this.nome_produto = nome_produto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor_produto = valor_produto;
    }


    // Operações/Métodos
    public void VenderProduto(int quantidade) {
        if (quantidade > this.quantidade) {
            System.out.println("O estoque do produto: " + this.nome_produto + ", não possui estoque para essa quantidade!");
        } else {

            this.quantidade -= quantidade;
            double valor_venda = quantidade * this.valor_produto;

            System.out.println("O ProdutoEncapsulado: " + this.nome_produto + ", preço total vendido: " + valor_venda);
        }
    }

    public void ComprarNovoValor(int quantidade, double novo_valor) {
        this.quantidade += quantidade;
        this.valor_produto = novo_valor;
    }

    public void ComprarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public String toString() {
        return String.format("Cod: %s | Nome: %s | Tipo: %s | Valor: %.2f | Estoque: %d",
                codigo, nome_produto, tipo, valor_produto, quantidade);
    }

    public void InserirProduto(String nome, int quantidade,String tipo, double valor_produto){
        this.nome_produto = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor_produto = valor_produto;
    }

    public boolean EqualsProduto(Produto outroProduto) {
        if(outroProduto == null) return false;

        return this.nome_produto.equals(outroProduto.nome_produto) &&
                this.tipo.equals(outroProduto.tipo);
    }
}
