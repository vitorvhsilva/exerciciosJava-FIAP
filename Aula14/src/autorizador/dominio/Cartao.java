package autorizador.dominio;

public abstract class Cartao {

	private String numero;
	private int senha;
	protected double saldo;
	
	public Cartao(String numero, int senha, double saldo) {
		this.numero = numero;
		this.senha = senha;
		this.saldo = saldo;
	}

	public boolean comNumero(String numeroCartao) {
		return numero.equals(numeroCartao);
	}

	public boolean comSenha(int senhaCartao) {
		return senha == senhaCartao;
	}

	public boolean possuiSaldoPara(double valorRefeicao) {
		return saldo >= valorRefeicao;
	}

}
