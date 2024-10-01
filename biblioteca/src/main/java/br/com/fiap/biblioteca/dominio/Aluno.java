package br.com.fiap.biblioteca.dominio;

public class Aluno {

	private String nome;
	private String chamada;
	private String turma;
	private Endereco endereco;
	
	public Aluno() {}
	
	public Aluno(String nome, String chamada, String turma) {
		this();
		this.nome = nome;
		this.chamada = chamada;
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}
	
	public String getChamada() {
		return chamada;
	}
	
	public String getTurma() {
		return turma;
	}

	public String getCep() {
		return endereco.getCep();
	}

	public void atualizarEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
