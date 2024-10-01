package br.com.fiap.biblioteca.service;

import br.com.fiap.biblioteca.dominio.*;
import br.com.fiap.biblioteca.dominio.RepositorioAlunos;

public class AlunoService {

	private Mensageiro mensageiro;
	private Correios correios;
	private RepositorioAlunos repositorioAlunos;

	public AlunoService(Mensageiro mensageiro, Correios correios,
						RepositorioAlunos repositorioAlunos) {
		this.mensageiro = mensageiro;
		this.correios = correios;
		this.repositorioAlunos = repositorioAlunos;
	}

	public void adicionar(Aluno aluno) {
		Endereco endereco = correios.buscarEnderecoPor(aluno.getCep());
		aluno.atualizarEndereco(endereco);
		mensageiro.enviarMensagemDeBoasVindasPara(aluno);
		repositorioAlunos.adicionar(aluno);
		repositorioAlunos.fechar();
	}

}
