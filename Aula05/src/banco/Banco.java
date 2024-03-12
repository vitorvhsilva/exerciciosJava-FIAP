package banco;

import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaUm = new ContaCorrente(5000.0);
        ContaCorrente contaDois = new ContaCorrente(15000.0);

        ContaCorrente tres = new ContaCorrente(100.0);

        contaUm.sacar(1000);
        contaDois.depositar(2000);

        System.out.println("Saldo da primeira conta: " + contaUm.saldo());
        System.out.println("Saldo da segunda conta: " + contaDois.saldo());

        ArrayList<ContaCorrente> contasCorrentes = new ArrayList<>();
        contasCorrentes.add(contaUm);
        contasCorrentes.add(contaDois);

        Correntista correntistaJose = new Correntista("Vitor", "52452452439",
                "52452452439", contasCorrentes);
        System.out.println(correntistaJose.getCartaoCredito());

    }
}
