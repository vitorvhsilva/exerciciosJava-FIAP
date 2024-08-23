package dao;

import model.Funcionario;

import java.sql.*;
import java.util.ArrayList;

public class FuncionarioDAO {
    private Connection conexao;

    public FuncionarioDAO() {
        conexao = new ConnectionFactory().obterComunicacao();
    }

    public void inserirDadosTabFunc(Funcionario funcionario) {
        String sqlInsert = "INSERT INTO TB_FUNCIONARIOS (id, nome, cracha, data_nascimento) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);
            comandoDeInsercao.setLong(1, obterProximoIdFuncionarios());
            comandoDeInsercao.setString(2, funcionario.getNome());
            comandoDeInsercao.setString(3, funcionario.getCracha());
            comandoDeInsercao.setDate(4, Date.valueOf(funcionario.getDataNascimento()));
            comandoDeInsercao.execute();
            comandoDeInsercao.close();
            System.out.println("Funcionario criado!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Funcionario> pegarTodos() {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try {
            String sqlSelect = "SELECT * FROM TB_FUNCIONARIOS";
            PreparedStatement comandoDeSelecao = conexao.prepareStatement(sqlSelect);
            ResultSet rs = comandoDeSelecao.executeQuery();
            while(rs.next()) {
                Funcionario funcionario = new Funcionario();
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

    private Long obterProximoIdFuncionarios() {
        Long id = null;
        try {
            String sql = "SELECT SEQ_FUNCIONARIOS_ID.NEXTVAL FROM DUAL";
            PreparedStatement comandoDeGeracao =
                    conexao.prepareStatement(sql);
            ResultSet rs = comandoDeGeracao.executeQuery();
            while(rs.next()) {
                id = rs.getLong(1);
            }
            rs.close();
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
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
