package livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Endereco> enderecos = new ArrayList<>();
        ArrayList<String> nomesCad = new ArrayList<>();
        ArrayList<Integer> senhasCad = new ArrayList<>();
        ArrayList<String> nomesLog = new ArrayList<>();
        ArrayList<Integer> senhasLog = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        boolean novoCadastro = true;

        for (int a = 0; novoCadastro; a++) {

            livros.clear();

            for (int i = 1; i < 6; i++) {
                livros.add(new Livro(("Livro " + i), (100 * i)));
            }

            double valorTot = 0;
            String nomeLivro = null;
            boolean loop = true;

            System.out.println("Bem vindo!");

            System.out.println("Digite o seu nome para cadastro: ");
            nomesCad.add(leitor.next());

            System.out.println("Digite a sua senha para cadastro: ");
            senhasCad.add(leitor.nextInt()) ;

            System.out.println("Informe o logradouro do seu endereco: ");
            String logradouro = leitor.next();

            System.out.println("Informe o numero do seu endereco: ");
            String numero = leitor.next();

            System.out.println("Informe o CEP do seu endereco: ");
            String cep = leitor.next();

            enderecos.add(new Endereco(logradouro, numero, cep));

            Usuario usuario = new Usuario(nomesCad.get(a), senhasCad.get(a), enderecos);

            System.out.println("Digite o seu nome para login: ");
            nomesLog.add(leitor.next());

            System.out.println("Digite a sua senha para login: ");
            senhasLog.add(leitor.nextInt()) ;

            if (usuario.validar(nomesLog.get(a), senhasLog.get(a))) {
                while (loop) {
                    System.out.println("Bem vindo " + nomesLog.get(a));
                    System.out.println("Qual livro deseja comprar hoje?");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println(livros.get(i).getNome() + " Digite " + (i) + " para adicionar ao carrinho" + '\n' +
                                livros.get(i).getValor());
                    }

                    System.out.println("Digite o livro desejado: ");
                    int escolha = leitor.nextInt();

                    nomeLivro = livros.get(escolha).getNome();
                    valorTot += livros.get(escolha).getValor();
                    livros.remove(escolha);

                    System.out.println("Livro Selecionado: " + nomeLivro);
                    System.out.println("Total do pedido: " + valorTot);

                    System.out.println("Deseja continuar? 1-S / 2-N");
                    int continuar = leitor.nextInt();

                    if (continuar != 1) {
                        loop = false;
                    }

                }
                System.out.println("Informe seu cartão de crédito: ");
                int cc = leitor.nextInt();
                System.out.println("Pedido será enviado para: " + nomesLog.get(a) + '\n' +
                        "Logradouro: " + enderecos.get(a).getLogradouro() + '\n' +
                        "Numero: " + enderecos.get(a).getNumero() + '\n' +
                        "CEP: " + enderecos.get(a).getCep() + '\n');

            } else {
                System.out.println("Login ou senha errado");
            }
            System.out.println("Cadastrar um novo usuario? 1-S / 2-N");
            int continuar2 = leitor.nextInt();

            if (continuar2 != 1) {
                novoCadastro = false;
            }
        }

        leitor.close();

        System.out.println("Obrigado pela preferencia!");

        for (int b = 0; b < nomesCad.size(); b++) {
            System.out.println("Usuarios Cadastrados:" + '\n' +
                    "Nome :" + nomesCad.get(b) + '\n' +
                    "Senha :" + senhasCad.get(b) + '\n' +
                    "Logradouro: " + enderecos.get(b).getLogradouro() + '\n' +
                    "Numero: " + enderecos.get(b).getNumero() + '\n' +
                    "CEP: " + enderecos.get(b).getCep() + '\n');
        }
    }
}