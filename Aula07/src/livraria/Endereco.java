package livraria;

public class Endereco {
    String logradouro;
    String numero;
    String cep;

    Endereco(String logradouro, String numero, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

    String getLogradouro () {
        return logradouro;
    }
    String getNumero () {
        return numero;
    }
    String getCep () {
        return cep;
    }

}
