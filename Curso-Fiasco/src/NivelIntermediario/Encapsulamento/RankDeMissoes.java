package NivelIntermediario.Encapsulamento;

public enum RankDeMissoes {
    D("Baixo", 2),
    C("Moderado", 4),
    B("Médio", 6),
    A("Alto", 8),
    S("Nivel Kage", 10);

    private String decricao;
    private int dificuldade;

    RankDeMissoes(String decricao, int dificuldade) {
        this.decricao = decricao;
        this.dificuldade = dificuldade;
    }

    public String getDecricao() {
        return decricao;
    }
    public int getDificuldade() {
        return dificuldade;
    }

    public RankDeMissoes setDecricao(String decricao) {
        this.decricao = decricao;
        return this;
    }
    public RankDeMissoes setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
        return this;
    }
}
