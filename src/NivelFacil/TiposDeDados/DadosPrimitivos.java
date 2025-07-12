package NivelFacil.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
         /*
         * Dados Primitivos - int, double, float, char, boolean, short.
         * Objetivo da aula: Criar um ninja - Rangel Uchiha
         */

        int idade = 19; // Valor máximo = 2 147 483 647
        double altura = 1.69;
        char inicial = 'N';
        boolean VivoOuMOrto = true;
        Long saldoBancario = 999999999999999999L;

        System.out.println(idade); // Comando para mostrar para o usuário
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("saldo bancario é = " + saldoBancario);
        System.out.println("Minha idade é = " + idade);
    }
}
