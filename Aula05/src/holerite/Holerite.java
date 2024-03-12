package holerite;

import java.util.ArrayList;

public class Holerite {

    double valorTotal;
    ArrayList<Desconto> descontos;

    Holerite (String descritivo, double pagamento, ArrayList<Desconto> descontos) {
        this.descritivo = descritivo;
        this.pagamento = pagamento;
        this.descontos = descontos;
    }

    double holerite (double pagamento, String descritivo, ArrayList<Desconto> descontos) {

    }
}
