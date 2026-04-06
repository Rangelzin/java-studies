package LaboratorioHeranca;

public class Serie extends ProgramaTV {
    private int temporadas;
    private int episódios;

    Serie(String nome, String categoria,int temp, int eps) {
        super(nome, categoria);
        this.temporadas = temp;
        this.episódios = eps;
    }

    @Override
    public String toString() {
        return super.toString() + "Temporadas: " + temporadas + " | Episódios: " + episódios + "\n";
    }
}
