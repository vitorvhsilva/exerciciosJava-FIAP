import dao.FuncionarioDAO;
import model.Funcionario;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

        funcionarioDAO.inserirDadosTabFunc(new Funcionario("Vitor", "12345",
                LocalDate.of(2006, 3, 28)));
        ArrayList<Funcionario> funcionarios = funcionarioDAO.pegarTodos();
        funcionarios.forEach(System.out::println);
        funcionarioDAO.fechar();

    }
}