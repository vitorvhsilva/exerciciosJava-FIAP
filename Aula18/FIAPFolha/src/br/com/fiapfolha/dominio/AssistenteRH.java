package br.com.fiapfolha.dominio;

import java.time.LocalDate;

public class AssistenteRH extends Funcionario implements FuncionarioAutenticavel {

	private double porcentagemComissao;
	
	public AssistenteRH(double salario, String cracha, LocalDate dataAdmissao, double porcentagemComissao) {
		super(salario, cracha, dataAdmissao);
		this.porcentagemComissao = porcentagemComissao;
	}

	@Override
	public double lerSalario() {
		return salario + ((salario / 100) * porcentagemComissao);
	}

	@Override
	public void autenticar() {
		// TODO Auto-generated method stub
		
	}

}
