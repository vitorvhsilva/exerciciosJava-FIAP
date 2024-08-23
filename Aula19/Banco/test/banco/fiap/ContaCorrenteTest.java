package banco.fiap;

import banco.fiap.dominio.ContaCorrente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaCorrenteTest {
    @Test
    void verificarIgualdade() {
        int banco = 555;
        String agencia = "666";
        String numero = "5454-4";
        ContaCorrente umaConta = new ContaCorrente(banco, agencia,
                numero, 4353);
        ContaCorrente outraConta = new ContaCorrente(banco, agencia,
                numero, 34897);
        assertEquals(umaConta, outraConta);
    }

    @Test
    void testarSaque() {
        ContaCorrente umaConta = new ContaCorrente(555, "333",
                "5454", 2000);

        umaConta.saque(1000);

        assertEquals(1000, umaConta.saldo());
    }

    @Test
    void testarDeposito() {
        ContaCorrente umaConta = new ContaCorrente(555, "333",
                "5454", 2000);

        umaConta.deposito(1000);

        assertEquals(3000, umaConta.saldo());
    }
}
