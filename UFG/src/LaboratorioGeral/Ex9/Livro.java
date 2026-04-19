package LaboratorioGeral.Ex9;

import java.util.LinkedHashMap;
import java.util.Map;

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
    private static Map<String, Integer> contadorGeneros = new LinkedHashMap<>();

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
        if (this.genero != null && contadorGeneros.containsKey(this.genero)) {
            int totalAnterior = contadorGeneros.get(this.genero) - 1;
            if (totalAnterior <= 0) {
                contadorGeneros.remove(this.genero);
            } else {
                contadorGeneros.put(this.genero, totalAnterior);
            }
        }

        this.genero = genero;

        if (genero != null && !genero.isBlank()) {
            if (contadorGeneros.containsKey(genero)) {
                contadorGeneros.put(genero, contadorGeneros.get(genero) + 1);
            } else if (contadorGeneros.size() < 5) {
                contadorGeneros.put(genero, 1);
            }
        }
    }

    public static int getTotalLivros() { return totalLivros; }
    public static Map<String, Integer> getTotaisPorGenero() {
        return contadorGeneros;
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