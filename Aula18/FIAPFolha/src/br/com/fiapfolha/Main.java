package br.com.fiapfolha;

import java.time.LocalDate;

import br.com.fiapfolha.dominio.AssistenteRH;
import br.com.fiapfolha.dominio.Estagiario;
import br.com.fiapfolha.dominio.Funcionario;
import br.com.fiapfolha.dominio.Gerente;
import br.com.fiapfolha.dominio.Mecanico;
import br.com.fiapfolha.dominio.Operador;

public class Main {

	public static void main(String[] args) {
		Funcionario ricardo = new Estagiario(500.0, "1111", LocalDate.of(2023, 3, 3), 100.0);
		Funcionario claudia = new AssistenteRH(5000.0, "1112", LocalDate.of(2020, 5, 5), 5.0);
		Funcionario antonio = new Gerente(10000.0, "1113", LocalDate.of(2010, 7, 7), 500.0);
		Funcionario jose = new Mecanico(3000.0, "1114", LocalDate.of(2021, 4, 5), 500.0);
		Funcionario pedro = new Operador(2000.0, "1115", LocalDate.of(2015, 10, 10));
		
		System.out.println("Salário de cada funcionário:");
		System.out.println(ricardo.lerSalario());
		System.out.println(claudia.lerSalario());
		System.out.println(antonio.lerSalario());
		System.out.println(jose.lerSalario());
		System.out.println(pedro.lerSalario());
		
	}
}
