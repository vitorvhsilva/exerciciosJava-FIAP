package navios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Comandante> comandantes = new ArrayList<>();

        comandantes.add(
                new Comandante("Victor", 23, new Navio("STR-23211", 0, true)));

        comandantes.add(
                new Comandante("Robson", 32, new Navio("T-Y23", 82.6, false)));

        comandantes.add(
                new Comandante("Breno", 54, new Navio("UZ-267-R", 0,true)));

        System.out.println("Comandantes cadastrados: ");
        for (Comandante comandante: comandantes) {
            System.out.println("Comandante: " + comandante.getNome() + ",\n" +
                    "Idade: " + comandante.getIdade() + ",\n" +
                    "Navio: " + comandante.getNavioNome() + ",\n" +
                    "Velocidade Atual do Navio: " + comandante.getNavioVelocidade() + "\n");
        }

        comandantes.get(0).atracarNavio();

        comandantes.get(0).aumentarVelocidade(78.2);

        comandantes.get(0).diminuirVelocidade(42.2);

        comandantes.get(0).diminuirVelocidade(40.2);

        comandantes.get(0).atracarNavio();

        comandantes.get(1).diminuirVelocidade(90);

        comandantes.get(1).atracarNavio();

        comandantes.get(1).diminuirVelocidade(65);

        comandantes.get(1).atracarNavio();

        comandantes.get(2).atracarNavio();

        comandantes.get(2).diminuirVelocidade(90);

        comandantes.get(2).aumentarVelocidade(70);

        comandantes.get(2).aumentarVelocidade(5);

        comandantes.get(2).diminuirVelocidade(90);

        comandantes.get(2).atracarNavio();

    }
}
