package LaboratorioGeral.Ex7;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void mostrarFuncionarios() {
        System.out.println("=== FUNCIONÁRIOS DA EMPRESA " + nome + " ===");
        for (Funcionario func : funcionarios) {
            System.out.println(func.toString());
            System.out.println("Proventos anuais: R$" + func.calcularProventosAnuais());
            System.out.println();
        }
    }

    public void aplicarAumentoGeral(double percentual) {
        for (Funcionario func : funcionarios) {
            func.aumentarSalario(percentual);
        }
    }

    // Getters
    public String getCnpj() { return cnpj; }
    public String getNome() { return nome; }
    public List<Funcionario> getFuncionarios() { return funcionarios; }
}