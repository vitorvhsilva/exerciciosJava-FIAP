package dao;

import dto.FuncionarioDTO;
import model.Funcionario;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class FuncionarioDAO {
    private Connection conexao;

    public FuncionarioDAO() {
        conexao = new ConnectionFactory().obterComunicacao("jdbc:h2:./banco/bancoDeDados",
                "sa", "");
    }


    public void criaTabFunc() {
        String sqlCreateTable = """
                CREATE TABLE funcionarios (
                id BIGINT NOT NULL AUTO_INCREMENT,
                nome VARCHAR(100),
                cracha VARCHAR(5),
                data_nascimento DATE
        )
        """;
        try {
            Statement comandoDeCriacao = conexao.createStatement();
            comandoDeCriacao.execute(sqlCreateTable);
            comandoDeCriacao.close();
            System.out.println("Tabela funcionarios criada!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletaTabFunc() {
        String sqlDropTable = "DROP TABLE IF EXISTS funcionarios";
        try {
            Statement comandoDeDelete = conexao.createStatement();
            comandoDeDelete.execute(sqlDropTable);
            System.out.println("Tabela funcionarios deletada!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void inserirDadosTabFunc(Funcionario funcionario) {
        String sqlInsert = "INSERT INTO funcionarios (nome, cracha, data_nascimento) VALUES (?, ?, ?)";
        try {
            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);
            comandoDeInsercao.setString(1, funcionario.getNome());
            comandoDeInsercao.setString(2, funcionario.getCracha());
            comandoDeInsercao.setDate(3, Date.valueOf(funcionario.getDataNascimento()));
            comandoDeInsercao.execute();
            comandoDeInsercao.close();
            System.out.println("Funcionario criado!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<FuncionarioDTO> pegarTodos() {
        ArrayList<FuncionarioDTO> funcionarios = new ArrayList<>();
        try {
            String sqlSelect = "SELECT * FROM FUNCIONARIOS";
            PreparedStatement comandoDeSelecao = conexao.prepareStatement(sqlSelect);
            ResultSet rs = comandoDeSelecao.executeQuery();
            while(rs.next()) {
                FuncionarioDTO funcionario = new FuncionarioDTO();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCracha(rs.getString("cracha"));
                funcionario.setDataNascimento(rs.getDate("data_nascimento").toLocalDate(
                ));
                funcionarios.add(funcionario);
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
        return funcionarios;
    }


    public void fechar() {
        try {
            conexao.close();
            System.out.println("Fechando o DAO dos funcionários \n");
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
