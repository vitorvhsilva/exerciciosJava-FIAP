import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;
        ArrayList<Roteiro> roteiros = new ArrayList<>();

        System.out.println("Bem vindo professor, qual o seu nome?");
        String nome = leitor.nextLine();

        System.out.println("Olá Prof " + nome);

        while (continuar) {
            System.out.println("Digite a disciplina a ser ministrada:");
            String disciplina = leitor.nextLine();

            System.out.println("Certo. Informe também o nome da aula:");
            String aula = leitor.nextLine();

            System.out.println("Por último, informe o conteúdo da aula:");
            String conteudo = leitor.nextLine();

            roteiros.add(new Roteiro(disciplina, aula, conteudo));


            System.out.println("Roteiro cadastrado Prof. " + nome + ". \n" +
                    "Deseja cadastrar mais algum roteiro? 1 - Sim, 2 - Não");
            int verificacao = leitor.nextInt();leitor.nextLine();

            if (verificacao != 1){
                continuar = false;
            }
        }

        System.out.println("Os roteiros cadastrados foram:");

        for (Roteiro roteiro : roteiros) {
            System.out.println("Disciplina: " + roteiro.getDisciplina() + "\n" +
                    "Aula: " + roteiro.getAula() + "\n" +
                    "Conteúdo: " + roteiro.getConteudo() + "\n");
        }

        leitor.close();
    }
}