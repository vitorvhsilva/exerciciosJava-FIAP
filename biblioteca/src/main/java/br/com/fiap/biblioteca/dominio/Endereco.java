package br.com.fiap.biblioteca.dominio;

public class Endereco {

	private String logradouro;
	private String bairro;
	private String complemento;
	private String localidade;
	private String uf;
	private String cep;
	
	public Endereco() {}
	
	public Endereco(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getLocalidade() {
		return localidade;
	}

	public String getUf() {
		return uf;
	}

	public String getCep() {
		return cep;
	}
	
}
