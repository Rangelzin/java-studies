package NivelIntermediario.Encapsulamento;

public class Missoes {

    private  String nome;
    private RankDeMissoes rank;

    public void exibirDetalhes() {
        System.out.println("Missao: " + nome + " | Rank: " + rank + " | Descrição: " + rank.getDecricao() + " | Dificuldade: " + rank.getDificuldade());
    }

    public Missoes() {
    }
    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String nome() {
        return nome;
    }
    public RankDeMissoes rank() {
        return rank;
    }

    public Missoes setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public Missoes setRank(RankDeMissoes rank) {
        this.rank = rank;
        return this;
    }
}
