package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int NUM_MAX = 100;

        String[] nomesNinjas = new String[NUM_MAX];
        String[] RankNinjas = new String[NUM_MAX];
        int[] IdNinja = new int[NUM_MAX];
        int[] contagemMisoes = new int[NUM_MAX];
        int[] idadeNinjas = new int[NUM_MAX];

        int menu = 0;
        int contagemNinjas = 0;

        Scanner input = new Scanner(System.in);

        while (menu != 4) {

            System.out.println("------------------------------------------");
            System.out.println("|             MENU DE NINJAS             |");
            System.out.println("------------------------------------------");
            System.out.println("| 1 - Cadastrar Novo Ninja               |");
            System.out.println("| 2 - Listar todos os Ninjas Cadastrados |");
            System.out.println("| 3 - Deletar um Ninja                   |");
            System.out.println("| 4 - Fechar Programa                    |");
            System.out.println("------------------------------------------");
            System.out.print("Escolha uma opção: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    if (contagemNinjas > NUM_MAX) {
                        System.out.println("\nLimite excedido de Ninjas.");
                        input.nextLine();
                        System.out.println("Pressione Enter para voltar ao menu...");
                        input.nextLine();
                        break;
                    }
                    input.nextLine();
                    System.out.println("\n------------------------------------------");
                    System.out.println("|      Função de Cadastro de Ninjas      |");
                    System.out.println("------------------------------------------\n");

                    IdNinja[contagemNinjas] = contagemNinjas;
                    System.out.print("Digite o Nome do Ninja: ");
                    nomesNinjas[contagemNinjas] = input.nextLine();

                    System.out.print("Digite a idade do Ninja: ");
                    idadeNinjas[contagemNinjas] = input.nextInt();
                    input.nextLine();

                    System.out.print("Digite o Rank do Ninja (ex: Gennin): ");
                    RankNinjas[contagemNinjas] = input.nextLine();

                    System.out.print("Digite a quantidade de missões: ");
                    contagemMisoes[contagemNinjas] = input.nextInt();
                    input.nextLine();

                    contagemNinjas++;

                    System.out.println("\nNinja cadastrado com sucesso!");
                    System.out.println("Pressione Enter para voltar ao menu...");
                    input.nextLine();
                    break;

                case 2:
                    input.nextLine();
                    System.out.println("\n------------------------------------------");
                    System.out.println("|      Função de Listagem de Ninjas      |");
                    System.out.println("------------------------------------------\n");

                    if (contagemNinjas == 0) {
                        System.out.println("Nenhum ninja cadastrado ainda.");
                    } else {

                        System.out.printf("%-4s | %-20s | %-5s | %-15s | %s\n", "ID", "NOME", "IDADE", "RANK", "MISSÕES");
                        System.out.println("----------------------------------------------------------------");


                        for (int i = 0; i < contagemNinjas; i++) {
                            System.out.printf("%-4d | %-20s | %-5d | %-15s | %d\n",
                                    IdNinja[i] + 1,
                                    nomesNinjas[i],
                                    idadeNinjas[i],
                                    RankNinjas[i],
                                    contagemMisoes[i]);
                        }
                    }

                    System.out.println("\nPressione Enter para voltar ao menu...");
                    input.nextLine();
                    break;

                case 3:
                    input.nextLine();
                    System.out.println("\n------------------------------------------");
                    System.out.println("|         Função de Deletar Ninjas         |");
                    System.out.println("------------------------------------------\n");

                    if (contagemNinjas == 0) {
                        System.out.println("Nenhum ninja cadastrado para deletar.\n");
                    } else {
                        int alvo;
                        System.out.print("Qual ID do ninja que quer apagar? ");
                        alvo = input.nextInt();
                        if (alvo > contagemNinjas || alvo < 0 ) {
                            System.out.println("Nenhum ninja encontrado para deletar.\n");
                        } else {
                           nomesNinjas[alvo - 1] = null;
                           RankNinjas[alvo - 1] = null;
                           IdNinja[alvo - 1] = 0;
                           contagemMisoes[alvo - 1] = 0;
                           idadeNinjas[alvo - 1] = 0;
                           contagemNinjas--;
                        }

                        System.out.println("\nNinja Deletado com sucesso!");
                    }



                    System.out.println("Pressione Enter para voltar ao menu...");
                    input.nextLine();
                    break;
                case 4:
                    System.out.println("\n------------------------------------------");
                    System.out.println("|        Fechando o programa...          |");
                    System.out.println("|                                        |");
                    System.out.println("|   CUIDADO: Os dados não serão salvos!  |");
                    System.out.println("------------------------------------------\n");
                    System.out.println("Pressione Enter para fechar...");
                    input.nextLine();
                    input.nextLine();
                    break;

                default:
                    input.nextLine();
                    System.out.println("\n------------------------------------------");
                    System.out.println("|                 AVISO                  |");
                    System.out.println("|                                        |");
                    System.out.println("|    Opção inválida! Tente novamente.    |");
                    System.out.println("------------------------------------------\n");
                    System.out.println("Pressione Enter para continuar...");
                    input.nextLine();
                    break;
            }
        }

        System.out.println("Programa finalizado.");
        input.close();
    }
}