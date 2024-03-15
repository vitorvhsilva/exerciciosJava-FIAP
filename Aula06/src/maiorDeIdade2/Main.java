package maiorDeIdade2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor", 17);
        Pessoa pessoa2 = new Pessoa("Sidnei", 55);
        Pessoa pessoa3 = new Pessoa("Vp", 18);
        Pessoa pessoa4 = new Pessoa("Tena", 20);
        Pessoa pessoa5 = new Pessoa("Johnny", 14);
        Pessoa pessoa6 = new Pessoa("Miguel", 9);
        Pessoa pessoa7 = new Pessoa("Helena", 14);
        Pessoa pessoa8 = new Pessoa("Gael", 20);
        Pessoa pessoa9 = new Pessoa("Isaac", 22);
        Pessoa pessoa10 = new Pessoa("Maya", 15);

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        pessoas.add(pessoa6);
        pessoas.add(pessoa7);
        pessoas.add(pessoa8);
        pessoas.add(pessoa9);
        pessoas.add(pessoa10);

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println("Nome: " + pessoas.get(i).getNome() + "\n" +
                    "Idade: " + pessoas.get(i).getIdade() + "\n" +
                    "Maior de Idade: " + pessoas.get(i).ehMaiorDeIdade() + "\n" );
        }





    }
}