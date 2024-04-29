package escritorio.dominio;

public class Assistente extends Funcionario {
    public Assistente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calculaSalario() {
        return salarioBase;
    }
}
