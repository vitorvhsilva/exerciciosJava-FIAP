package br.com.fiap.biblioteca.infra.mensageiro;

import br.com.fiap.biblioteca.dominio.Aluno;
import br.com.fiap.biblioteca.dominio.Mensageiro;

public class MensageiroImpl implements Mensageiro {

	public void enviarMensagemDeBoasVindasPara(Aluno aluno) {
		System.out.println("Mensagem enviada");
	}

}
