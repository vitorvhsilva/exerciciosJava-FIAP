package br.com.fiapfolha;

import br.com.fiapfolha.dominio.Mecanico;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MecanicoTest {

    @Test
    void calcularSalarioParaMecanicoQuePossui800DePlr() {
        Mecanico mecanico = new Mecanico(2000, "4444",
                LocalDate.of(1980, 10, 10), 800);
        double salario = mecanico.lerSalario();
        assertEquals(2800, salario, 0);
    }

    @Test
    void calcularSalarioParaMecanicoQuePossui0DePlr() {
        Mecanico mecanico = new Mecanico(2000, "4444",
                LocalDate.of(1980, 10, 10), 800);
        double salario = mecanico.lerSalario();
        assertEquals(2000, salario, 0);
    }
}
