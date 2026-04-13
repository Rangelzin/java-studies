package LaboratorioGeral.Ex8;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO DE HORÁRIOS ===");

        Horario horario1 = null;
        Horario horario2 = null;

        // Primeiro horário
        while (horario1 == null) {
            try {
                System.out.println("\nPrimeiro horário:");
                System.out.print("Hora (0-23): ");
                int h1 = scanner.nextInt();
                System.out.print("Minuto (0-59): ");
                int m1 = scanner.nextInt();
                System.out.print("Segundo (0-59): ");
                int s1 = scanner.nextInt();

                horario1 = new Horario(h1, m1, s1);
                System.out.println("Horário 1 válido: " + horario1);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + ". Tente novamente.");
                scanner.nextLine(); // Limpar buffer
            }
        }

        // Segundo horário
        while (horario2 == null) {
            try {
                System.out.println("\nSegundo horário:");
                System.out.print("Hora (0-23): ");
                int h2 = scanner.nextInt();
                System.out.print("Minuto (0-59): ");
                int m2 = scanner.nextInt();
                System.out.print("Segundo (0-59): ");
                int s2 = scanner.nextInt();

                horario2 = new Horario(h2, m2, s2);
                System.out.println("Horário 2 válido: " + horario2);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + ". Tente novamente.");
                scanner.nextLine(); // Limpar buffer
            }
        }

        scanner.close();

        // Mostrar resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Horário 1: " + horario1.getHorarioCompleto());
        System.out.println("Horário 2: " + horario2.getHorarioCompleto());

        int diferenca = Horario.diferencaEmMinutos(horario1, horario2);
        System.out.println("Diferença entre os horários: " + diferenca + " minutos");

        // Testar alguns métodos
        System.out.println("\n=== TESTES ADICIONAIS ===");
        System.out.println("Hora do primeiro horário: " + horario1.getHora());
        System.out.println("Minuto do segundo horário: " + horario2.getMinuto());

        // Testar alteração
        horario1.setMinuto(30);
        System.out.println("Horário 1 após alterar minuto para 30: " + horario1);
    }
}