package exercicios;

import java.util.Scanner;

public class ExercicioAumentoSalario {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = leitorDeDados.next();

        System.out.println("Digite o salário do funcionário: ");
        double salario = leitorDeDados.nextDouble();

        double salarioReajustado = salario * 1.10;

        System.out.println(nome);
        System.out.println(salario);

        System.out.println("Olá, " + nome +  ", seu novo salário será de R$: " + salarioReajustado);


    }
}
