package autorizador.dominio;

public class Estabelecimento {

	private String cnpj;
	private String nome;
	private boolean cartaoVR;
	private boolean cartaoVA;

	
	public Estabelecimento(String nome, String cnpj, boolean cartaoVR, boolean cartaoVA) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.cartaoVR = cartaoVR;
		this.cartaoVA = cartaoVA;
	}
	
	public boolean aceitaCartaoVR() {
		return cartaoVR;
	}

	public boolean aceitaCartaoVA() {
		return cartaoVA;
	}

	public boolean possuiCnpj(String cnpjEstabelecimento) {
		return this.cnpj.equals(cnpjEstabelecimento);
	}

}
