package rhempresa.dominio;

public class Gerente extends Funcionario {

    private int quantidadeFuncionarios;
    public Gerente(String nome, String cpf, double salario, int quantidadeFuncionarios) {
        super(nome, cpf, salario);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double lerBonificacao() {
        return salario * 0.15;
    }

    public void holerite(){
        System.out.println("O gerente " + nome + ", do CPF:" + cpf + ", que tem " + quantidadeFuncionarios +
                " funcionários, recebeu " + salario + " de salário esse mês," +
                " com " + lerBonificacao() + " de bonificação");
    }


}
