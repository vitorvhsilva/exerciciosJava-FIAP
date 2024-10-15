package br.com.fiap.biblioteca.service;

import br.com.fiap.biblioteca.dominio.Livro;
import br.com.fiap.biblioteca.dominio.RepositorioLivros;

import java.util.List;

public class LivroService {
    private RepositorioLivros livroDAO;

    public LivroService(RepositorioLivros livroDAO) {
        this.livroDAO = livroDAO;
    }

    public void salvarLivro(Livro livro) {
        livroDAO.adicionar(livro);
        livroDAO.fechar();
    }

    public List<Livro> buscarLivros() {
        List<Livro> livros = livroDAO.buscarLivros();
        livroDAO.fechar();
        return livros;
    }

    public Livro buscarLivroPorNome(String nome) {
        Livro livro = livroDAO.buscarLivroPorNome(nome);
        livroDAO.fechar();
        return livro;
    }
}
