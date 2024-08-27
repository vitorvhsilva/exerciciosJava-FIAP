package br.com.fiap.biblioteca.dominio;

public class Livro {
	
	private String nome;
	private int edicao;
	private double preco;
	
	public Livro(String nome, int edicao, double preco) {
		this();
		this.nome = nome;
		this.edicao = edicao;
		this.preco = preco;
	}
	
	public Livro() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", edicao=" + edicao + ", preco=" + preco + "]";
	}

	public boolean equals(Object o) {
		if (o == null) return false;
		if (!(o instanceof Livro)) return false;
		Livro livro = (Livro) o;
        return nome.equals(livro.nome) && edicao == livro.getEdicao();
    }
}
