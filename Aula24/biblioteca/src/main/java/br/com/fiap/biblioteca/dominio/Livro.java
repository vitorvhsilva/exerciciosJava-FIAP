package br.com.fiap.biblioteca.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Livro {

	@JsonProperty
	private String nome;
	
	@JsonProperty
	private String autor;
	
	@JsonProperty
	private double preco;
	
}
