package Provas.P2;

import java.util.ArrayList;

public class Evento {
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private ArrayList<Palestra> palestras;

    public Evento(String descricao, String dataInicio, String dataFim) {
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.palestras = new ArrayList<>();
    }

    public String getDescricao() {
        return descricao;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public String getDataFim() {
        return dataFim;
    }
    public ArrayList<Palestra> getPalestras() {
        return palestras;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    public void setPalestras(ArrayList<Palestra> palestras) {
        this.palestras = palestras;
    }

    public void adicionarPalestra(Palestra palestra) {
        if (palestra != null) {
            this.palestras.add(palestra);
        }
    }

    @Override
    public String toString() {
        return "Evento = " +
                "descricao: " + descricao + "| " +
                ", dataInicio: " + dataInicio + "| " +
                ", dataFim: " + dataFim + "| " +
                ", palestras: " + palestras +
                " |";
    }
}
