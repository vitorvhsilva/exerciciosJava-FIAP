package br.com.fiap.biblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.biblioteca.dominio.Livro;
import br.com.fiap.biblioteca.dominio.RepositorioLivros;
import br.com.fiap.biblioteca.infra.dao.LivroDAO;
import br.com.fiap.biblioteca.service.LivroService;

@Path("livros")
public class LivroController {

	private LivroService livroService;

	public LivroController() {
		this.livroService = new LivroService(new LivroDAO());
	}

	@POST
	public Response salvar(Livro livro) {
		livroService.salvarLivro(livro);
		return Response.status(Response.Status.CREATED).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response obterTodosLivros() {
		List<Livro> livros = livroService.buscarLivros();
		return Response
				.status(Response.Status.OK)
				.entity(livros)
				.build();
	}

	@GET
	@Path("/{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response obterLivroPorNome(@PathParam("nome") String nome) {
		Livro livro = livroService.buscarLivroPorNome(nome);
		return Response
				.status(Response.Status.OK)
				.entity(livro)
				.build();

	}
}
