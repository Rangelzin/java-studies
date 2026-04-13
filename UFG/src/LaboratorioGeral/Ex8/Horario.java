package LaboratorioGeral.Ex8;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    // Construtor que recebe apenas hora
    public Horario(int hora) {
        if (validarHora(hora)) {
            this.hora = hora;
            this.minuto = 0;
            this.segundo = 0;
        } else {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
    }

    // Construtor que recebe hora, minuto e segundo
    public Horario(int hora, int minuto, int segundo) {
        if (validarHora(hora) && validarMinuto(minuto) && validarSegundo(segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Horário inválido: " + hora + ":" + minuto + ":" + segundo);
        }
    }

    // Métodos de validação
    public static boolean validarHora(int hora) {
        return hora >= 0 && hora < 24;
    }

    public static boolean validarMinuto(int minuto) {
        return minuto >= 0 && minuto < 60;
    }

    public static boolean validarSegundo(int segundo) {
        return segundo >= 0 && segundo < 60;
    }

    // Métodos set
    public void setHora(int hora) {
        if (validarHora(hora)) {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (validarMinuto(minuto)) {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if (validarSegundo(segundo)) {
            this.segundo = segundo;
        }
    }

    public void setHorario(int hora, int minuto, int segundo) {
        if (validarHora(hora) && validarMinuto(minuto) && validarSegundo(segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    // Métodos get
    public int getHora() { return hora; }
    public int getMinuto() { return minuto; }
    public int getSegundo() { return segundo; }

    public String getHorarioCompleto() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // Método estático para diferença em minutos
    public static int diferencaEmMinutos(Horario h1, Horario h2) {
        int totalMinutos1 = h1.hora * 60 + h1.minuto;
        int totalMinutos2 = h2.hora * 60 + h2.minuto;
        return Math.abs(totalMinutos1 - totalMinutos2);
    }

    @Override
    public String toString() {
        return getHorarioCompleto();
    }
}