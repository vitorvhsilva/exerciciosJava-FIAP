package holerite;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pagamento salarioJaneiro = new Pagamento("Salario do mês de Janeiro", 10000.0);
        Desconto aluguelJaneiro = new Desconto("Aluguel do mês de Janeiro", 1200.0);
        Desconto luzJaneiro = new Desconto("Conta de luz do mês de Janeiro", 300.0);
        Desconto aguaJaneiro = new Desconto("Conta de agua do mês de Janeiro", 300.0);
        Desconto mercadoJaneiro = new Desconto("Mercado do mês de Janeiro", 300.0);

        ArrayList<Desconto> descontos = new ArrayList<>();

        descontos.add(aluguelJaneiro);
        descontos.add(luzJaneiro);
        descontos.add(aguaJaneiro);
        descontos.add(mercadoJaneiro);

        Holerite holerite = new Holerite(salarioJaneiro.descritivo, salarioJaneiro.valor, descontos);

        double salarioLiquido = salarioJaneiro.valor;

        System.out.println("Seu pagamento do mes foi: " + salarioJaneiro.valor + "\n" +
                "Seus descontos sao: " );
        for (int i = 0; i < holerite.getDesconto().size(); i++) {
            System.out.println(holerite.getDesconto().get(i).descritivo + " " +
                    holerite.getDesconto().get(i).valor + "\n");
            salarioLiquido -= holerite.getDesconto().get(i).valor;
        }

        System.out.println("Seu salario liquido foi: " + salarioLiquido);

    }
}
