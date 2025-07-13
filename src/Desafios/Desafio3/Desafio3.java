package Desafios.Desafio3;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.nivelDificuldade = "Alta";
        Sasuke.statusMissao = "CONCLUIDA";
        Sasuke.missao = "Recuperar o Amuleto";
        Sasuke.habilidadeEspecial = "RinneSharigan";

        Sasuke.mostrarInformações();
        Sasuke.mostrarHabilidadeEspecial();
    }
}
