import javax.swing.*;
import java.util.Scanner;

public class ImprimirFuncionarioMelhorado {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.println("Digite o nome do Funcionário: ");
        String nome = leitorDeDados.next();

        System.out.println("Digite a idade: ");
        int idade = leitorDeDados.nextInt();

        System.out.println("Digite o salário: ");
        double salario = leitorDeDados.nextDouble();

        System.out.println("Digite o sexo: ");
        char sexo = 'M';

        System.out.println("O Usuário é casado?: ");
        boolean casado = leitorDeDados.nextBoolean();

        leitorDeDados.close();

        String descritivoDoFuncionario = "Funcionario de nome: " + nome + ", idade: " + idade +
                ", salário: R$" + salario + ", genero: " + sexo + ", casado: " + casado;

        System.out.println(descritivoDoFuncionario);

        System.out.printf("Funcionário de nome: %s, Idade: %d", nome, idade);

        JOptionPane.showMessageDialog(null, descritivoDoFuncionario);
    }
}