package Provas.P2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        System.out.println("=== Cadastro de Usuários, Eventos e Palestras ===\n");

        System.out.print("Quantos usuários deseja cadastrar? ");
        int numUsuarios = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numUsuarios; i++) {
            System.out.println("\n--- Cadastro do Usuário " + (i + 1) + " ---");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            Usuario usuario = new Usuario(nome, email, senha);

            System.out.print("Quantos eventos este usuário participou? ");
            int numEventos = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < numEventos; j++) {
                System.out.println("\n--- Cadastro do Evento " + (j + 1) + " ---");

                System.out.print("Descrição do evento: ");
                String descricao = sc.nextLine();

                System.out.print("Data de início: ");
                String dataInicio = sc.nextLine();

                System.out.print("Data de fim: ");
                String dataFim = sc.nextLine();

                System.out.print("É um evento patrocinado? (s/n): ");
                String patrocinado = sc.nextLine().toLowerCase();

                Evento evento;
                if (patrocinado.equals("s")) {
                    System.out.print("Nome do patrocinador: ");
                    String nomePatrocinador = sc.nextLine();

                    System.out.print("Valor do patrocínio: ");
                    double valor = Double.parseDouble(sc.nextLine());

                    evento = new EventoPatrocinado(descricao, dataInicio, dataFim, nomePatrocinador, valor);
                } else {
                    evento = new Evento(descricao, dataInicio, dataFim);
                }

                System.out.print("Quantas palestras este usuário assistiu neste evento? ");
                int numPalestras = Integer.parseInt(sc.nextLine());

                for (int k = 0; k < numPalestras; k++) {
                    System.out.println("\n--- Cadastro da Palestra " + (k + 1) + " ---");

                    System.out.print("Nome da palestra: ");
                    String nomePalestra = sc.nextLine();

                    System.out.print("Data da palestra: ");
                    String dataPalestra = sc.nextLine();

                    System.out.print("Hora inicial: ");
                    String horaInicial = sc.nextLine();

                    System.out.print("Hora final: ");
                    String horaFinal = sc.nextLine();

                    System.out.print("Comentário (opcional): ");
                    String comentario = sc.nextLine();

                    Palestra palestra = new Palestra(nomePalestra, dataPalestra, horaInicial, horaFinal, comentario);
                    evento.adicionarPalestra(palestra);
                }

                usuario.adicionarEvento(evento);
            }

            usuarios.add(usuario);
        }

        sc.close();

        System.out.println("\n\n=== Usuários Cadastrados ===\n");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
