package NivelBásico;

public class Arrays {
    public static void main(String[] args) {

        // Arrays sao tipos referencias
        // Arrays tipo string como null
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Boruto Uzumaki";
        ninja[3] = "Sarada Uchiha";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[2]);
        System.out.println();

        // Redeclarar o ARRAY
        ninja = new String [7];
        ninja [0] = "Hashirama Senju";
        ninja [1] = "Tobirama Seniu";
        ninja [2] = "Hiruzen Sarutobi";
        ninja [3] = "Minato Namikaze";
        ninja [4] = "Tsunade Senju";
        ninja [5] = "Kakashi Hatake";
        ninja [6] = "Naruto Uzumaki";

        // For para fazer  um LOOP no array
        for (int i = 0; i < 7; i++) {
            System.out.println(i+1 + " - "+ ninja[i]);
        }

        // Arrays int como 0
        int[] idade = new int[1];
        System.out.println(idade[0]);

        // Arrays boolean como false
        boolean[] TrueFalse = new boolean[1];
        System.out.println(TrueFalse[0]);

        // Arrays flutuante como 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);


    }
}
