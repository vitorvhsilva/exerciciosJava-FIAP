package br.com.fiap.biblioteca;

import java.util.ArrayList;

import br.com.fiap.biblioteca.dao.LivroDAO;
import br.com.fiap.biblioteca.dominio.Livro;

public class Main {

	public static void main(String[] args) {
		Livro domainDrivenDesign = new Livro("Domain Driven Design", 4, 100.00);
		Livro refatoracao = new Livro("Refatoração", 5, 120.00);
		
		System.out.println("Instanciando LivroDAO:");
		LivroDAO livroDao = new LivroDAO();

		livroDao.deletarTabela();
		livroDao.criarTabela();
		
		System.out.println("Adicionando livros...");
		livroDao.adicionar(domainDrivenDesign);
		livroDao.adicionar(refatoracao);

		ArrayList<Livro> livrosPersistidos = livroDao.obterTodosLivros();

		System.out.println("Listando todos os livros:");
		livrosPersistidos.forEach(System.out::println);

		livroDao.desconectar();
	}

}
