package fiapfolha.dominio;

import fiapfolha.servico.Horista;

import java.time.LocalDateTime;

public class Mecanico extends Funcionario implements Horista {
    private double plr;

    public Mecanico(double salario, String chapa, LocalDateTime dataAdmissao, double plr) {
        super(salario, chapa, dataAdmissao);
        this.plr = plr;
    }

    public double lerSalario() {
        return salario + plr;
    }
}
