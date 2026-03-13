package NivelIntermediario.Encapsulamento;

public record NInjaRecord(String nome, String Email, int telefone) {
    // Mesmo que classes com constructor, getters, setters, e toString
    // MAS todos os atributos são finais por padrão
    // Records não tem SETTER
}

