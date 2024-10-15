package br.com.fiap.biblioteca.dominio;

import java.util.List;

public interface RepositorioLivros {
    void adicionar(Livro livro);
    void fechar();
    Livro buscarLivroPorNome(String nome);
    List<Livro> buscarLivros();
    Long obterProximoId();
}
