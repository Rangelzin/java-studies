package LaboratorioGeral.Ex10;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO INDIVIDUAL DE MORADORES ===");

        while (true) {
            System.out.println("\nDigite os dados do morador:");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Celular: ");
            String celular = scanner.nextLine();

            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();

            System.out.print("Sexo: ");
            String sexo = scanner.nextLine();

            System.out.print("Bloco: ");
            String bloco = scanner.nextLine();

            System.out.print("Apartamento: ");
            String apartamento = scanner.nextLine();

            System.out.print("Código de Acesso: ");
            String codigoAcesso = scanner.nextLine();

            // Criar morador
            Morador morador = new Morador(nome, cpf, celular, dataNascimento, sexo, bloco, apartamento, codigoAcesso);

            // Mostrar dados do morador criado
            System.out.println("\nMorador cadastrado com sucesso!");
            System.out.println(morador.toString());

            // Perguntar se deseja cadastrar mais
            System.out.print("Deseja cadastrar outro morador? (s/n): ");
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Cadastro finalizado!");
    }
}