package br.com.fiap.biblioteca.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Aluno {

    @JsonProperty
    private String nome;

    @JsonProperty
    private String chamada;

    @JsonProperty
    private String turma;

    public Aluno(String nome, String chamada, String turma) {
        this.nome = nome;
        this.chamada = chamada;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public String getChamada() {
        return chamada;
    }

    public String getTurma() {
        return turma;
    }

}
