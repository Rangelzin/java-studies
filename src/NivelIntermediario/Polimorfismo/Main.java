package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------ Hashirama Senju ------------------------\n");

        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 45;
        Hashirama.sabedoriaHokage();
        System.out.println();

        System.out.println("------------------------ Naruto Uzumaki ------------------------\n");

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki","Konoha",26, 100, RankNinja.GENIN);
        Naruto.habilidadeEspecial();
        Naruto.estrategiaDeBatalhaNinja();
        System.out.println();

        System.out.println("------------------------ Sasuke Uchiha ------------------------\n");

        Uchiha Sasuke = new Uchiha("Sasuke Uchiha","Konoha",17,100,RankNinja.GENIN);
        Sasuke.ShariganAtivado();
        System.out.println();

        System.out.println("------------------------ Itachi Uchiha ------------------------\n");

        Uchiha Itachi = new Uchiha("Itachi Uchiha", "Konoha", 27,100,RankNinja.JOUNNIN);
        Itachi.habilidadeEspecial();
        System.out.println();

        System.out.println("------------------------ Kakashi Hatake ------------------------\n");

        Hatake Kakashi = new Hatake("Kakashi Hatake","Konoha",35, 190,RankNinja.JOUNNIN);
        Kakashi.BoasVindasHatake();
        Kakashi.ShariganAtivado();
        Kakashi.NinjadeElite();
        System.out.println();

        System.out.println("------------------------ Madara Uchiha ------------------------\n");

        Uchiha Madara = new Uchiha("Madara Uchiha", "Konoha", 120, 300, RankNinja.KAGE);

        Madara.inteligenciaCombate();
        Madara.inteligenciaCombate(200);
        System.out.println();

        System.out.println("--------------------------------------------------------------\n");



    }
}
