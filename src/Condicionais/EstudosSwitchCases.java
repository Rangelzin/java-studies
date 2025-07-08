package Condicionais;

import java.util.Scanner;

public class EstudosSwitchCases {
    public static void main(String[] args) {
        /*
        * SWITCH CASE: ifelse que servem casos especificos
        * objetivo: pedir pro usuario escolher entre os ninja
        */

        // Pedir usuario
        Scanner caixadeTexto = new Scanner(System.in);

        // Mostrar opcoes para o usuario
        System.out.println("Escolha um personagem:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Boruto Uzumaki");
        System.out.println("3 - Sasuke Uchiha");

        // pedir para o usuario escolher
        int escolhaUsuario = caixadeTexto.nextInt();
        System.out.println("Voce digitou o numero: " + escolhaUsuario);

        // Reacao para esoclha
        switch (escolhaUsuario ){
            case 1:
                System.out.println("O Usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O Usuario escolheu o Boruto Uzumaki");
                break;
            case 3:
                System.out.println("O Usuario escolheu o Sasuke Uchiha");
                break;
            default:
                System.out.println("Você Digitou uma resposta inválida, tente novamente!");
        }

        caixadeTexto.close();

    }
}
