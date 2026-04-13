package LaboratorioGeral.Ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();

        System.out.println("=== CADASTRO DE LIVROS ===");
        System.out.println("Digite 0 no código para finalizar");
        System.out.println();

        while (true) {
            System.out.print("Código do livro: ");
            int codigo = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            if (codigo == 0) {
                break;
            }

            System.out.print("Título do livro: ");
            String titulo = scanner.nextLine();

            System.out.println("\nDados do autor:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Sobrenome: ");
            String sobrenome = scanner.nextLine();
            System.out.print("Nome intermediário: ");
            String intermediario = scanner.nextLine();

            Pessoa autor = new Pessoa(nome, sobrenome, intermediario);

            Livro livro = new Livro(codigo, titulo, autor);

            System.out.print("Editora: ");
            livro.setEditora(scanner.nextLine());

            System.out.print("Edição: ");
            livro.setEdicao(scanner.nextLine());

            System.out.print("Ano: ");
            livro.setAno(scanner.nextInt());
            scanner.nextLine(); // Limpar buffer

            System.out.print("Local: ");
            livro.setLocal(scanner.nextLine());

            System.out.print("Gênero: ");
            livro.setGenero(scanner.nextLine());

            livros.add(livro);
            System.out.println("\nLivro cadastrado com sucesso!");
            System.out.println("-".repeat(50));
            System.out.println();
        }

        scanner.close();

        // Mostrar resultados
        System.out.println("\n=== RELATÓRIO DE LIVROS ===");
        System.out.println("Total de livros criados: " + Livro.getTotalLivros());
        System.out.println();

        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            System.out.println("Livro " + (i + 1) + ":");
            System.out.println(livro.toString());
            System.out.println();
        }

        // Mostrar totais por gênero (simplificado)
        System.out.println("=== TOTAIS POR GÊNERO ===");
        for (int i = 0; i < 5; i++) {
            int total = Livro.getTotalPorGenero(i);
            if (total > 0) {
                System.out.println("Gênero " + (i + 1) + ": " + total + " livros");
            }
        }
    }
}