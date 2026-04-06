package LaboratorioAssociacao.MusicasCompositores;
import java.util.ArrayList;
import java.util.List;

public class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private List<Compositor> compositores = new ArrayList<>(); // Associação *

    public Musica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public int getAno() {
        return ano;
    }
    public String getTipo() {
        return tipo;
    }
    public List<Compositor> getCompositores() {
        return compositores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void adicionarCompositor(Compositor c) { this.compositores.add(c); }

    @Override
    public String toString() {
        return "Música: " + nome + " [" + tipo + ", " + ano + "] - " + compositores;
    }
}