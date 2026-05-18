package laboratorioFactoryMethod;

public class Telegrama extends Documento {
    public Telegrama(int numero, String remetente) {
        super(numero, remetente, "Telegrama");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(tipo + " #" + numero + " - Remetente: " + remetente);
    }
}