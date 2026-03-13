package NivelFacil.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados nao primitivos: string, array, class, enum
        * Objetivos: criar um ninja e atribuir métodos a ele
        */

        // Declarando a variavel de nome
        String nome = "Rangel Uchiha";
        String nomeEmCaixaAlta = nome.toUpperCase(); // Colocar string em caixa alta
        System.out.println("Esse nome esta em CAPSLOCK: " + nomeEmCaixaAlta);

        // Declarando a variavel de nome da aldeia
        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase();  // Colocar string em caixa baixa
        System.out.println("Esse nome esta em caixa baixa: " + aldeiaLowerCase);
    }
}
