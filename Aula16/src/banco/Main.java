package banco;

import banco.dominio.ContaCorrente;
import banco.exceptions.DepositoInvalidoException;
import banco.exceptions.SaqueInvalidoException;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente contaDoTonyStark = new ContaCorrente(10);
		try {
			contaDoTonyStark.sacar(5);
		}
		catch (SaqueInvalidoException e) {
			System.out.println(e.getMessage());
		}

		try {
			contaDoTonyStark.depositar(-20);
		}
		catch (DepositoInvalidoException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Saldo da conta do Homem de Ferro: R$" + contaDoTonyStark.saldo());
	}
}
