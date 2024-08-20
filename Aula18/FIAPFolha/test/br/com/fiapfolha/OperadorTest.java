package br.com.fiapfolha;

import br.com.fiapfolha.dominio.Operador;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperadorTest {

    @Test
    void calcularSalarioParaOperador() {
        Operador operador = new Operador(1500, "4444",
                LocalDate.of(1980, 10, 10));
        double salario = operador.lerSalario();
        assertEquals(1510, salario, 0);
    }

}
