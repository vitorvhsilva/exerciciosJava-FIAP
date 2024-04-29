package escritorio.dominio;

public abstract class Funcionario {
    private String nome;
    private String matricula;
    protected double salarioBase;

    public Funcionario (String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calculaSalario();

    public void folhaSalarial(){
        System.out.println("Funcionario: " + nome + ", Matricula: " + matricula + ", Salario: " + salarioBase + "\n");
    }
}
