package menorNum;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> inteiros = new ArrayList<>();

        Random gerador = new Random();

        for (int i = 1; i <= 15; i++) {
            inteiros.add(gerador.nextInt());
        }

        System.out.println(inteiros);

        int numArray = inteiros.get(0);

        for (int i = 0; i < inteiros.size(); i++) {
            if (numArray > inteiros.get(i)){
                numArray = inteiros.get(i);
            }
        }

        System.out.println(numArray);


    }
}
