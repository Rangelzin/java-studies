package Desafio1;

public class Desafio1 {
    public static void main(String[] args) {

        // Ninja1
        String N1 = "Naruto Uzumaki";
        int N1age = 13;
        String mN1name = "Selar Momoshiki";
        String mN1status = "Concluída";
        char mN1level = 'S';

        if (N1age < 15) {
            if (mN1level == 'C' || mN1level == 'D') {
                mN1status = "Concluída";
            } else {
                mN1status = "Não Concluída";
            }
        } else {
            mN1status = "Concluída";
        }

        // Ninja2
        String N2 = "Sasuke Uchiha";
        int N2age = 35;
        String mN2name = "Investigar país da chuva";
        String mN2status = "Em andamento";
        char mN2level = 'A';

        if (N2age < 15) {
            if (mN2level == 'C' || mN2level == 'D') {
                mN2status = "Concluída";
            } else {
                mN2status = "Não Concluída";
            }
        } else {
            mN2status = "Concluída";
        }

        // Ninja3
        String N3 = "Boruto Uzumaki";
        int N3age = 14;
        String mN3name = "Selar Juura";
        String mN3status = "Não Concluída";
        char mN3level = 'C';

        if (N3age < 15) {
            if (mN3level == 'C' || mN3level == 'D') {
                mN3status = "Concluída";
            } else {
                mN3status = "Não Concluída";
            }
        } else {
            mN3status = "Concluída";
        }

        System.out.println();
        System.out.println("******************************************");
        System.out.println("Ninja 1 = " + N1 + " || Idade = " + N1age);
        System.out.println("Missão: " + mN1name + " Rank: " + mN1level);
        System.out.println("Status: " + mN1status);

        System.out.println("******************************************");
        System.out.println("Ninja 2 = " + N2 + " || Idade = " + N2age);
        System.out.println("Missão: " + mN2name + " Rank: " + mN2level);
        System.out.println("Status: " + mN2status);
        System.out.println("******************************************");

        System.out.println("Ninja 3 = " + N3 + " || Idade = " + N3age);
        System.out.println("Missão: " + mN3name + " Rank: " + mN3level);
        System.out.println("Status: " + mN3status);
        System.out.println("******************************************");
    }
}
