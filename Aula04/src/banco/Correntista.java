package banco;

public class Correntista {

    String nome;
    double cpf;
    String cartaoCredito;
    ContaCorrente contaCorrente;

    Correntista (String nome, double cpf, String cartaoCredito, ContaCorrente contaCorrente) {
        this.nome = nome;
        this.cpf = cpf;
        this.cartaoCredito = cartaoCredito;
        this.contaCorrente = contaCorrente;
    }

    void transferencia (double valor, ContaCorrente contaSacada, ContaCorrente contaCreditada) {

    }

    String getCartaoCredito (){
        return cartaoCredito;
    }

}
