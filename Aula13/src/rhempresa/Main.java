package rhempresa;

import rhempresa.dominio.Funcionario;
import rhempresa.dominio.Gerente;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios1 = new ArrayList<>();
        ArrayList<Funcionario> funcionarios2 = new ArrayList<>();
        ArrayList<Funcionario> funcionarios3 = new ArrayList<>();

        ArrayList<Gerente> gerentes = new ArrayList<>();

        ArrayList<Funcionario> colaboradores = new ArrayList<>();

        funcionarios1.add(new Funcionario("Vitor", "2425267899" , 2000.0));
        funcionarios1.add(new Funcionario("João", "2425267899", 3400.0));
        funcionarios1.add(new Funcionario("Matheus", "89796958111", 1500.0));

        funcionarios2.add(new Funcionario("José", "42424222211", 9420.0));
        funcionarios2.add(new Funcionario("Lucas", "1847198731932", 3400.0));
        funcionarios2.add(new Funcionario("Vinicius", "129480948320", 8240.0));

        funcionarios3.add(new Funcionario("David", "321123344223", 5340.0));
        funcionarios3.add(new Funcionario("Arthur", "2425267899", 2310.0));
        funcionarios3.add(new Funcionario("Augusto", "89796958111", 4500.0));

        gerentes.add(new Gerente("Roberio", "3245202283", 12540.0, funcionarios1));
        gerentes.add(new Gerente("Joresvaldo", "39324098243", 19920.0, funcionarios2));
        gerentes.add(new Gerente("Luis", "26292098222", 23400.0, funcionarios3));

        for (Gerente gerente : gerentes) {
            colaboradores.add(gerente);
            for (Funcionario funcionario : gerente.getFuncionarios()) {
                colaboradores.add(funcionario);
            }
        }

        System.out.println("Colaboradores da Empresa: ");
        for (Funcionario colaborador: colaboradores) {
            System.out.println(colaborador.getNome());
        }



    }
}
