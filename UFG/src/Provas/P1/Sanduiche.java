package Provas.P1;

public class Sanduiche {
    // Nome e valor
    private String nome;
    private double valor;

    // Tabela nutricional;
    private double qtd_calorias;
    private double g_carboidratos;
    private double g_fibras;
    private double g_proteínas;
    private double g_gorduras;

    // Construtores
    public Sanduiche() {}
    public Sanduiche(String nome, double valor, double qtd_calorias, double g_carboidratos, double g_fibras, double g_proteínas, double g_gorduras) {
        this.nome = nome;
        this.valor = valor;
        this.qtd_calorias = qtd_calorias;
        this.g_carboidratos = g_carboidratos;
        this.g_fibras = g_fibras;
        this.g_proteínas = g_proteínas;
        this.g_gorduras = g_gorduras;
    }
    public Sanduiche(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    // Getters
    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }
    public double getQtd_calorias() {
        return qtd_calorias;
    }
    public double getG_carboidratos() {
        return g_carboidratos;
    }
    public double getG_fibras() {
        return g_fibras;
    }
    public double getG_proteínas() {
        return g_proteínas;
    }
    public double getG_gorduras() {
        return g_gorduras;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setQtd_calorias(double qtd_calorias) {
        this.qtd_calorias = qtd_calorias;
    }
    public void setG_carboidratos(double g_carboidratos) {
        this.g_carboidratos = g_carboidratos;
    }
    public void setG_fibras(double g_fibras) {
        this.g_fibras = g_fibras;
    }
    public void setG_proteínas(double g_proteínas) {
        this.g_proteínas = g_proteínas;
    }
    public void setG_gorduras(double g_gorduras) {
        this.g_gorduras = g_gorduras;
    }

    // Métodos
    public String trazerTabelaNutricional() {
        return "\nTabela nutricional do Sanduiche: \n" +
                "| qtd_calorias = " + qtd_calorias + " kcal\t|\n" +
                "| g_carboidratos = " + g_carboidratos + "g\t\t|\n" +
                "| g_fibras = " + g_fibras + "g\t\t\t|\n" +
                "| g_proteínas = " + g_proteínas + "g\t\t|\n" +
                "| g_gorduras = " + g_gorduras + "g\t\t\t|\n";
    }

    public double valorTotalSanduiche(int taxaDeServico) {
        if (taxaDeServico < 0) {return this.valor;}
            return this.valor + taxaDeServico;
        }
    }
