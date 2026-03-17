package ExerciciosAula.Ex1;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa pv1 = new Pessoa("Roberto","Masculino","62999998888",19);
        Pessoa pv2 = new Pessoa("Luzia","Feminino","62988886666",22);
        Pessoa pv3 = new Pessoa("Fabiano","Masculino","62999998888",33);

        System.out.println("\nIniciando sistema v1!!!\n");
        System.out.println(pv1.toString());
        System.out.println(pv2.toString());
        System.out.println(pv3.toString());
    }
}
