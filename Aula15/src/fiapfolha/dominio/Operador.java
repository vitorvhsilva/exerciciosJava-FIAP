package fiapfolha.dominio;

import fiapfolha.servico.Horista;

import java.time.LocalDateTime;

public class Operador extends Funcionario implements Horista {
    public Operador(double salario, String chapa, LocalDateTime dataAdmissao) {
        super(salario, chapa, dataAdmissao);
    }

    @Override
    public double lerSalario() {
        return salario;
    }
}
