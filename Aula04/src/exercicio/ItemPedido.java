package exercicio;

public class ItemPedido {
    String nome;

    double valor;

    ItemPedido (String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    double valor(){
        return valor;
    }
}
