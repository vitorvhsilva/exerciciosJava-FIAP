package exercicios;

import java.util.Scanner;

public class ExercicioMediaeMulti {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int num1 = leitorDeDados.nextInt();

        System.out.println("Digite o segundo numero:");
        int num2 = leitorDeDados.nextInt();

        System.out.println("Digite o terceiro numero:");
        int num3 = leitorDeDados.nextInt();

        leitorDeDados.close();

        double media = (num1 + num2 + num3) / 3;
        int multi = num1 * num2 * num3;

        System.out.println("A Média entre os numeros é: " + media);
        System.out.println("A Multiplicação entre os numeros é: " + multi);
    }
}
