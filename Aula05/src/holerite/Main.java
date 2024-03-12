package holerite;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pagamento salarioJaneiro = new Pagamento("Salario do mês de Janeiro", 10000.0);
        Desconto aluguelJaneiro = new Desconto("Aluguel do mês de Janeiro", 1200.0);

        ArrayList<Desconto> descontos = new ArrayList<>();

        holerite.add(salarioJaneiro);

    }
}
