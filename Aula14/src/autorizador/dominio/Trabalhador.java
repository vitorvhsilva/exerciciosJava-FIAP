package autorizador.dominio;

public class Trabalhador {

	private Cartao cartao;
	
	public Trabalhador(Cartao cartao) {
		this.cartao = cartao;
	}

	public boolean possuiCartao(String numeroCartao) {
		return cartao.comNumero(numeroCartao);
	}

	public Cartao getCartao() {
		return cartao;
	}
}
