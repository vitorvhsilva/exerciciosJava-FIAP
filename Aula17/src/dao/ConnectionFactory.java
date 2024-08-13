package dao;

import java.sql.*;

public class ConnectionFactory {
    public Connection obterComunicacao(String url, String login, String senha) {
        try {
            Connection conexao = DriverManager.getConnection(url, login, senha);
            System.out.println("Conectado!");
            return conexao;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
