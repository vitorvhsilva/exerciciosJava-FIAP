package telefonica;

public class Contato {

    int id;
    String nome;
    int telefone;
    String email;

    Contato (int id, String nome, int telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    double getId () {
        return id;
    }

    String getNome () {
        return nome;
    }

    double getTelefone () {
        return telefone;
    }

    String getEmail () {
        return email;
    }
}
