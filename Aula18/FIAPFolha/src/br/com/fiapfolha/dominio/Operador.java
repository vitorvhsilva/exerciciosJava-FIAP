package br.com.fiapfolha.dominio;

import java.time.LocalDate;

public class Operador extends Funcionario {

	public Operador(double salario, String cracha, LocalDate dataAdmissao) {
		super(salario, cracha, dataAdmissao);
	}

	@Override
	public double lerSalario() {
		return salario + 10;
	}

}
