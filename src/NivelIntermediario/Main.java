package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 20;
        Naruto.aldeia = "Konoha";

        // Criar o ninja Sasuke - Sasuke é um OBJETO
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Konoha";

        // Aplicando Metodos aos objetos
        Sasuke.ShariganAtivado();
        String ChamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(ChamandoMetodo);

        int QuantoTempoFalta = Sasuke.TempoParaHokage(50);
        System.out.println("Você tem: "+ Sasuke.idade + " anos, então falta no mínimo: "  +QuantoTempoFalta + " anos para se tornar um Hokage");

        // Criar o ninja Sakura - Sakura é um OBJETO
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 19;
        Sakura.aldeia = "Konoha";
    }
}
