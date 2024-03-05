package exercicios;

import java.util.Scanner;

public class ExercicioSucessorAntecessor {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.println("Digite o número: ");
        double num = leitorDeDados.nextInt();

        double numant = num - 1;
        double numsuc = num + 1;

        System.out.println("Valor original: " + num);
        System.out.println("Antecessor: " + numant);
        System.out.println("Sucessor: " + numsuc);
    }
}
