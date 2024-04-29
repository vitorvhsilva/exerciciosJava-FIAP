package autorizador.dominio;

public class CartaoDeDebito extends Cartao {

	private double chequeEspecial;
	
	public CartaoDeDebito(String numero, int senha, double saldo, double chequeEspecial) {
		super(numero, senha, saldo); // chamada para o construtor da superclasse
		this.chequeEspecial = chequeEspecial;
	}

	public boolean possuiSaldoPara(double valorTransacao) {
		return valorTransacao < saldo + chequeEspecial;
	}
}
