package banco;

import banco.dominio.ContaCorrente;
import banco.exceptions.DepositoInvalidoException;
import banco.exceptions.SaqueInvalidoException;

public class Main {

	public static void main(String[] args) {

		// RuntimeException deve ser usada quando a exceção pode ser prevenida,
		// Ja para erros que devem ser prevenidos usa-se a Exception

		// RuntimeException eh unchecked
		// Ja Exception eh checked, obrigando quem chama esse método a dar try-catch ou throws

		// Classes que usam Excecoes que herdam do Exception obrigatoriamente precisam de throws apos o argumento
		// Ja das que herdam RuntimeException, nao e necesarrio

		ContaCorrente contaDoTonyStark = new ContaCorrente(100000);
		try {
			contaDoTonyStark.sacar(10);
		} catch (SaqueInvalidoException e) {
			System.out.println(e.getMessage());
		}

		try {
			contaDoTonyStark.depositar(-1);
		} catch (DepositoInvalidoException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Saldo da conta do Homem de Ferro: R$" + contaDoTonyStark.saldo());
	}
}
