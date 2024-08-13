package dao;

import dto.ProfessorDTO;
import model.Professor;

import java.sql.*;
import java.util.ArrayList;

public class ProfessorDAO {
    private Connection conexao;

    public ProfessorDAO() {
        conexao = new ConnectionFactory().obterComunicacao("jdbc:h2:./banco/bancoDeDados",
                "sa", "");
    }

    public void criaTabProf() {
        String sqlCreateTable = """
                CREATE TABLE professores (
                id BIGINT NOT NULL AUTO_INCREMENT,
                nome VARCHAR(100),
                salario NUMERIC(15, 2)
        )
        """;
        try {
            Statement comandoDeCriacao = conexao.createStatement();
            comandoDeCriacao.execute(sqlCreateTable);
            comandoDeCriacao.close();
            System.out.println("Tabela professores criada!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletaTabProf() {
        String sqlDropTable = "DROP TABLE IF EXISTS professores";
        try {
            Statement comandoDeDelete = conexao.createStatement();
            comandoDeDelete.execute(sqlDropTable);
            System.out.println("Tabela professores  deletada!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void inserirDadosTabProf(Professor professor) {
        String sqlInsert = "INSERT INTO professores (nome, salario) VALUES (?, ?)";
        try {
            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);
            comandoDeInsercao.setString(1, professor.getNome());
            comandoDeInsercao.setDouble(2, professor.getSalario());
            comandoDeInsercao.execute();
            comandoDeInsercao.close();
            System.out.println("Professor criado!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<ProfessorDTO> pegarTodos() {
        ArrayList<ProfessorDTO> professores = new ArrayList<>();
        try {
            String sqlSelect = "SELECT * FROM PROFESSORES";
            PreparedStatement comandoDeSelecao = conexao.prepareStatement(sqlSelect);
            ResultSet rs = comandoDeSelecao.executeQuery();
            while(rs.next()) {
                ProfessorDTO professor = new ProfessorDTO();
                professor.setId(rs.getInt("id"));
                professor.setNome(rs.getString("nome"));
                professor.setSalario(rs.getDouble("salario"));
                professores.add(professor);
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
        return professores;
    }


    public void fechar() {
        try {
            conexao.close();
            System.out.println("Fechando o DAO dos professores \n");
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
