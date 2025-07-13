package NivelIntermediario;

import javax.swing.plaf.basic.BasicViewportUI;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 20;
        Naruto.aldeia = "Konoha";


        // Criar o ninja Sasuke - Sasuke é um OBJETO
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Konoha";

        // Criar o ninja Sakura - Sakura é um OBJETO
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 19;
        Sakura.aldeia = "Konoha";

        // Criar o ninja Hinata - Hinata é um OBJETO
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 19;
        Hinata.aldeia = "Konoha";

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.idade = 15;
        Boruto.aldeia = "Konoha";

        // Aplicando Metodos aos objetos
        Naruto.ModoSabioAtivado();
        Sasuke.ShariganAtivado();
        Sakura.AtivarCura();
        Hinata.ByakuganAtivado();
        Boruto.ModoSabioAtivado();
        Boruto.AtivarJougan();
        Boruto.AtivarKarma();
        System.out.println(Sasuke.EuSouUmNinja());

        int QuantoTempoFalta = Sasuke.TempoParaHokage(50);
        System.out.println("Você tem: "+ Sasuke.idade + " anos, então falta no mínimo: "  + QuantoTempoFalta + " anos para se tornar um Hokage");


    }
}
