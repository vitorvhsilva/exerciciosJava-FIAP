package autorizador.dominio;

public class CartaoVR extends Cartao {

	public CartaoVR(String numero, int senha, double saldo) {
		super(numero, senha, saldo);
	}
	
	public boolean estaHabilitado(Estabelecimento estabelecimento) {
		return estabelecimento.aceitaCartaoVR();
	}

}
