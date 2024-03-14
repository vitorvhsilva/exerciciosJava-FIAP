package telefonica;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> contatos;

    Agenda (ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    ArrayList<Contato> getContatos () {
        return contatos;
    }
}
