package br.com.fiap.biblioteca.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.biblioteca.dominio.*;
import br.com.fiap.biblioteca.infra.dao.AlunoDAO;
import br.com.fiap.biblioteca.infra.mensageiro.MensageiroImpl;
import br.com.fiap.biblioteca.infra.viacep.CorreiosImpl;
import br.com.fiap.biblioteca.dominio.RepositorioAlunos;
import br.com.fiap.biblioteca.service.AlunoService;

@Path("alunos")
public class AlunoController {

	private RepositorioAlunos alunoDao;
	private AlunoService alunoService;

	public AlunoController() {
		Mensageiro mensageiro = new MensageiroImpl();
		Correios correios = new CorreiosImpl();
		alunoDao = new AlunoDAO();
		alunoService = new AlunoService(mensageiro, correios,
				alunoDao);
	}

	@POST
	public Response adicionar(Aluno aluno) {
		alunoDao.adicionar(aluno);
		alunoDao.fechar();
		return Response
				.status(Response.Status.CREATED)
				.build();
	}
	
	@GET
	@Path("/{turma}/{chamada}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorTurmaEChamada(
			@PathParam("turma") String turma, 
			@PathParam("chamada") String chamada) {
		Response.Status status = null;
		Aluno aluno = alunoDao.buscarAlunosPorTurmaEChamada(turma, chamada);
		alunoDao.fechar();
		if(aluno == null) status = Response.Status.NOT_FOUND;
		else status = Response.Status.OK;
		return Response
				.status(status)
				.entity(aluno)
				.build();
	}
	
	@GET
	@Path("/{turma}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorTurma(@PathParam("turma") String turma) {
		ArrayList<Aluno> alunos = alunoDao.buscarAlunosPorTurma(turma);
		alunoDao.fechar();
		
		return Response
				.status(Response.Status.OK)
				.entity(alunos)
				.build();
	}
}
