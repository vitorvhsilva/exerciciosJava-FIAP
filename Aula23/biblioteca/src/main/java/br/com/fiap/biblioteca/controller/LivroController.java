package br.com.fiap.biblioteca.controller;

import br.com.fiap.biblioteca.dao.LivroDAO;
import br.com.fiap.biblioteca.model.Livro;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("livros")
public class LivroController {

    LivroDAO livroDAO = new LivroDAO();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response salvar(Livro livro) {
        livroDAO.inserirDadosTab(livro);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response obterTodosLivros() {
        List<Livro> livros = livroDAO.pegarTodos();
        return Response
                .status(Response.Status.OK)
                .entity(livros)
                .build();
    }


}
