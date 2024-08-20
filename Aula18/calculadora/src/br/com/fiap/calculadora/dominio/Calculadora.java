package br.com.fiap.calculadora.dominio;

public class Calculadora {
	
	public double somar(double parcela1, double parcela2) {
		return parcela1 + parcela2;
	}

	public double subtrair(double minuendo, double subtraendo) {
		return minuendo - subtraendo;
	}

	public double multiplicar(double fator1, double fator2) {
		return fator1 * fator2;
	}

	public double dividir(double dividendo, double divisor) {
		return dividendo / divisor;
	}	
}
