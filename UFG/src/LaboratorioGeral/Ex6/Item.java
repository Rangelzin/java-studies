package LaboratorioGeral.Ex6;

public class Item {
    protected String titulo;
    protected int ano;
    protected int tempoDuracao;
    protected String comentarios;

    public Item(String titulo, int ano, int tempoDuracao, String comentarios) {
        this.titulo = titulo;
        this.ano = ano;
        this.tempoDuracao = tempoDuracao;
        this.comentarios = comentarios;
    }

    public String mostrarDadosComuns() {
        return "Título: " + titulo +
               ", Ano: " + ano +
               ", Duração: " + tempoDuracao + " min" +
               ", Comentários: " + comentarios;
    }

    public String mostrarDadosEspecificos() {
        return ""; // Será sobrescrito pelas subclasses
    }

    public String toString() {
        return mostrarDadosComuns() + mostrarDadosEspecificos();
    }

    // Getters
    public String getTitulo() { return titulo; }
    public int getAno() { return ano; }
    public int getTempoDuracao() { return tempoDuracao; }
    public String getComentarios() { return comentarios; }
}