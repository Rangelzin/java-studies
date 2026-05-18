package laboratorioSingleton;

public class Principal {
    public static void main(String[] args) {
        Projeto proj1 = new Projeto("Residencial Bueno", 5000000.00);
        Projeto proj2 = new Projeto("Comercial T-55", 12000000.00);

        proj1.exibirProjeto();
        System.out.println("-------------------------");
        proj2.exibirProjeto();
        
        Empresa e1 = Empresa.getInstancia();
        Empresa e2 = Empresa.getInstancia();
        System.out.println("\nAs instâncias da empresa são exatamente as mesmas na memória? " + (e1 == e2));
    }
}