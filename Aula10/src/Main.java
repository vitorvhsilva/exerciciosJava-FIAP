import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomeTrabalhadores = new ArrayList<>();
        ArrayList<Cartao> Cartoes = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        nomeTrabalhadores.add("Carlos");
        Cartoes.add(new Cartao(323232, 200, 4242));
        nomeTrabalhadores.add("João");
        Cartoes.add(new Cartao(532525, 100, 5656));
        nomeTrabalhadores.add("Matheus");
        Cartoes.add(new Cartao(213677, 1000, 1478));

        System.out.println("Olá, obrigado por usar a maquininha! \nDigite seu nome:");
        String nome = leitor.nextLine();

        System.out.println(nome + ", digite o número do seu cartão: ");
        int numero = leitor.nextInt();leitor.nextLine();

        System.out.println(nome + ", qual o valor enviado na transação: ");
        double valor = leitor.nextDouble();

        ServicoDeAutorizacao servico = new ServicoDeAutorizacao(nomeTrabalhadores, Cartoes, nome, numero, valor);

        servico.autorizarTransacao();




    }
}