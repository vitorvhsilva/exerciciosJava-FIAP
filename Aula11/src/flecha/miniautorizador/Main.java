package flecha.miniautorizador;

import flecha.miniautorizador.dominio.Cartao;
import flecha.miniautorizador.dominio.Trabalhador;
import flecha.miniautorizador.servico.ServicoDeAutorizacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Trabalhador> trabalhadores = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);


        trabalhadores.add(new Trabalhador("João Silva", new Cartao(343242, 100, 9292)));
        trabalhadores.add(new Trabalhador("Matheus Gregório", new Cartao(232113, 200, 4242)));
        trabalhadores.add(new Trabalhador("Vitor do Amaral", new Cartao(923219, 1000, 8181)));


        System.out.println("Olá, obrigado por usar a maquininha! \nDigite seu nome:");
        String nome = leitor.nextLine();

        System.out.println(nome + ", digite o número do seu cartão: ");
        int numero = leitor.nextInt();leitor.nextLine();

        System.out.println(nome + ", qual o valor enviado na transação: ");
        double valor = leitor.nextDouble();leitor.nextLine();

        System.out.println(nome + ", qual a sua senha: ");
        int senha = leitor.nextInt();leitor.nextLine();

        ServicoDeAutorizacao servico = new ServicoDeAutorizacao(trabalhadores, new Trabalhador(nome,
                new Cartao(numero, valor, senha)));

        servico.autorizarTransacao();

    }
}