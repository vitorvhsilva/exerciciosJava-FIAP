package exercicio;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        ItemPedido livro1 = new ItemPedido("Coletanea Harry Potter", 100.0);
        ItemPedido livro2 = new ItemPedido("Percy Jackson e os Olimpianos", 20.0);
        ItemPedido livro3 = new ItemPedido("O Senhor dos Anéis", 50.0);

        ArrayList<ItemPedido> itens = new ArrayList<>();
        itens.add(livro1);
        itens.add(livro2);
        itens.add(livro3);


        Pedido pedido = new Pedido(itens);

        System.out.println("O valor do pedido e: " + pedido.valor());



    }
}
