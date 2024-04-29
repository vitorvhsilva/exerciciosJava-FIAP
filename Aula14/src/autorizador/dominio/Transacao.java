package autorizador.dominio;

public class Transacao {

	private String numeroCartao;
	private int senhaCartao;
	private double valorRefeicao;
	private String cnpjEstabelecimento;
	
	public Transacao(String numeroCartao, int senhaCartao, double valorRefeicao, String cnpjEstabelecimento) {
		this.numeroCartao = numeroCartao;
		this.senhaCartao = senhaCartao;
		this.valorRefeicao = valorRefeicao;
		this.cnpjEstabelecimento = cnpjEstabelecimento;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public int getSenhaCartao() {
		return senhaCartao;
	}

	public double getValorRefeicao() {
		return valorRefeicao;
	}

	public String getCnpjEstabelecimento() {
		return cnpjEstabelecimento;
	}
}
