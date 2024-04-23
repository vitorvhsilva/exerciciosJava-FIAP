package flecha.miniautorizador.dominio;

public class CartaoDeDebito extends Cartao {
    private double chequeEspecial;

    public CartaoDeDebito (int numero, double valor, int senha, double chequeEspecial) {
        super(numero,valor,senha);
        this.chequeEspecial = chequeEspecial;
    }

    public double getValor() {
        return valor + chequeEspecial;
    }
}
