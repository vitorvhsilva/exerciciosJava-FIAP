package br.com.fiap.biblioteca.dao;

import br.com.fiap.biblioteca.connection.ConnectionFactory;
import br.com.fiap.biblioteca.model.Livro;

import java.sql.*;
import java.util.ArrayList;

public class LivroDAO {

    private Connection conexao;

    public LivroDAO() {
        this.conexao = new ConnectionFactory().obterConexao();
    }

    public void criaTab() {
        String sqlCreateTable = """
                CREATE TABLE livros (
                id BIGINT NOT NULL AUTO_INCREMENT,
                nome VARCHAR(100),
                autor VARCHAR(100),
                preco DOUBLE
        )
        """;
        try {
            Statement comandoDeCriacao = conexao.createStatement();
            comandoDeCriacao.execute(sqlCreateTable);
            comandoDeCriacao.close();
            System.out.println("Tabela criada!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletaTab() {
        String sqlDropTable = "DROP TABLE IF EXISTS livros";
        try {
            Statement comandoDeDelete = conexao.createStatement();
            comandoDeDelete.execute(sqlDropTable);
            System.out.println("Tabela livros deletada!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void inserirDadosTab(Livro livro) {
        String sqlInsert = "INSERT INTO livros (nome, autor, preco) VALUES (?, ?, ?)";
        try {
            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);
            comandoDeInsercao.setString(1, livro.getNome());
            comandoDeInsercao.setString(2, livro.getAutor());
            comandoDeInsercao.setDouble(3, livro.getPreco());
            comandoDeInsercao.execute();
            comandoDeInsercao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Livro> pegarTodos() {
        ArrayList<Livro> livros = new ArrayList<>();
        try {
            String sqlSelect = "SELECT * FROM livros";
            PreparedStatement comandoDeSelecao = conexao.prepareStatement(sqlSelect);
            ResultSet rs = comandoDeSelecao.executeQuery();
            while(rs.next()) {
                Livro livro = new Livro();
                livro.setNome(rs.getString("nome"));
                livro.setAutor(rs.getString("autor"));
                livro.setPreco(livro.getPreco());
                livros.add(livro);
            }
        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
        return livros;
    }


    public void fecharConexao() {
        try {
            conexao.close();
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
