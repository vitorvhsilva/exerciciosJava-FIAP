package fiapfolha;

import fiapfolha.dominio.*;
import fiapfolha.servico.Horista;
import fiapfolha.servico.Mensalista;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Horista> horistas = new ArrayList<>();
        double salarioHoristas = 0;

        ArrayList<Mensalista> mensalistas = new ArrayList<>();
        double salarioMensalistas = 0;

        LocalDateTime localDateTime = LocalDateTime.now();

        horistas.add(new Operador(1000, "AAA", localDateTime));
        horistas.add(new Mecanico(1200, "AAA", localDateTime, 200));
        mensalistas.add(new Gerente(6000, "ZZZ", localDateTime, 1500));
        mensalistas.add(new AssistenteRH(4000, "ZZZ", localDateTime, 3));
        mensalistas.add(new Estagiario(900, "ZZZ", localDateTime, 200));

        for (Horista horista: horistas) {
            salarioHoristas += horista.lerSalario();
        }

        for (Mensalista mensalista: mensalistas) {
            salarioMensalistas += mensalista.lerSalario();
        }

        System.out.println("Salário Horistas:" + salarioHoristas + ", Salário Mensalistas:" + salarioMensalistas);
    }
}