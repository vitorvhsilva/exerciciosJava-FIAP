package flecha.miniautorizador.dominio;

public abstract class Cartao {
    private int numero;
    protected double valor;
    private int senha;

    public Cartao(int numero, double valor, int senha) {
        this.numero = numero;
        this.valor = valor;
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    public int getSenha() {
        return senha;
    }

    public boolean possuiSaldoPara(double valorTransacao) {
        return valorTransacao < valor;
    }

}
