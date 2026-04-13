package LaboratorioGeral.Ex4;

public class Principal {
    public static void main(String[] args) {
        // Instanciar 2 robôs
        Robo robo1 = new Robo(1, 100);
        Robo robo2 = new Robo(2, 150);

        System.out.println("=== ROBÔ 1 ===");
        // Operações com robô 1
        System.out.println("Estado inicial:");
        System.out.println(robo1.toString());
        System.out.println();

        robo1.ligar();
        System.out.println(robo1.toString());
        System.out.println();

        robo1.andar(5, 3);
        System.out.println(robo1.toString());
        System.out.println();

        robo1.parar();
        System.out.println(robo1.toString());
        System.out.println();

        robo1.aspirar(50);
        System.out.println(robo1.toString());
        System.out.println();

        robo1.aspirar(60); // Deve atingir o limite e desligar
        System.out.println(robo1.toString());
        System.out.println();

        System.out.println("=== ROBÔ 2 ===");
        // Operações com robô 2
        System.out.println("Estado inicial:");
        System.out.println(robo2.toString());
        System.out.println();

        robo2.ligar();
        System.out.println(robo2.toString());
        System.out.println();

        robo2.andar(10, -2);
        System.out.println(robo2.toString());
        System.out.println();

        robo2.aspirar(100);
        System.out.println(robo2.toString());
        System.out.println();

        robo2.desligar();
        System.out.println(robo2.toString());
    }
}