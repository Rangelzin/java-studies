package LaboratorioGeral.Ex6;

public class Jogo extends Item {
    private int numeroJogadores;
    private String plataforma;

    public Jogo(String titulo, int ano, int tempoDuracao, String comentarios, int numeroJogadores, String plataforma) {
        super(titulo, ano, tempoDuracao, comentarios);
        this.numeroJogadores = numeroJogadores;
        this.plataforma = plataforma;
    }

    @Override
    public String mostrarDadosEspecificos() {
        return ", Jogadores: " + numeroJogadores + ", Plataforma: " + plataforma;
    }

    // Método específico para retornar a plataforma
    public String getPlataforma() {
        return plataforma;
    }

    // Getters específicos
    public int getNumeroJogadores() { return numeroJogadores; }
}