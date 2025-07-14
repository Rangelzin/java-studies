package NivelIntermediario.POOIntermediario;

public class Main {
    public static void main(String[] args) {
        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 45;
        Hashirama.sabedoriaHokage();

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Konoha";
        Naruto.idade = 16;

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Konoha";
        Sasuke.idade = 17;

        Naruto.habilidadeEspecial();
        Naruto.estrategiaDeBatalhaNinja();

        Uchiha Itachi = new Uchiha("Itachi Uchiha", "Konoha", 27);
        Itachi.habilidadeEspecial();
    }
}
