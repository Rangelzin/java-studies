package laboratorioSingleton;

public class Projeto {
    private String nomeProjeto;
    private double orcamento;
    private Empresa empresaVinculada;

    public Projeto(String nomeProjeto, double orcamento) {
        this.nomeProjeto = nomeProjeto;
        this.orcamento = orcamento;
        this.empresaVinculada = Empresa.getInstancia(); 
    }

    public void exibirProjeto() {
        System.out.println("Projeto: " + nomeProjeto + " | Orçamento: R$ " + orcamento);
        System.out.println("Pertence a: " + empresaVinculada.getNome() + " (CNPJ: " + empresaVinculada.getCnpj() + ")");
    }
}