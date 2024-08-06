import bd.ConnectionFactory;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conexao = new ConnectionFactory().obterComunicacao("jdbc:h2:./banco/bancoDeDados",
                "sa", "");
        new ConnectionFactory().fecharComunicacao(conexao);
    }
}