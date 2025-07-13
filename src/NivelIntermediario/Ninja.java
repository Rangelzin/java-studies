package NivelIntermediario;

public class Ninja {

    String nome;
    String aldeia;
    int idade;


    /*
    * O metodo VOID retorna NADA
    * O metodo String retorna uma String (obg!)
    * O metodo Int retorna um INT (obg!)
    * */

    // Criar um metodo Publico personalizado
    public String EuSouUmNinja() {
        return "Oi, eu sou um Ninja!\n";
    }

    public int TempoParaHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
