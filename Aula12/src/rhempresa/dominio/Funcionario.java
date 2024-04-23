package rhempresa.dominio;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double lerBonificacao() {
        return salario * 0.10;
    }

    public void holerite(){
        System.out.println("O funcionário " + nome + ", do CPF:" + cpf + ", recebeu " + salario + " de salário esse mês," +
                " com " + lerBonificacao() + " de bonificação");
    }

}
