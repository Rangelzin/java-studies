package Condicionais;

public class LaçosDeRepetição {
    public static void main(String[] args) {
        /* *
        *  Laços de Repetição: repetir infinitamente ou até voce desejar
        *  While = For
        * */

        // While
        int numeroDeClones = 0;
        int numeroMaxClone = 40;

        //  while (numeroDeClones <= numeroMaxClone) {
        //      System.out.println("O naruto fez um clone das sombras " + numeroDeClones);
        //      numeroDeClones++;
        //  }

        // For
        for (int i = 0; i <= numeroMaxClone ; i++) {
            System.out.println("O naruto está se clonando e ja clonou " + i + " vezes");
        }
    }
}
