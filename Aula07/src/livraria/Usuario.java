package livraria;

import java.util.ArrayList;

public class Usuario {
    String nome;
    int senha;
    ArrayList<Endereco> endereco;

    Usuario(String nome, int senha, ArrayList<Endereco> endereco) {
        this.nome = nome;
        this.senha = senha;
        this.endereco = endereco;
    }

    boolean validar (String nome, int senha) {
        if (this.nome.equals(nome) && this.senha == senha) {
            System.out.println("Usuário Cadastrado");
            return true;
        } else {
            return false;
        }
    }
}
