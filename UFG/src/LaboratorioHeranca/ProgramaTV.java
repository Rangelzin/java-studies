package LaboratorioHeranca;

import java.util.ArrayList;

public class ProgramaTV {
    private static int sequencia = 1;

    private int codigo;
    private String nome;
    private ArrayList <Pessoa> artistas = new ArrayList <Pessoa>();
    private Pessoa diretor;
    private String categoria;

    ProgramaTV(String nome, String categoria) {
        this.codigo = sequencia++;
        this.nome = nome;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    void setDiretor(Pessoa diretor){
        this.diretor = diretor;
    }

    void setArtistas(Pessoa artista) {
        artistas.add(artista);
    }

    @Override
    public String toString() {
        String programa = codigo + " - " + nome + " (" + categoria + ")\n";
        programa = programa + "Diretor : " + diretor +"\n";
        programa = programa + "Artistas : \n";
        for (int i=0;i<artistas.size();i++) {
            programa = programa + artistas.get(i) + "\n";
        }
        return programa;
    }

}
