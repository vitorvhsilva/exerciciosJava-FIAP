package exercicio;

public class Pedido {

    double valorTotal = 0;


    Pedido(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    void novaCompra(double valorProduto){
        valorTotal += valorProduto;
    }

    double valorPedido(){
        return valorTotal;
    }
}
