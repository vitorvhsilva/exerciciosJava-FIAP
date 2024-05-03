package fiapfolha.dominio;

import fiapfolha.servico.Autenticavel;
import fiapfolha.servico.Mensalista;

import java.time.LocalDateTime;

public class AssistenteRH extends Funcionario implements Autenticavel, Mensalista {
    private double porcentagemComissao;

    public AssistenteRH(double salario, String chapa, LocalDateTime dataAdmissao, double porcentagemComissao) {
        super(salario, chapa, dataAdmissao);
        this.porcentagemComissao = porcentagemComissao;
    }

    @Override
    public void autenticar() {
        System.out.println("Autenticado");
    }

    public double lerSalario() {
        return salario + ((salario * porcentagemComissao) / 100);
    }

}
