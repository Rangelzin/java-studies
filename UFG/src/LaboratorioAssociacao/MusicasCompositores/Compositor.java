package LaboratorioAssociacao.MusicasCompositores;

public class Compositor {
    private String nome;
    private String nacionalidade;

    public Compositor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Compositor: " + nome + " (" + nacionalidade + ")";
    }
}