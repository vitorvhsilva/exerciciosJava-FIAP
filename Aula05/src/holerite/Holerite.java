package holerite;

import java.util.ArrayList;

public class Holerite {

    String descritivo;

    double pagamento;
    ArrayList<Desconto> descontos;

    Holerite (String descritivo, double pagamento, ArrayList<Desconto> descontos) {
        this.descritivo = descritivo;
        this.pagamento = pagamento;
        this.descontos = descontos;
    }

    double getPagamento () {
        return pagamento;
    }

    String getDescritivo () {
        return descritivo;
    }

    ArrayList<Desconto> getDesconto () {
        return descontos;
    }

}
