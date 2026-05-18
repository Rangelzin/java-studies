package laboratorioFactoryMethod;

public interface Fabrica {
    Documento criarDocumento(String tipo, int numero, String remetente);
}