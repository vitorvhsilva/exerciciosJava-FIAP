package flecha.miniautorizador.servico;

import flecha.miniautorizador.dominio.Trabalhador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ServicoDeAutorizacao {

    private ArrayList<Trabalhador> trabalhadores;
    private Trabalhador trabalhador;
    private LocalDateTime dataDaCompra = LocalDateTime.now();
    DateTimeFormatter dataDaCompraFormatado = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public ServicoDeAutorizacao(ArrayList<Trabalhador> trabalhadores, Trabalhador trabalhador) {
        this.trabalhadores = trabalhadores;
        this.trabalhador = trabalhador;
    }

    public void comprovanteCompra (double valorCompra) {
        System.out.println("\nDATA E HORA DA COMPRA: " + dataDaCompra.format(dataDaCompraFormatado) +
                "\nVALOR A SER PAGO: " + trabalhador.getCartaoValor() +
                "\n" + trabalhador.getNome().toUpperCase() +
                "\nNUMERO DO CARTÃO: " + trabalhador.getCartaoNumero() +
                "\n\nSALDO ATUAL: " + (valorCompra - trabalhador.getCartaoValor()));
    }

    public boolean cartaoExiste() {
        for (Trabalhador trabalhadorSelecionado: trabalhadores) {
            if (trabalhador.getNome().equals(trabalhadorSelecionado.getNome())
                    && (trabalhador.getCartaoNumero() ==  trabalhadorSelecionado.getCartaoNumero())) {
                return true;
            }
        }
        System.out.println("O Cartão não existe no registro!");
        return false;
    }

    public boolean verificarSaldo() {
        if (cartaoExiste()) {
            for (Trabalhador trabalhadorSelecionado: trabalhadores) {
                if (trabalhador.getCartaoValor() <= trabalhadorSelecionado.getCartaoValor()) {
                    return true;
                }
            }
            System.out.println("Saldo menor que a transação!");
            return false;
        }
        return false;
    }

    public void autorizarTransacao() {
        if (verificarSaldo()) {
            for (Trabalhador trabalhadorSelecionado: trabalhadores) {
                if (trabalhador.getCartaoSenha() == trabalhadorSelecionado.getCartaoSenha()) {
                    System.out.println("\nAutorizado");
                    comprovanteCompra(trabalhadorSelecionado.getCartaoValor());
                    return;
                }
            }
            System.out.println("Senha recusada!");
        }
    }


// codigo haduken :P

//    public void autorizarTransacao() {
//        for (Trabalhador trabalhadorSelecionado: trabalhadores) {
//            if (trabalhador.getNome().equals(trabalhadorSelecionado.getNome())
//                    && (trabalhador.getCartaoNumero() ==  trabalhadorSelecionado.getCartaoNumero())){
//                if  (trabalhador.getCartaoValor() <=  trabalhadorSelecionado.getCartaoValor()) {
//                    if (trabalhador.getCartaoSenha() == trabalhadorSelecionado.getCartaoSenha()) {
//                        System.out.println("\nAutorizado");
//                        comprovanteCompra(trabalhadorSelecionado.getCartaoValor());
//                        return;
//                    }
//                    System.out.println("Senha recusada!");
//                    return;
//                }
//                System.out.println("Saldo menor que a transação!");
//                return;
//            }
//        }
//        System.out.println("O Cartão não existe no registro!");
//    }
}
