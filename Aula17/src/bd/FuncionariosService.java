package bd;

import java.sql.*;
import java.time.LocalDate;

public class FuncionariosService {
    private Connection conexao;

    public FuncionariosService(Connection conexao) {
        this.conexao = conexao;
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

    public void inserirDadosTabFunc(String nome, String cracha,
                                    Integer ano, Integer mes, Integer dia) {
        String sqlInsert = "INSERT INTO funcionarios (nome, cracha, data_nascimento) VALUES (?, ?, ?)";
        try {
            PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);
            comandoDeInsercao.setString(1, nome);
            comandoDeInsercao.setString(2, cracha);
            comandoDeInsercao.setDate(3, Date.valueOf(LocalDate.of(ano, mes, dia)));
            comandoDeInsercao.execute();
            comandoDeInsercao.close();
            System.out.println("Funcionario criado!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
