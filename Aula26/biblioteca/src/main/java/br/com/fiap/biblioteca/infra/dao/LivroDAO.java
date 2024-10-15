package br.com.fiap.biblioteca.infra.dao;

import br.com.fiap.biblioteca.dominio.Livro;
import br.com.fiap.biblioteca.dominio.RepositorioLivros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO implements RepositorioLivros {

	private Connection conexao;

	public LivroDAO() {
		conexao = new ConnectionFactory().getConnection();
	}

	@Override
	public void adicionar(Livro livro) {
		String sqlInsert = "INSERT INTO TB_LIVROS VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sqlInsert);
			ps.setLong(1, obterProximoId());
			ps.setString(2, livro.getNome());
			ps.setString(3, livro.getAutor());
			ps.setDouble(4, livro.getPreco());
			ps.execute();
			ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

	@Override
	public List<Livro> buscarLivros() {
		String sqlInsert = "SELECT * FROM TB_LIVROS";
		List<Livro> livros = new ArrayList<>();

		try {
			PreparedStatement ps = conexao.prepareStatement(sqlInsert);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Livro livro = new Livro(rs.getString("nome"),
						rs.getString("autor"),
						rs.getDouble("preco"));
				livros.add(livro);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return livros;
	}

	@Override
	public Livro buscarLivroPorNome(String nome) {
		String sqlInsert = "SELECT * FROM TB_LIVROS WHERE nome = ?";
		Livro livro = null;
		try {
			PreparedStatement ps = conexao.prepareStatement(sqlInsert);
			ps.setString(1, nome);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				livro = new Livro(rs.getString("nome"),
						rs.getString("autor"),
						rs.getDouble("preco"));
			}
			rs.close();
			ps.close();
			return livro;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Long obterProximoId() {
		Long id = null;
		try {
			String sql = "SELECT tb_livros_seq.NEXTVAL FROM DUAL";
			PreparedStatement comandoDeGeracao = conexao.prepareStatement(sql);
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
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
