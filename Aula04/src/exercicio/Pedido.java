package exercicio;

public class Pedido {

    double valorTotal;

    Pedido() {
        this.valorTotal = 0;
    }

    void novaCompra(double valorProduto){
        valorTotal += valorProduto;
    }

    double valorPedido(){
        return valorTotal;
    }
}
