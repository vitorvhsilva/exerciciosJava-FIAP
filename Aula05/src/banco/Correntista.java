package banco;

import java.util.ArrayList;

public class Correntista {

    String nome;
    String cpf;
    String cartaoCredito;
    ArrayList contasCorrente;

    Correntista (String nome, String cpf, String cartaoCredito, ArrayList<ContaCorrente> contasCorrente) {
        this.nome = nome;
        this.cpf = cpf;
        this.cartaoCredito = cartaoCredito;
        this.contasCorrente = contasCorrente;
    }

    void transferencia (double valor, ContaCorrente contaSacada, ContaCorrente contaCreditada) {

    }

    String getCartaoCredito (){
        return cartaoCredito;
    }

}
