package NivelIntermediario.Encapsulamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

        System.out.println("\n------------------------ Generics ------------------------\n");
            EquipamentosNinjas kunai = new EquipamentosNinjas("Kunai de ferro");
            EquipamentosNinjas shuriken = new EquipamentosNinjas("Shuriken");
            EquipamentosNinjas pergaminho = new EquipamentosNinjas("Pergaminho");

            BolsaGenerica<EquipamentosNinjas> bolsaGenerica = new BolsaGenerica<>();
            bolsaGenerica.adcionarEquipamentos(kunai);
            bolsaGenerica.adcionarEquipamentos(shuriken);
            bolsaGenerica.adcionarEquipamentos(pergaminho);

            System.out.println(bolsaGenerica);

        System.out.println("\n------------------------ Stacks  ------------------------");

            Stack<String> ninjaStack = new Stack<>();
            ninjaStack.push("Naruto Uzumaki");
            ninjaStack.push("Sasuke Uchiha");
            ninjaStack.push("Sakura Haruno");

            System.out.println("Minha stack atual = " + ninjaStack);
            ninjaStack.pop();
            System.out.println("Minha stack atualizada com pop = " + ninjaStack);
            System.out.println("o proximo item da minha stack: " + ninjaStack.peek());
            System.out.println("o tamanho da minha stack: " + ninjaStack.size());




        System.out.println("\n------------------------ Fim  ------------------------");

    }

}
