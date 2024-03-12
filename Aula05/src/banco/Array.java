package banco;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeInteiros = new ArrayList<>();
        ArrayList<String> listaDeStrings = new ArrayList<>();

        listaDeInteiros.add(1);
        listaDeInteiros.add(2);

        listaDeStrings.add("Esse é um texto");
        listaDeStrings.add("Esse é outro texto");

        System.out.println(listaDeInteiros.size());
        System.out.println(listaDeStrings.size());

        System.out.println();

        System.out.println(listaDeInteiros.get(1));
        System.out.println(listaDeStrings.get(1));
    }
}
