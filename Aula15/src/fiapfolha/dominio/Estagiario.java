package fiapfolha.dominio;

import fiapfolha.servico.Mensalista;

import java.time.LocalDateTime;

public class Estagiario extends Funcionario implements Mensalista {
    private double valeTransporte;

    public Estagiario(double salario, String chapa, LocalDateTime dataAdmissao, double valeTransporte) {
        super(salario, chapa, dataAdmissao);
        this.valeTransporte = valeTransporte;
    }

    public double lerSalario() {
        return salario + valeTransporte;
    }
}
