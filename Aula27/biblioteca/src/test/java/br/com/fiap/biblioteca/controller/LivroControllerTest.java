package br.com.fiap.biblioteca.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.fiap.biblioteca.dominio.Livro;

public class LivroControllerTest {

	private LivroController controller;
	
	@BeforeEach
	void setUp() {
		controller = new LivroController();
	}
	
	@Test
	void listaVaziaDeLivros() {
		Response resposta = controller.obterTodosLivros();
		
		ArrayList<Livro> livros = (ArrayList<Livro>)resposta.getEntity();
		assertEquals(0, livros.size());
		assertEquals(200, resposta.getStatus());
	}
}
