package exercicio;

public class ItemPedido {
    String nomeProduto;

    double valorProduto;

    ItemPedido (String nomeProduto, double valorProduto){
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    double valorItemPedido(){
        return valorProduto;
    }
}
