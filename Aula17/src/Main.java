import dao.FuncionarioDAO;
import dao.ProfessorDAO;
import dto.FuncionarioDTO;
import dto.ProfessorDTO;
import model.Funcionario;
import model.Professor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        ProfessorDAO professorDAO = new ProfessorDAO();

        funcionarioDAO.deletaTabFunc();
        funcionarioDAO.criaTabFunc();
        funcionarioDAO.inserirDadosTabFunc(new Funcionario("Vitor", "12345",
                LocalDate.of(2006, 3, 28)));
        ArrayList<FuncionarioDTO> funcionarios = funcionarioDAO.pegarTodos();
        funcionarios.forEach(System.out::println);
        funcionarioDAO.fechar();

        professorDAO.deletaTabProf();
        professorDAO.criaTabProf();
        professorDAO.inserirDadosTabProf(new Professor("Rodrigão", 10299921.0));
        ArrayList<ProfessorDTO> professores = professorDAO.pegarTodos();
        professores.forEach(System.out::println);
        professorDAO.fechar();

    }
}