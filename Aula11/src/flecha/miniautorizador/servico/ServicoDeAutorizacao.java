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

    public void autorizarTransacao() {
        for (int i = 0; i < trabalhadores.size(); i++) {
            if (trabalhador.getNome().equals(trabalhadores.get(i).getNome())
                    && (trabalhador.getCartaoNumero() ==  trabalhadores.get(i).getCartaoNumero())){
                if  (trabalhador.getCartaoValor() <=  trabalhadores.get(i).getCartaoValor()) {
                    if (trabalhador.getCartaoSenha() == trabalhadores.get(i).getCartaoSenha()) {
                        System.out.println("Autorizado");
                        comprovanteCompra(trabalhadores.get(i).getCartaoValor());
                        return;
                    }
                    System.out.println("Senha recusada!");
                    return;
                }
                System.out.println("Saldo menor que a transação!");
                return;
            }
            System.out.println("O Cartão não existe no registro!");
        }
    }
}
