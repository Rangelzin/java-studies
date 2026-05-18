package laboratorioFactoryMethod;

public class CadastroDocumentos {
    public static void main(String[] args) {
        Fabrica fabrica = new FabricaDocumentos();

        Documento doc1 = fabrica.criarDocumento("carta", 101, "João Silva");
        Documento doc2 = fabrica.criarDocumento("telegrama", 102, "Maria Souza");
        
        doc1.exibirDetalhes();
        doc2.exibirDetalhes();
    }
}