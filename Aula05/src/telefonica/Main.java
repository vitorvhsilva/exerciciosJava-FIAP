package telefonica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Contato Vitor = new Contato(1, "Vitor Hugo da Silva", 9999999, "vitorhugo@gmail.com");
        Contato Rodrigo = new Contato(2, "Rodrigo Vieira", 9999998, "profrodrigojava@gmail.com");

        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(Vitor);
        contatos.add(Rodrigo);

        Agenda agendaTelefonica = new Agenda(contatos);

        System.out.println("Os contatos presentes na agenda sao: ");
        for (int i = 0; i < agendaTelefonica.contatos.size(); i++) {
            System.out.println("id:" + agendaTelefonica.getContatos().get(i).id + " nome:" +
                    agendaTelefonica.getContatos().get(i).nome + " telefone:" +
                    agendaTelefonica.getContatos().get(i).telefone + " email:" +
                    agendaTelefonica.getContatos().get(i).email + "\n");
        }
    }
}
