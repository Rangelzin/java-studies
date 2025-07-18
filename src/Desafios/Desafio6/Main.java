package Desafios.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma linkedList
        LinkedList<Ninja> Ninjas = new LinkedList<>();

        // Add 7 ninjas incialmente
        Ninjas.add(new Ninja("Naruto Uzumaki", "Konoha",30));
        Ninjas.add(new Ninja("Sasuke Uchiha", "Konoha",31));
        Ninjas.add(new Ninja("Sakura Haruno", "Konoha",29));
        Ninjas.add(new Ninja("Hinata Hyuga", "Konoha",29));
        Ninjas.add(new Ninja("Shikamaru Nara", "Konoha",33));
        Ninjas.add(new Ninja("Madara Uchiha", "Konoha",120));
        Ninjas.add(new Ninja("Itachi Uchiha", "Konoha",45));

        // listar ninjas
        System.out.println("\n========================= LISTAGEM  ======================");
        for (Ninja ninja : Ninjas) {
            System.out.println(ninja);
        }
        System.out.println("==========================================================\n");

        //adionar um ninja no inicio da lista
        Ninjas.addFirst(new Ninja("Kakashi Hatake", "Konoha",48));

        //remover um ninjas no inicio da lista
        System.out.println("====================== REMOVER NINJA =====================");
        Ninja removido = Ninjas.removeFirst();
        System.out.println(removido);
        System.out.println("==========================================================\n");

        System.out.println("===================== MUNDAÇAS NINJA ====================");
        for (Ninja ListagemAtualizada : Ninjas) {
            System.out.println(ListagemAtualizada);
        }
        System.out.println("==========================================================\n");

        System.out.println("================ PROCURAR NINJA POR INDICE ===============");
        Ninja NinjaIndice = Ninjas.get(3);
        System.out.println(NinjaIndice);
        System.out.println("==========================================================\n");

    }
}
