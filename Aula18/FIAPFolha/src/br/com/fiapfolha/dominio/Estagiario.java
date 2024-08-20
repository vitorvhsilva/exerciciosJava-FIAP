package br.com.fiapfolha.dominio;

import java.time.LocalDate;

public class Estagiario extends Funcionario {

	private double valeTransporte;
	
	public Estagiario(double salario, String cracha, LocalDate dataAdmissao, double valeTransporte) {
		super(salario, cracha, dataAdmissao);
		this.valeTransporte = valeTransporte;
	}

	@Override
	public double lerSalario() {
		return salario + valeTransporte;
	}
	
}
