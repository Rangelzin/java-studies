package NivelIntermediario.Encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }
    public BolsaGenerica(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }
    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void adcionarEquipamentos(T equipamento) {
        equipamentos.add(equipamento);
    }

    @Override
    public String toString() {
        return "Bola de equipamentos: " + equipamentos.toString();
    }
}
