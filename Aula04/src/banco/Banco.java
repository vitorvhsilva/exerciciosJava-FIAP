package banco;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente uma = new ContaCorrente(5000.0);
        ContaCorrente dois = new ContaCorrente(15000.0);

        ContaCorrente tres = new ContaCorrente(100.0);

        uma.sacar(1000);
        dois.depositar(2000);

        System.out.println("Conta antes da operacao: " + tres.saldo());

        tres.render();
        tres.sacar(50);
        tres.depositar(500);

        System.out.println("Conta depois da operacao: " + tres.saldo());

    }
}
