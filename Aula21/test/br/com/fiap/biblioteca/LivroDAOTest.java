package br.com.fiap.biblioteca;

import br.com.fiap.biblioteca.dao.LivroDAO;
import br.com.fiap.biblioteca.dominio.Livro;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LivroDAOTest {

    @Test
    void testarPersistenciaDosLivros() {
        Livro domainDrivenDesign = new Livro("Domain Driven Design", 4, 100.00);
        Livro refatoracao = new Livro("Refatoração", 5, 120.00);

        LivroDAO livroDao = new LivroDAO();

        livroDao.deletarTabela();
        livroDao.criarTabela();

        livroDao.adicionar(domainDrivenDesign);
        livroDao.adicionar(refatoracao);

        ArrayList<Livro> livrosPersistidos = livroDao.obterTodosLivros();

        assertEquals(livrosPersistidos.get(0), domainDrivenDesign);
        assertEquals(livrosPersistidos.get(1), refatoracao);

        livroDao.desconectar();
    }

    @Test
    void testarRemocaoDosLivros() {
        Livro domainDrivenDesign = new Livro("Domain Driven Design", 4, 100.00);
        Livro refatoracao = new Livro("Refatoração", 5, 120.00);

        LivroDAO livroDao = new LivroDAO();

        livroDao.deletarTabela();
        livroDao.criarTabela();

        livroDao.adicionar(domainDrivenDesign);
        livroDao.adicionar(refatoracao);

        livroDao.deletarLivros();

        ArrayList<Livro> livrosPersistidos = livroDao.obterTodosLivros();
        assertEquals(0, livrosPersistidos.size());

        livroDao.desconectar();
    }
}
