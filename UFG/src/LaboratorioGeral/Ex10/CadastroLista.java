package LaboratorioGeral.Ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Morador> moradores = new ArrayList<>();

        System.out.println("=== CADASTRO EM LISTA DE MORADORES ===");

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

            // Criar morador e adicionar à lista
            Morador morador = new Morador(nome, cpf, celular, dataNascimento, sexo, bloco, apartamento, codigoAcesso);
            moradores.add(morador);

            System.out.println("\nMorador cadastrado com sucesso! Código sequencial: " + morador.getCodigoSequencial());

            // Perguntar se deseja cadastrar mais
            System.out.print("Deseja cadastrar outro morador? (s/n): ");
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();

        // Mostrar todos os moradores cadastrados
        System.out.println("\n=== RELATÓRIO DE TODOS OS MORADORES ===");
        System.out.println("Total de moradores cadastrados: " + moradores.size());
        System.out.println();

        for (Morador morador : moradores) {
            System.out.println(morador.toString());
            System.out.println("-".repeat(40));
        }
    }
}