package laboratorioFactoryMethod;

public class Notificacao extends Documento {
    public Notificacao(int numero, String remetente) {
        super(numero, remetente, "Notificação");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(tipo + " #" + numero + " - Remetente: " + remetente);
    }
}