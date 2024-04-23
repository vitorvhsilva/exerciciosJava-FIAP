package rhempresa.dominio;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gerente extends Funcionario {
    ArrayList<Funcionario> funcionarios;
    public Gerente(String nome, String cpf, double salario, ArrayList<Funcionario> funcionarios) {
        super(nome, cpf, salario);
        this.funcionarios = funcionarios;
    }

    public double lerBonificacao() {
        return salario * 0.15;
    }

    public void holerite(){
        System.out.println("O gerente " + nome + ", do CPF:" + cpf + ", recebeu " + salario + " de salário esse mês," +
                " com " + lerBonificacao() + " de bonificação");
        verFuncionarios();
    }

    public void verFuncionarios () {
        System.out.println("Funcionários do " + nome + "");
        for (Funcionario funcionario : funcionarios){
            System.out.println(funcionario.getNome() + " " + funcionario.getCpf() + " " + funcionario.getSalario());
        }
        System.out.println("");
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
