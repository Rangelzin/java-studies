package laboratorioFactoryMethod;

public class Carta extends Documento {
    public Carta(int numero, String remetente) {
        super(numero, remetente, "Carta");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(tipo + " #" + numero + " - Remetente: " + remetente);
    }
}