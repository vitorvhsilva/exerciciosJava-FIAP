package model;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String cracha;
    private LocalDate dataNascimento;

    public Funcionario(String nome, String cracha, LocalDate dataNascimento) {
        this.nome = nome;
        this.cracha = cracha;
        this.dataNascimento = dataNascimento;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cracha='" + cracha + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
