package banco;

import dao.ConnectionFactory;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

public class ConnectionFactoryTest {
    @Test
    void conectaComSucesso() {
        try {
            Connection conexao = new
                    ConnectionFactory().obterComunicacao();
            assertFalse(conexao.isClosed());
            conexao.close();
            assertTrue(conexao.isClosed());
        }
        catch(Exception e) {
            fail("Conexão não foi criada com sucesso");
        }
    }
}

