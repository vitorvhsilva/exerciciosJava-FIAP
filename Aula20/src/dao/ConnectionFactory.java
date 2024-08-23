package dao;

import java.sql.*;

public class ConnectionFactory {
    public Connection obterComunicacao() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@//oracle.fiap.com.br:1521/ORCL",
            "rm558961", "280306");
            System.out.println("Conectado!");
            return conexao;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
