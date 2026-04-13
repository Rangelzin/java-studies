package LaboratorioGeral.Ex3;

public class ControleRemoto {

    public static void main(String[] args) {
        // Instanciar uma televisão
        Televisao tv = new Televisao();

        // Mostrar estado inicial da TV
        System.out.println("Estado inicial:");
        System.out.println(tv.toString());
        System.out.println();

        // Alterar o canal
        tv.trocarCanal(5);
        System.out.println("Após trocar para canal 5:");
        System.out.println(tv.toString());
        System.out.println();

        // Aumentar o volume
        tv.aumentarVolume();
        System.out.println("Após aumentar volume:");
        System.out.println(tv.toString());
        System.out.println();

        // Aumentar o volume novamente
        tv.aumentarVolume();
        System.out.println("Após aumentar volume novamente:");
        System.out.println(tv.toString());
        System.out.println();

        // Diminuir o volume
        tv.diminuirVolume();
        System.out.println("Após diminuir volume:");
        System.out.println(tv.toString());
        System.out.println();

        // Trocar para outro canal
        tv.trocarCanal(10);
        System.out.println("Após trocar para canal 10:");
        System.out.println(tv.toString());
    }
}