package LaboratorioHeranca;

import java.util.ArrayList;

public class MainPrograma {
    public static void main(String[] args) {
        ArrayList <ProgramaTV> programas = new ArrayList <ProgramaTV>();

        ProgramaTV p = new ProgramaTV("O outro lado do paraíso","Novela");
        p.setDiretor(new Pessoa("Diretor 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Orgulho e Paixão","Novela");
        p.setDiretor(new Pessoa("Diretor 2", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
        programas.add(p);

        Serie s1 = new Serie("Breaking Bad", "Drama", 5, 62);
        s1.setDiretor(new Pessoa("Vince Gilligan", "Americano"));
        s1.setArtistas(new Pessoa("Bryan Cranston", "Americano")); // Walter White
        s1.setArtistas(new Pessoa("Aaron Paul", "Americano"));    // Jesse Pinkman
        s1.setArtistas(new Pessoa("Anna Gunn", "Americana"));     // Skyler White
        s1.setArtistas(new Pessoa("Giancarlo Esposito", "Americano")); // Gus Fring
        programas.add(s1);

        Serie s2 = new Serie("Friends", "Comédia", 10, 236);
        s2.setDiretor(new Pessoa("James Burrows", "Americano"));
        s2.setArtistas(new Pessoa("Jennifer Aniston", "Americana")); // Rachel
        s2.setArtistas(new Pessoa("Courteney Cox", "Americana"));    // Monica
        s2.setArtistas(new Pessoa("Lisa Kudrow", "Americana"));      // Phoebe
        s2.setArtistas(new Pessoa("Matt LeBlanc", "Americano"));     // Joey
        s2.setArtistas(new Pessoa("Matthew Perry", "Americano"));    // Chandler
        s2.setArtistas(new Pessoa("David Schwimmer", "Americano"));  // Ross
        programas.add(s2);

        System.out.println("\n---------------------------");
        for (int i=0;i<programas.size();i++) {
            System.out.println(programas.get(i));
            System.out.println("---------------------------");
        }

    }

}