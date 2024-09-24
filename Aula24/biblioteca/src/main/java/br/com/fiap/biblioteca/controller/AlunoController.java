package br.com.fiap.biblioteca.controller;

import br.com.fiap.biblioteca.dominio.Aluno;
import br.com.fiap.biblioteca.dominio.Livro;
import br.com.fiap.biblioteca.infra.dao.AlunoDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("alunos")
public class AlunoController {

    private AlunoDAO alunoDAO;
    private static final ArrayList<Aluno> alunos = new ArrayList<>();

    public AlunoController() {
        this.alunoDAO = new AlunoDAO();
    }

    @POST
    public Response adicionar(Aluno aluno){
        alunoDAO.inserirAluno(aluno);
        alunoDAO.fecharConexao();

        return Response
                .status(Response.Status.CREATED)
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarAlunos() {
        List<Aluno> alunos = alunoDAO.pegarAlunos();
        alunoDAO.fecharConexao();

        return Response
                .status(Response.Status.OK)
                .entity(alunos)
                .build();
    }

    @GET
    @Path("/{turma}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarPorTurma(@PathParam("turma") String turma) {
        List<Aluno> alunos = alunoDAO.pegarAlunosPorTurma(turma);
        alunoDAO.fecharConexao();

        return Response
                .status(Response.Status.OK)
                .entity(alunos)
                .build();
    }

    @GET
    @Path("/{turma}/{chamada}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response buscarPorTurmaEChamada(
            @PathParam("turma") String turma,
            @PathParam("chamada") String chamada) {

        List<Aluno> alunos = alunoDAO.pegarAlunosPorTurmaEChamada(turma, chamada);
        alunoDAO.fecharConexao();

        return Response
                .status(Response.Status.OK)
                .entity(alunos)
                .build();
    }
}
