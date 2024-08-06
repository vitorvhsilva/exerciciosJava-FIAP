package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

    public void fecharComunicacao(Connection conexao) {
        try{
            conexao.close();
            System.out.println("Desconectado!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
