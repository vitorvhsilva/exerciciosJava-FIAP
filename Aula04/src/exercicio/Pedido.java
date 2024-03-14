package exercicio;

import java.util.ArrayList;

public class Pedido {

    double valorTotal;
    ArrayList<ItemPedido> itensPedidos;

    Pedido(ArrayList<ItemPedido> itens) {
        this.itensPedidos = itens;
    }

    double valor(){

        for (ItemPedido item : itensPedidos) {
            valorTotal += item.valor();
        }

//        for (int i = 0; i < itensPedidos.size(); i++) {
//            ItemPedido item = itensPedidos.get(i);
//            valorTotal += item.valor();
//
//        }

        return valorTotal;
    }
}
