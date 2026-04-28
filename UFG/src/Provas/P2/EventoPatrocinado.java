package Provas.P2;

public class EventoPatrocinado extends Evento{
    private String nomePatrocinador;
    private double valor;

    public EventoPatrocinado(String descricao, String dataInicio, String dataFim, String nomePatrocinador, double valor) {
        super(descricao, dataInicio, dataFim);
        this.nomePatrocinador = nomePatrocinador;
        this.valor = valor;
    }

    public String getNomePatrocinador() {
        return nomePatrocinador;
    }
    public double getValor() {
        return valor;
    }

    public void setNomePatrocinador(String nomePatrocinador) {
        this.nomePatrocinador = nomePatrocinador;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "EventoPatrocinado = " +
                super.toString() +
                "nomePatrocinador: " + nomePatrocinador + "| " +
                ", valor: " + valor +
                " |";
    }
}
