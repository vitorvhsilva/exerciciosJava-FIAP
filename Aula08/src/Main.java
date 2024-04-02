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
                System.out.println("Roteiros cadastrados!");
            }
        }

        Professor prof1 = new Professor(nome, roteiros);

        System.out.println("Prof " + nome + ", os roteiros cadastrados foram:");

        for (int i = 0; i < roteiros.size(); i++) {
            System.out.println("Disciplina: " + prof1.getRoteiro().get(i).getDisciplina() + "\n" +
                    "Aula: " + prof1.getRoteiro().get(i).getAula() + "\n" +
                    "Conteúdo: " + prof1.getRoteiro().get(i).getConteudo() + "\n");
        }

        leitor.close();
    }
}