package flecha.miniautorizador.servico;

import flecha.miniautorizador.dominio.Cartao;
import flecha.miniautorizador.dominio.Estabelecimento;
import flecha.miniautorizador.dominio.Trabalhador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ServicoDeAutorizacao {

    private ArrayList<Trabalhador> trabalhadores;
    private ArrayList<Estabelecimento> estabelecimentos;
    private Trabalhador trabalhador;
    private Estabelecimento estabelecimento;
    private LocalDateTime dataDaCompra = LocalDateTime.now();
    DateTimeFormatter dataDaCompraFormatado = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public ServicoDeAutorizacao(ArrayList<Trabalhador> trabalhadores, Trabalhador trabalhador,
                                ArrayList<Estabelecimento> estabelecimentos, Estabelecimento estabelecimento) {
        this.trabalhadores = trabalhadores;
        this.trabalhador = trabalhador;
        this.estabelecimentos = estabelecimentos;
        this.estabelecimento = estabelecimento;
    }

    public void comprovanteCompra (double valorCompra) {
        System.out.println("\nDATA E HORA DA COMPRA: " + dataDaCompra.format(dataDaCompraFormatado) +
                "\nVALOR A SER PAGO: " + trabalhador.getCartaoValor() +
                "\n" + trabalhador.getNome().toUpperCase() +
                "\nNUMERO DO CARTÃO: " + trabalhador.getCartaoNumero() +
                "\n\nSALDO ATUAL: " + (valorCompra - trabalhador.getCartaoValor()));
    }

//    public boolean cartaoExiste() {
//        for (Trabalhador trabalhadorSelecionado: trabalhadores) {
//            if (trabalhador.getNome().equals(trabalhadorSelecionado.getNome())
//                    && (trabalhador.getCartaoNumero() ==  trabalhadorSelecionado.getCartaoNumero())) {
//                return true;
//            }
//        }
//        System.out.println("O Cartão não existe no registro!");
//        return false;
//    }
//
//    public boolean verificarSaldo() {
//        if (cartaoExiste()) {
//            for (Trabalhador trabalhadorSelecionado: trabalhadores) {
//                if (trabalhador.getCartaoValor() <= trabalhadorSelecionado.getCartaoValor()) {
//                    return true;
//                }
//            }
//            System.out.println("Saldo menor que a transação!");
//            return false;
//        }
//        return false;
//    }
//
//    public void autorizarEstabelecimento() {
//        if (verificarSaldo()) {
//            for (Estabelecimento estabelecimentoSelecionado : estabelecimentos) {
//                if (estabelecimento.getNome().equals(estabelecimentoSelecionado.getNome()) &&
//                        estabelecimento.estabelecimentoAceitaVR()) {
//
//                }
//            }
//            System.out.println("Estabelecimento nao credenciado!");
//        }
//    }

    public boolean autorizarTransacao(Trabalhador trabalhador, Estabelecimento estabelecimento) {
        Trabalhador trabalhadorSelecionado = verificarTrabalhador(trabalhador);
        Estabelecimento estabelecimentoSelecionado = verificarEstabelecimento(estabelecimento);
        if (trabalhadorSelecionado != null) {

            return (trabalhadorSelecionado.getCartaoSenha() == trabalhador.getCartaoSenha()) &&
                    (trabalhadorSelecionado.getCartaoValor() <= tra)
        }
    }

    private Estabelecimento verificarEstabelecimento(Estabelecimento estabelecimento) {
        for (Estabelecimento estabelecimentoSelecionado : estabelecimentos) {
            String nomeEstabelecimento = estabelecimento.getNome();
            if (nomeEstabelecimento.equals(estabelecimentoSelecionado.getNome())) {
                return estabelecimento;
            }
        }
        return null;
    }

    private Trabalhador verificarTrabalhador(Trabalhador trabalhador) {
        for (Trabalhador trabalhadorSelecionado : trabalhadores) {
            int numeroCartao = trabalhador.getCartaoNumero();
            if (numeroCartao == trabalhadorSelecionado.getCartaoNumero()) {
                return trabalhador;
            }
        }
        return null;
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
