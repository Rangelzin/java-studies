package LaboratorioGeral.Ex5;

public class Filme {
    private int codigo;
    private String nome;
    private String genero;
    private int ano;
    private String autorPrincipal;
    private static int totalFilmes = 0;

    public Filme(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        totalFilmes++;
    }

    // Métodos get
    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getGenero() { return genero; }
    public int getAno() { return ano; }
    public String getAutorPrincipal() { return autorPrincipal; }
    public static int getTotalFilmes() { return totalFilmes; }

    // Métodos set
    public void setGenero(String genero) { this.genero = genero; }
    public void setAno(int ano) { this.ano = ano; }
    public void setAutorPrincipal(String autorPrincipal) { this.autorPrincipal = autorPrincipal; }

    public String toString() {
        return "Filme [Código: " + codigo +
               ", Nome: " + nome +
               ", Gênero: " + genero +
               ", Ano: " + ano +
               ", Autor Principal: " + autorPrincipal + "]";
    }
}