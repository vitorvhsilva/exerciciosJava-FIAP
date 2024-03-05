import javax.swing.*;

public class imprimirFuncionario {
    public static void main(String[] args) {
        int idade = 45;
        double salario = 15564.00;
        char genero = 'M';
        boolean casado = true;
        String nome = "Professor Lindo";

        String descritivoDoFuncionario = "Funcionario de nome: " + nome + ", idade: " + idade + ", genero: " + genero +
                ", casado: " + casado;

        System.out.println(descritivoDoFuncionario);

        System.out.printf("Funcionário de nome: %s, Idade: %d", nome, idade);

        JOptionPane.showMessageDialog(null, descritivoDoFuncionario);
    }
}