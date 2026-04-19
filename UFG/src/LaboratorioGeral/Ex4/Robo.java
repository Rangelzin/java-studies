package LaboratorioGeral.Ex4;

public class Robo {
    private int identificacao;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private int quantidadePo;
    private int limitePo;

    public Robo(int identificacao, int limitePo) {
        this.identificacao = identificacao;
        this.status = "desligado";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.quantidadePo = 0;
        this.limitePo = limitePo;
    }

    public void ligar() {
        if (status.equals("desligado")) {
            status = "ligado";
            System.out.println("Robô " + identificacao + " ligado.");
        } else {
            System.out.println("Robô já está " + status + ".");
        }
    }

    public void desligar() {
        status = "desligado";
        System.out.println("Robô " + identificacao + " desligado.");
    }

    public void andar(int deltaX, int deltaY) {
        if (status.equals("desligado")) {
            System.out.println("Erro: Robô precisa estar ligado para andar.");
            return;
        }

        posicaoX += deltaX;
        posicaoY += deltaY;
        status = "andando";
        System.out.println("Robô andou " + deltaX + " no eixo X e " + deltaY + " no eixo Y.");
    }

    public void aspirar(int quantidade) {
        if (status.equals("desligado")) {
            System.out.println("Erro: Robô precisa estar ligado para aspirar.");
            return;
        }

        quantidadePo += quantidade;
        System.out.println("Robô aspirou " + quantidade + " unidades de pó.");

        if (quantidadePo >= limitePo) {
            System.out.println("Limite de pó atingido! Robô será desligado.");
            desligar();
        }
    }

    public void parar() {
        if (status.equals("desligado")) {
            System.out.println("Erro: Robô precisa estar ligado para parar.");
            return;
        }

        if (status.equals("andando")) {
            status = "parado";
            System.out.println("Robô parado.");
        }
    }

    @Override
    public String toString() {
        return "Robô " + identificacao +
               " - Status: " + status +
               " - Posição: (" + posicaoX + ", " + posicaoY + ")" +
               " - Pó: " + quantidadePo + "/" + limitePo;
    }

    // Getters para informações
    public int getIdentificacao() { return identificacao; }
    public String getStatus() { return status; }
    public int getPosicaoX() { return posicaoX; }
    public int getPosicaoY() { return posicaoY; }
    public int getQuantidadePo() { return quantidadePo; }
    public int getLimitePo() { return limitePo; }
}