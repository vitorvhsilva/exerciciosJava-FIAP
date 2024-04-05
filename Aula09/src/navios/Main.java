package navios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Comandante> comandantes = new ArrayList<>();

        comandantes.add(
                new Comandante("Victor", 23, new Navio("STR-23211", 120.7, true)));

        comandantes.add(
                new Comandante("Robson", 32, new Navio("T-Y23", 82.6, false)));

        comandantes.add(
                new Comandante("Breno", 54, new Navio("UZ-267-R", 144,true)));

        System.out.println("Comandantes cadastrados: ");
        for (int i = 0; i < comandantes.size(); i++) {
            System.out.println("Comandante: " + comandantes.get(i).getNome() + ",\n" +
                    "Idade: " + comandantes.get(i).getIdade() + ",\n" +
                    "Navio: " + comandantes.get(i).getNavio().getNome() + ",\n" +
                    "Velocidade Atual do Navio: " + comandantes.get(i).getNavio().getVelocidade() + "\n");
        }

        comandantes.get(0).getNavio().aumentarVelocidade(78.2);

        comandantes.get(0).getNavio().atracarNavio();

        comandantes.get(0).getNavio().aumentarVelocidade(78.2);

        comandantes.get(0).getNavio().diminuirVelocidade(42.2);

        comandantes.get(0).getNavio().diminuirVelocidade(40.2);

        comandantes.get(0).getNavio().atracarNavio();

        comandantes.get(1).getNavio().diminuirVelocidade(90);

        comandantes.get(1).getNavio().atracarNavio();

        comandantes.get(1).getNavio().diminuirVelocidade(65);

        comandantes.get(1).getNavio().atracarNavio();

        comandantes.get(2).getNavio().atracarNavio();

        comandantes.get(2).getNavio().diminuirVelocidade(90);

        comandantes.get(2).getNavio().aumentarVelocidade(200);

        comandantes.get(2).getNavio().aumentarVelocidade(13);

        comandantes.get(2).getNavio().diminuirVelocidade(90);

        comandantes.get(2).getNavio().diminuirVelocidade(127);

        comandantes.get(2).getNavio().atracarNavio();


    }
}
