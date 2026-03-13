package NivelFacil.Condicionais;

public class IfEElse {
    public static void main(String[] args) {
        /*
        * IF and ELSE - condicionais
        * Objetivo: Passar o ninja de nível de acordo com o numero de missoes
        **/

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String ranking;

        int idade = 10;
        boolean hokage = false;
        short numMissões = 21;


        // Condição
        if (numMissões <= 10) {
            System.out.println("Rank: Gennim");
        } else if (numMissões > 10 && numMissões <= 20) {
            System.out.println("Rank: Chunnin");
        } else{
            System.out.println("Rank: Jounin");
        }
    }
}
