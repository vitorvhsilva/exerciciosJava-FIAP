package escritorio;

import escritorio.dominio.Assistente;
import escritorio.dominio.Funcionario;
import escritorio.dominio.Gerente;
import escritorio.dominio.Vendedor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Marcello", "231223321", 23400.0));

        funcionarios.add(new Assistente("Luis", "890237834", 2400.0));

        funcionarios.add(new Vendedor("Joseph", "278327812", 4020.0, 500));

        double valorTotal = 0;
        for (Funcionario funcionario: funcionarios) {
            funcionario.folhaSalarial();
            valorTotal += funcionario.getSalarioBase();
        }

        System.out.println("Valor total: " + valorTotal);


    }
}
