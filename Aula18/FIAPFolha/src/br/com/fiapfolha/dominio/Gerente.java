package br.com.fiapfolha.dominio;

import java.time.LocalDate;

public class Gerente extends Funcionario implements FuncionarioAutenticavel {

	private double bonus;
	
	public Gerente(double salario, String cracha, LocalDate dataAdmissao, double bonus) {
		super(salario, cracha, dataAdmissao);
		this.bonus = bonus;
	}

	@Override
	public double lerSalario() {
		return salario + bonus;
	}

	@Override
	public void autenticar() {
		// lógica complexa de autenticação
	}

}
