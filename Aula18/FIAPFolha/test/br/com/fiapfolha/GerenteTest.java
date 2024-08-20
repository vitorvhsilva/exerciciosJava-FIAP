package br.com.fiapfolha;

import br.com.fiapfolha.dominio.Estagiario;
import br.com.fiapfolha.dominio.Gerente;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GerenteTest {

    @Test
    void calcularSalarioParaGerenteQuePossui1000DeBonus() {
        Gerente gerente = new Gerente(12000, "4444",
                LocalDate.of(1980, 10, 10), 1000);
        double salario = gerente.lerSalario();
        assertEquals(13000, salario, 0);
    }

    @Test
    void calcularSalarioParaGerenteQuePossui5000DeBonus() {
        Gerente gerente = new Gerente(12000, "4444",
                LocalDate.of(1980, 10, 10), 5000);
        double salario = gerente.lerSalario();
        assertEquals(17000, salario, 0);
    }

    @Test
    void calcularSalarioParaGerenteQuePossui0DeBonus() {
        Gerente gerente = new Gerente(12000, "4444",
                LocalDate.of(1980, 10, 10), 0);
        double salario = gerente.lerSalario();
        assertEquals(12000, salario, 0);
    }
}
