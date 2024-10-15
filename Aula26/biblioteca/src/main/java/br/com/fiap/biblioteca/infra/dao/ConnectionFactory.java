package br.com.fiap.biblioteca.infra.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
//		String urlDeConexao = "jdbc:h2:./banco/biblioteca;AUTO_SERVER=TRUE";
//		String login = "sa";
//		String senha = "";

		String urlDeConexao = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		String login = "rm558961";
		String senha = "280306";


		try {
			return DriverManager.getConnection(urlDeConexao, login, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
