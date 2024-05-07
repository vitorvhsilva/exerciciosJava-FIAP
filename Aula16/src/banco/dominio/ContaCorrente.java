package banco.dominio;

import banco.exceptions.DepositoInvalidoException;
import banco.exceptions.SaqueInvalidoException;

public class ContaCorrente {

	private double saldo;
	
	public ContaCorrente(double saldoInicial){
		this.saldo = saldoInicial;
	}
	
	public void sacar(double saque) {
		if(saldo < saque) {
			throw new SaqueInvalidoException("Valor do saque maior que o saldo atual. Saque não realizado");
		}
		saldo -= saque;
	}
	
	public void depositar(double deposito) throws DepositoInvalidoException {
		if(deposito <= 0) {
			throw new DepositoInvalidoException("Valor do depósito negativo. Depósito não realizado");
		}
		saldo += deposito;
	}
	
	public double saldo() {
		return saldo;
	}
	
	void render() {
		saldo = saldo * 1.01;  
	}
}
