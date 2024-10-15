package br.com.fiap.biblioteca.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Livro {

	@JsonProperty
	private String nome;
	
	@JsonProperty
	private String autor;
	
	@JsonProperty
	private double preco;

	public Livro() {
	}

	public Livro(String nome, String autor, double preco) {
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}
}
