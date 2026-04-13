package LaboratorioGeral.Ex10;

public class Morador {
    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private String apartamento;
    private String codigoAcesso;
    private int codigoSequencial;
    private static int proximoCodigo = 1;

    public Morador(String nome, String cpf, String celular, String dataNascimento, String sexo, String bloco, String apartamento, String codigoAcesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.codigoAcesso = codigoAcesso;
        this.codigoSequencial = proximoCodigo++;
    }

    // Getters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getCelular() { return celular; }
    public String getDataNascimento() { return dataNascimento; }
    public String getSexo() { return sexo; }
    public String getBloco() { return bloco; }
    public String getApartamento() { return apartamento; }
    public String getCodigoAcesso() { return codigoAcesso; }
    public int getCodigoSequencial() { return codigoSequencial; }

    @Override
    public String toString() {
        return "Morador #" + codigoSequencial +
               "\nNome: " + nome +
               "\nCPF: " + cpf +
               "\nCelular: " + celular +
               "\nData Nascimento: " + dataNascimento +
               "\nSexo: " + sexo +
               "\nBloco: " + bloco +
               "\nApartamento: " + apartamento +
               "\nCódigo Acesso: " + codigoAcesso +
               "\n";
    }
}