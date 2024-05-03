package fiapfolha.dominio;

import fiapfolha.servico.Autenticavel;
import fiapfolha.servico.Mensalista;

import java.time.LocalDateTime;

public class Gerente extends Funcionario implements Autenticavel, Mensalista {
    private double bonus;

    public Gerente(double salario, String chapa, LocalDateTime dataAdmissao, double bonus) {
        super(salario, chapa, dataAdmissao);
        this.bonus = bonus;
    }

    @Override
    public void autenticar() {
        System.out.println("Autenticado");
    }

    public double lerSalario() {
        return salario + bonus;
    }
}
