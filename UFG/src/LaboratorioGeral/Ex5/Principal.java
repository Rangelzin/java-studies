package LaboratorioGeral.Ex5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Filmes");
        System.out.println("Digite 0 no código para finalizar");
        System.out.println();

        while (true) {
            System.out.print("Código do filme: ");
            int codigo = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            if (codigo == 0) {
                break;
            }

            System.out.print("Nome do filme: ");
            String nome = scanner.nextLine();

            Filme filme = new Filme(codigo, nome);

            System.out.print("Gênero: ");
            filme.setGenero(scanner.nextLine());

            System.out.print("Ano: ");
            filme.setAno(scanner.nextInt());
            scanner.nextLine(); // Limpar buffer

            System.out.print("Autor Principal: ");
            filme.setAutorPrincipal(scanner.nextLine());

            System.out.println();
            System.out.println("Filme cadastrado:");
            System.out.println(filme.toString());
            System.out.println("-".repeat(50));
            System.out.println();
        }

        scanner.close();

        System.out.println("\nTotal de filmes criados: " + Filme.getTotalFilmes());
    }
}