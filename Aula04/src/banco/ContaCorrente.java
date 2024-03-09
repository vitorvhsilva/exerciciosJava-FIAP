package banco;

public class ContaCorrente {

    double saldo;

    //constructor
    ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    void sacar (double saque) {
        saldo = saldo - saque;
    }

    void depositar (double deposito) {
        saldo = saldo + deposito;
    }

    double saldo () {
        return saldo;
    }

    void render () {
        saldo = saldo * 1.01;
    }
}
