package livraria;

public class Livro {
    String nome;
    double valor;

    Livro(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    String getNome() {
        return nome;
    }

    double getValor() {
        return valor;
    }
}
