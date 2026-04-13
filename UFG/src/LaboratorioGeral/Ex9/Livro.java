package LaboratorioGeral.Ex9;

public class Livro {
    private String titulo;
    private int codigo;
    private Pessoa autor;
    private String editora;
    private String edicao;
    private int ano;
    private String local;
    private String genero;
    private static int totalLivros = 0;
    private static int[] contadorGeneros = new int[5]; // Para até 5 gêneros diferentes

    public Livro(int codigo, String titulo, Pessoa autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        totalLivros++;
    }

    // Métodos get e set
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public Pessoa getAutor() { return autor; }
    public void setAutor(Pessoa autor) { this.autor = autor; }

    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }

    public String getEdicao() { return edicao; }
    public void setEdicao(String edicao) { this.edicao = edicao; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) {
        this.genero = genero;
        // Contar por gênero (simplificado)
        if (genero != null) {
            for (int i = 0; i < contadorGeneros.length; i++) {
                if (contadorGeneros[i] == 0) {
                    contadorGeneros[i] = 1;
                    break;
                }
            }
        }
    }

    public static int getTotalLivros() { return totalLivros; }
    public static int getTotalPorGenero(int index) {
        return index < contadorGeneros.length ? contadorGeneros[index] : 0;
    }

    public String getReferencia() {
        return autor.getNomeFormatado() + " " + titulo + ". " + edicao + ". " + local + ": " + editora + ", " + ano + ".";
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
               "\nTítulo: " + titulo +
               "\nGênero: " + genero +
               "\nReferência: " + getReferencia();
    }
}