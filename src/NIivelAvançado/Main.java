package NIivelAvançado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NinjasStreams> ninjas = new ArrayList<>();
        ninjas.add(new NinjasStreams("Naruto Uzumaki","Konoha",16));
        ninjas.add(new NinjasStreams ("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new NinjasStreams ( "Sakura Haruno","Konoha", 18));
        ninjas.add(new NinjasStreams ("Kakashi Hatake","Konoha",  30));
        ninjas.add(new NinjasStreams ( "Gaara", "Suna",  19));
        ninjas.add(new NinjasStreams ("Temari", "Suna", 20));
        ninjas.add(new NinjasStreams ("Rock Lee", "Konoha",  21));

        System.out.println("================Filtragem==============");

        // Filtragem
        ninjas.stream()
            .filter(ninjasStreams -> ninjasStreams.getVila().equals("Konoha"))
            .forEach(System.out::println); // soutc
        ;

        System.out.println("================Ordenar================");

        // Ordenação
        ninjas.stream()
                .sorted((n1,n2)-> CharSequence.compare(n1.getNome(), n2.getNome()))
                .forEach(System.out::println); // soutc
        ;
        System.out.println("===================MAP=================");

        // Map
        ninjas.stream()
                .map(NinjasStreams::getNome)
                .forEach(System.out::println); // soutc
        ;
        System.out.println("===================MAX=================");

        // Max
        NinjasStreams ninjaOlder= ninjas.stream()
                .max((n1,n2)-> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);
        ;
        System.out.println("Ninjas filtadros pelo mais velho : "+ ninjaOlder);

    }
}
