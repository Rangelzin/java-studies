package LaboratorioGeral.Ex6;

public class CD extends Item {
    private String artista;
    private int quantidadeFaixas;

    public CD(String titulo, int ano, int tempoDuracao, String comentarios, String artista, int quantidadeFaixas) {
        super(titulo, ano, tempoDuracao, comentarios);
        this.artista = artista;
        this.quantidadeFaixas = quantidadeFaixas;
    }

    @Override
    public String mostrarDadosEspecificos() {
        return ", Artista: " + artista + ", Faixas: " + quantidadeFaixas;
    }

    // Getters específicos
    public String getArtista() { return artista; }
    public int getQuantidadeFaixas() { return quantidadeFaixas; }
}