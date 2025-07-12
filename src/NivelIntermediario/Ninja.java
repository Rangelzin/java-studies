package NivelIntermediario;

public class Ninja {

    String nome;
    String aldeia;
    int idade;


    // Criar um metodo Publico personalizado
    /*
    * O metodo VOID retorna NADA
    * */
    public void ShariganAtivado() {
        System.out.println("O Sharingan Ativou!");
    }

    /*
    * O metodo String retorna uma String (obg!)
    * */
    public String EuSouUmNinja() {
        return "Oi, eu sou um Ninja!";
    }

    /*
    * O metodo Int retorna um INT (obg!)
    * */
    public int TempoParaHokage(int idadeMinimaParaSerHokage) {

        return idadeMinimaParaSerHokage - idade;
    }
}
