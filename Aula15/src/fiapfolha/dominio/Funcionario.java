package fiapfolha.dominio;

import java.time.LocalDateTime;

public abstract class Funcionario {
    protected double salario;
    private String chapa;
    private LocalDateTime dataAdmissao;

    public Funcionario(double salario, String chapa, LocalDateTime dataAdmissao) {
        this.salario = salario;
        this.chapa = chapa;
        this.dataAdmissao = dataAdmissao;
    }
}
