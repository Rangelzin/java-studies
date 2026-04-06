package LaboratorioAssociacao.Empregado;

public class MainEmpregado {
    public static void main(String[] args) {
        // Instanciando Endereços para as empresas
        Endereco endEmpresa1 = new Endereco("Avenida Faria Lima");
        endEmpresa1.setNumero(3000);
        endEmpresa1.setBairro("Itaim Bibi");
        endEmpresa1.setCidade("São Paulo");
        endEmpresa1.setEstado("SP");

        Endereco endEmpresa2 = new Endereco("Polo Tecnológico");
        endEmpresa2.setNumero(500);
        endEmpresa2.setBairro("Ilha do Fundão");
        endEmpresa2.setCidade("Rio de Janeiro");
        endEmpresa2.setEstado("RJ");

        // Instanciando Empresas e vinculando aos endereços
        Empresa emp1 = new Empresa("Tech Solutions S.A.");
        emp1.setCnpj("12.345.678/0001-90");
        emp1.setEndereco(endEmpresa1);

        Empresa emp2 = new Empresa("Inova Web Ltda.");
        emp2.setCnpj("98.765.432/0001-10");
        emp2.setEndereco(endEmpresa2);

        // Instanciando Empregados e vinculando às empresas
        Empregado func1 = new Empregado("Roberto Almeida");
        func1.setMatricula(1050);
        func1.setEmpresa(emp1);

        Empregado func2 = new Empregado("Fernanda Lima");
        func2.setMatricula(2033);
        func2.setEmpresa(emp1); // Trabalha na mesma empresa que o Roberto

        Empregado func3 = new Empregado("Lucas Peixoto");
        func3.setMatricula(8040);
        func3.setEmpresa(emp2);

        // Mostrando os resultados
        System.out.println("--- LISTA DE EMPREGADOS ---");
        System.out.println(func1);
        System.out.println(func2);
        System.out.println(func3);
    }
}
