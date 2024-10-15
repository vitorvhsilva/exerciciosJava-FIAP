package br.com.fiap.biblioteca.service;

import br.com.fiap.biblioteca.dominio.*;

import java.util.ArrayList;

public class AlunoService {

	private Mensageiro mensageiro;
	private Correios correios;
	private RepositorioAlunos repositorioAlunos;

	public AlunoService(Mensageiro mensageiro, Correios correios, RepositorioAlunos repositorioAlunos){
		this.mensageiro = mensageiro;
		this.correios = correios;
		this.repositorioAlunos = repositorioAlunos;
	}
	
	public void adicionar(Aluno aluno) {
		Endereco endereco = correios.obterEndereco(aluno.obterCep());
		aluno.atualizarEndereco(endereco);
		mensageiro.enviarMensagemA(aluno);
		repositorioAlunos.adicionar(aluno);
		repositorioAlunos.fechar();
	}

	public Aluno buscarPorTurmaEChamada(String turma, String chamada) {
		Aluno aluno = repositorioAlunos.buscarAlunosPorTurmaEChamada(turma, chamada);
		repositorioAlunos.fechar();
		return aluno;
	}

	public ArrayList<Aluno> buscarPorTurma(String turma) {
		ArrayList<Aluno> alunos = repositorioAlunos.buscarAlunosPorTurma(turma);
		repositorioAlunos.fechar();
		return alunos;
	}
}
