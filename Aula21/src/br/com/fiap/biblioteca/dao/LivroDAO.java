package br.com.fiap.biblioteca.dao;

import java.sql.*;
import java.util.ArrayList;

import br.com.fiap.biblioteca.dominio.Livro;

public class LivroDAO {

	private Connection conexao;
	
	public LivroDAO() {
		conexao = new ConnectionFactory().getConnection();
	}

	public void criarTabela() {
		String sqlCreateTable = """
				CREATE TABLE TB_LIVROS (
					id BIGINT NOT NULL AUTO_INCREMENT,
					nome VARCHAR2(200),
					edicao BIGINT,
					preco DOUBLE
				)
				""";
        try {
            Statement statement = conexao.createStatement();
			statement.execute(sqlCreateTable);
			statement.close();
			System.out.println("Tabela criada");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

	public void deletarTabela() {
		String sqlDropTable = "DROP TABLE IF EXISTS TB_LIVROS";
		try {
			Statement statement = conexao.createStatement();
			statement.execute(sqlDropTable);
			statement.close();
			System.out.println("Tabela deletada");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void deletarLivros() {
		String sqlDeleteLivros = "DELETE FROM TB_LIVROS;";
		try {
			Statement statement = conexao.createStatement();
			statement.execute(sqlDeleteLivros);
			statement.close();
			System.out.println("Livros deletados");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void adicionar(Livro livro) {
		String sqlInsert = "INSERT INTO TB_LIVROS (nome, edicao, preco) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sqlInsert);
			preparedStatement.setString(1, livro.getNome());
			preparedStatement.setInt(2, livro.getEdicao());
			preparedStatement.setDouble(3, livro.getPreco());
			preparedStatement.execute();
			preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
	public ArrayList<Livro> obterTodosLivros(){
		ArrayList<Livro> livros = new ArrayList<>();
		String sqlSelect = "SELECT * FROM TB_LIVROS";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sqlSelect);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Livro livro = new Livro(rs.getString("nome"),
						rs.getInt("edicao"),
						rs.getDouble("preco"));
				livros.add(livro);
			}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return livros;
	}

	public void desconectar() {
        try {
            conexao.close();
			System.out.println("Conexão fechada");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
