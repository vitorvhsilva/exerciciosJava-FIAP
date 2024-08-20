package br.com.fiapfolha.dominio;

import java.time.LocalDate;

public abstract class Funcionario {
	
	protected double salario;
	private String cracha;
	private LocalDate dataAdmissao;
	
	Funcionario(double salario, String cracha, LocalDate dataAdmissao){
		this.salario = salario;
		this.cracha = cracha;
		this.dataAdmissao = dataAdmissao;
	}
	
	public abstract double lerSalario();
}
