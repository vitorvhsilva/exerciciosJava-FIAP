public class Cartao {
    private int numero;
    private double valor;
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
}
