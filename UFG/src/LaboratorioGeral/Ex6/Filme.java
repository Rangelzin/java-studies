package LaboratorioGeral.Ex6;

public class Filme extends Item {
    private String diretor;

    public Filme(String titulo, int ano, int tempoDuracao, String comentarios, String diretor) {
        super(titulo, ano, tempoDuracao, comentarios);
        this.diretor = diretor;
    }

    @Override
    public String mostrarDadosEspecificos() {
        return ", Diretor: " + diretor;
    }

    // Getter específico
    public String getDiretor() { return diretor; }
}