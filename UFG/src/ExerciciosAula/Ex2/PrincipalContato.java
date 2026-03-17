package ExerciciosAula.Ex2;

public class PrincipalContato {
    public static void main(String[] args) {
        Contato contt1 = new Contato("Luiza","222.333.444-64","luzia@email.com", "62922228888");
        Contato contt2 = new Contato("Rodrigo","333.444.555-66","rodrigo@email.com", "62988711234");
        Contato contt3 = new Contato("Fabiano","111.222.333-54","fabiano@email.com", "62999998888");

        System.out.println("\nIniciando sistema dee loja, carregando contatos...!!!\n");
        System.out.println(contt1.toString());
        System.out.println(contt2.toString());
        System.out.println(contt3.toString());
    }
}
