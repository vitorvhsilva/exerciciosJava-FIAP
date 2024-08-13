package model;

public class Professor {
    private String nome;
    private Double salario;

    public Professor(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
