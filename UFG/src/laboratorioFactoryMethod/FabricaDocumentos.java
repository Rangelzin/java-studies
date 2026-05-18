package laboratorioFactoryMethod;

public class FabricaDocumentos implements Fabrica {
    @Override
    public Documento criarDocumento(String tipo, int numero, String remetente) {
        return switch (tipo.toLowerCase()) {
            case "carta" -> new Carta(numero, remetente);
            case "notificacao" -> new Notificacao(numero, remetente);
            case "telegrama" -> new Telegrama(numero, remetente);
            default -> throw new IllegalArgumentException("Tipo de documento desconhecido: " + tipo);
        };
    }
}