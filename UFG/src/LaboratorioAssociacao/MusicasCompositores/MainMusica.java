package LaboratorioAssociacao.MusicasCompositores;

public class MainMusica {
    public static void main(String[] args) {
        // Instanciando Compositores
        Compositor comp1 = new Compositor("Freddie Mercury");
        comp1.setNacionalidade("Britânico");

        Compositor comp2 = new Compositor("David Bowie");
        comp2.setNacionalidade("Britânico");

        Compositor comp3 = new Compositor("Renato Russo");
        comp3.setNacionalidade("Brasileiro");

        // Instanciando Músicas e fazendo os vínculos
        Musica mus1 = new Musica("Under Pressure");
        mus1.setAno(1981);
        mus1.setTipo("Rock");
        mus1.adicionarCompositor(comp1);
        mus1.adicionarCompositor(comp2); // Música com dois compositores

        Musica mus2 = new Musica("Tempo Perdido");
        mus2.setAno(1986);
        mus2.setTipo("Rock Nacional");
        mus2.adicionarCompositor(comp3);

        // Mostrando os resultados
        System.out.println("--- LISTA DE MÚSICAS ---");
        System.out.println(mus1);
        System.out.println(mus2);
    }
}