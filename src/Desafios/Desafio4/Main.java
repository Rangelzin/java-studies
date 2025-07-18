package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Naruto = new NinjaBasico("Naruto Uzumaki","Konoha",TipoHabilidade.NINJUTSU,19);
        NinjaAvançado Kakashi = new NinjaAvançado("Kakashi Hatake","Konoha", TipoHabilidade.DOUJUTSU, "Sharigan",35);

        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();

        System.out.println("\n\n");

        Kakashi.mostrarInformacoes();
        Kakashi.executarHabilidade();
    }
}
