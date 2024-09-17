package br.com.fiap.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Revista {
    @JsonProperty
    public String nome;
    @JsonProperty
    public double valor;
}
