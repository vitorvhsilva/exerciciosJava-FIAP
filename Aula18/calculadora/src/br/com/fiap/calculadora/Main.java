package br.com.fiap.calculadora;

import java.util.Scanner;

import br.com.fiap.calculadora.dominio.Calculadora;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		double primeiroNumero = scanner.nextDouble();
		
		System.out.println("Digite o segundo número:");
		double segundoNumero = scanner.nextDouble();
		
		System.out.println("Qual operação deve ser aplicada? +, -, x ou / ?");
		String operacao = scanner.next();
		
		Calculadora calculadora = new Calculadora();
		double resultado = 0;
		
		switch(operacao) {
			case "+" -> resultado = calculadora.somar(primeiroNumero, segundoNumero);
			case "-" -> resultado = calculadora.subtrair(primeiroNumero, segundoNumero);
			case "*" -> resultado = calculadora.multiplicar(primeiroNumero, segundoNumero);
			case "/" -> resultado = calculadora.dividir(primeiroNumero, segundoNumero);
			default -> opcaoInvalida(scanner, operacao);
		}
		System.out.println("O resultado é " + resultado);
		scanner.close();
	}

	public static void opcaoInvalida(Scanner scanner, String operacao) {
		scanner.close();
		System.out.println("Scanner fechado");
		throw new IllegalArgumentException("Operação inválida: " + operacao);
	}

}
