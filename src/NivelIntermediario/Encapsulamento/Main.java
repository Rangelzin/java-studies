package NivelIntermediario.Encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n------------------------ ArraysList ------------------------\n");
            // Listas NÃO são estáticas e MUDAM DE TAMANHO
            List<String> ninjasList = new ArrayList<>();
            ninjasList.add("Naruto Uzumaki");
            ninjasList.add("Sasuke Uchiha");
            ninjasList.add("Sakura Haruno");
            ninjasList.add("Madara Uchiha");

                // Adcionar elementos
                ninjasList.add("Kakashi Hatake");
                // Remover elementos
                ninjasList.remove("Kakashi Hatake");
                // Trocar elementos
                ninjasList.set(3,"Hashirama Senju");
                // Ver tamanho da lista
                System.out.println("Tamanho da lista = " + ninjasList.size());

            System.out.println("Printando arrayList: " + ninjasList);

            // Arrays são estáticos e NÃO MUDAM DE TAMANHO
            String[] ninjasArray = new String[3];
            ninjasArray[0] = "Naruto";
            ninjasArray[1] = "Sasuke";
            ninjasArray[2] = "Sakura";
            System.out.println("Printando array: " + ninjasArray[0]);

        System.out.println("\n------------------------ Missoes ------------------------\n");

            Missoes missao1 = new Missoes("Resgatar Cachorro", RankDeMissoes.D);
            Missoes missao2 = new Missoes("Derrotar Zabuza", RankDeMissoes.A);
            missao1.exibirDetalhes();
            missao2.exibirDetalhes();

        System.out.println("\n------------------------ Naruto Uzumaki ------------------------\n");

            Uzumaki naruto = new Uzumaki("Naruto","Konoha",17,30,1.70);
            System.out.println("Meu nome é: " + naruto.getNome());
            naruto.setNome("Naruto Uzumaki");
            System.out.println("Meu NOVO nome é: " + naruto.getNome());

        System.out.println("\n------------------------ Sasuke Uchiha ------------------------\n");
    }
}
