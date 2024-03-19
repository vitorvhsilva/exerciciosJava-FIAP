package livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<>();

        Livro livro1 = new Livro("Livro 1", 250);
        Livro livro2 = new Livro("Livro 2", 150);
        Livro livro3 = new Livro("Livro 3", 100);

        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        int valorTot = 0;
        String nomeLivro = null;

        System.out.println("Bem vindo!");
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome para cadastro: ");
        String nomeCad = leitor.next();

        System.out.println("Digite a sua senha para cadastro: ");
        int senhaCad = leitor.nextInt();

        System.out.println("Informe seu endereço para cadastro: ");
        String endereco = leitor.next();

        Usuario usuario = new Usuario(nomeCad, senhaCad, endereco);

        System.out.println("Digite o seu nome para login: ");
        String nomeLog = leitor.next();

        System.out.println("Digite a sua senha para login: ");
        int senhaLog = leitor.nextInt();

        if (usuario.validar(nomeLog, senhaLog)) {
            System.out.println("Bem vindo " + nomeLog);
            System.out.println("Qual livro deseja comprar hoje?");
            for (int i = 0; i < livros.size(); i++) {
                System.out.println(livros.get(i).getNome() + " Digite " + (i + 1) + " para adicionar ao carrinho" + "\n" +
                        livros.get(i).getValor());
            }
            System.out.println("Digite o livro desejado: ");
            int escolha = leitor.nextInt();
            switch (escolha) {
                case 1:
                    nomeLivro = livros.get(0).nome;
                    valorTot += livros.get(0).valor;
                    break;
                case 2:
                    nomeLivro = livros.get(1).nome;
                    valorTot += livros.get(1).valor;
                    break;
                case 3:
                    nomeLivro = livros.get(2).nome;
                    valorTot += livros.get(2).valor;
                    break;
                default:
                    System.out.println("Valor incorreto informado");
                    break;
            }
            System.out.println("Livro Selecionado: " + nomeLivro);
            System.out.println("Total do pedido: " + valorTot);
            System.out.println("Informe seu cartão de crédito: ");
            int cc = leitor.nextInt();
            leitor.close();
            System.out.println("Pedido será enviada para: " + endereco);
        } else {
            System.out.println("Login ou senha errado");
        }



    }
}