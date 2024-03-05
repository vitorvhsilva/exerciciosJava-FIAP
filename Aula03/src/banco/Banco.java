package banco;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente uma = new ContaCorrente(5000.0);
        ContaCorrente dois = new ContaCorrente(15000.0);

        uma.sacar(1000);
        dois.depositar(2000);

        System.out.println(uma.saldo());
        System.out.println(dois.saldo());
    }
}
