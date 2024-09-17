package br.com.fiap.biblioteca.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection obterConexao() {
        try {
            return DriverManager.getConnection("jdbc:h2:./banco/bancoDeDados", "sa", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
