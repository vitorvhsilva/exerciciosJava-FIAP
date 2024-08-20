package br.com.fiapfolha;

import br.com.fiapfolha.dominio.Estagiario;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstagiarioTest {

    @Test
    void calcularSalarioParaEstagiarioQuePossui500DeVt() {
        Estagiario estagiario = new Estagiario(1200, "4444",
                LocalDate.of(1980, 10, 10), 500);
        double salario = estagiario.lerSalario();
        assertEquals(1700, salario, 0);
    }

    @Test
    void calcularSalarioParaEstagiarioQuePossui0DeVt() {
        Estagiario estagiario = new Estagiario(1200, "4444",
                LocalDate.of(1980, 10, 10), 0);
        double salario = estagiario.lerSalario();
        assertEquals(1200, salario, 0);
    }
}
