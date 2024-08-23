package banco.fiap;

import banco.fiap.dominio.ContaCorrente;
import banco.fiap.dominio.Correntista;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorrentistaTest {
    @Test
    void verificarIgualdade() {
        ArrayList<ContaCorrente> contaCorrentes = new ArrayList<>();
        Correntista correntista1 = new Correntista("Vitor", "123", "111", contaCorrentes);
        Correntista correntista2 = new Correntista("Vitor", "123", "111", contaCorrentes);
        assertEquals(correntista1, correntista2);
    }
}
