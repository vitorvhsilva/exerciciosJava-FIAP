package navios;

public class Navio {
    private String nome;
    private double velocidade;
    private boolean atracado;

    public Navio(String nome, double velocidade, boolean atracado) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.atracado = atracado;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public boolean isAtracado() {
        return atracado;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setAtracado(boolean atracado) {
        this.atracado = atracado;
    }

    public void aumentarVelocidade(double incremento) {
        velocidade += incremento;
    }
    public void diminuirVelocidade(double incremento) {
        velocidade -= incremento;
    }
}
