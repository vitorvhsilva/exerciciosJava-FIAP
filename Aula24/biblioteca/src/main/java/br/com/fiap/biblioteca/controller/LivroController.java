package br.com.fiap.biblioteca.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.biblioteca.dominio.Livro;

@Path("livros")
public class LivroController {

	private static final ArrayList<Livro> livros = new ArrayList<>();
	
	@POST
	public Response salvar(Livro livro) {
		livros.add(livro);

		return Response
				.status(Response.Status.CREATED)
				.build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response obterTodosLivros() {
		return Response
				.status(Response.Status.OK)
				.entity(livros)
				.build();
	}
}
