package NivelFacil.Condicionais;

public class Ternários {
    public static void main(String[] args) {
         /* *
         *  Ternários: São maneiras de reduzir o codigo
         *  Variavel = (codinção) ? seforverdadeiro : seforfalso;
         * */

        short numeroMissoes = 11;
        String nivelNinja = (numeroMissoes >= 10) ? "Esse ninja esta com mais de 10 missões" : "Esse ninja tem menos que 10 missões";
        System.out.println(nivelNinja);
    }
}
