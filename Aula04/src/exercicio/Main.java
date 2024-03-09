package exercicio;

public class Main {
    public static void main (String[] args){
        Pedido pedido = new Pedido(0);

        ItemPedido livro1 = new ItemPedido("Coletanea Harry Potter", 100.0);
        ItemPedido livro2 = new ItemPedido("Percy Jackson e os Olimpianos", 20.0);
        ItemPedido livro3 = new ItemPedido("O Senhor dos Anéis", 50.0);

        pedido.novaCompra(livro1.valorProduto);
        pedido.novaCompra(livro2.valorProduto);
        pedido.novaCompra(livro3.valorProduto);

        System.out.println(pedido.valorPedido());


    }
}
