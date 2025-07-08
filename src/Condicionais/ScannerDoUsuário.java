package Condicionais;

import java.util.Scanner;

public class ScannerDoUsuário {
    public static void main(String[] args) {

        /*
        * Scanner = é um jeito de trazer o usuario para o app
        * Objetivo = o usuario vai criar o ninja e vamos validar
        **/

        // abrir o Scanenr
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Escreva o nome do ninja: ");
        String nomeNinja = caixaDeTexto.nextLine();

        // Receber a idade do ninja
        System.out.println("Escreva a idade do ninja");
        int idadeNinja = caixaDeTexto.nextInt();

        System.out.println("O nome do ninja é: " + nomeNinja);
        System.out.println("A idade do ninja é: " + idadeNinja + " anos!");

        // Tratamento de dados
        if (idadeNinja >= 18) {
            System.out.println("Esse ninja é maior de idade e pode sair em missões");
        } else {
            System.out.println("Esse ninja é muito novo, precisa treinar mais!");
        }



        // fechar o scanner sempre
        caixaDeTexto.close();
    }
}
