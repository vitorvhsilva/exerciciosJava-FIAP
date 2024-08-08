package bd;

import java.sql.*;
import java.time.LocalDate;

public class ProfessoresService {
    private Connection conexao;

    public ProfessoresService(Connection conexao) {
        this.conexao = conexao;
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

    public void inserirDadosTabProf(String nome, Double salario) {
        String sqlInsert = "INSERT INTO professores (nome, salario) VALUES (?, ?)";
        try {
            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);
            comandoDeInsercao.setString(1, nome);
            comandoDeInsercao.setDouble(2, salario);
            comandoDeInsercao.execute();
            comandoDeInsercao.close();
            System.out.println("Professor criado!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
