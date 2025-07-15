package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 45;
        Hashirama.sabedoriaHokage();

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki","Konoha",26, 100, RankNinja.GENIN);
        Naruto.habilidadeEspecial();
        Naruto.estrategiaDeBatalhaNinja();

        Uchiha Sasuke = new Uchiha("Sasuke Uchiha","Konoha",17,100,RankNinja.GENIN);
        Sasuke.ShariganAtivado();

        Uchiha Itachi = new Uchiha("Itachi Uchiha", "Konoha", 27,100,RankNinja.JOUNNIN);
        Itachi.habilidadeEspecial();

        Hatake Kakashi = new Hatake("Kakashi Hatake","Konoha",35, 190,RankNinja.JOUNNIN);
        Kakashi.BoasVindasHatake();
        Kakashi.ShariganAtivado();
        Kakashi.NinjadeElite();

        Uchiha Madara = new Uchiha("Madara Uchiha", "Konoha", 120, 300, RankNinja.KAGE);

        Madara.inteligenciaCombate();
        Madara.inteligenciaCombate(200);

    }
}
