package br.com.fiapfolha.dominio;

import java.time.LocalDate;

public class Mecanico extends Funcionario {

	private double plr;
	
	public Mecanico(double salario, String cracha, LocalDate dataAdmissao, double plr) {
		super(salario, cracha, dataAdmissao);
		this.plr = plr;
	}

	@Override
	public double lerSalario() {
		return salario + plr;
	}

}
