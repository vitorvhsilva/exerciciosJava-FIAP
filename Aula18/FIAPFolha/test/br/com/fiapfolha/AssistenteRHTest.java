package br.com.fiapfolha;

import br.com.fiapfolha.dominio.AssistenteRH;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssistenteRHTest {
    @Test
    void calcularSalarioParaAssistenteRHQuePossuiDezPorCentoDeComissao() {
        AssistenteRH assistente = new AssistenteRH(100, "4444",
                LocalDate.of(1980, 10, 10), 10);
        double salario = assistente.lerSalario();
        assertEquals(110, salario, 0);
    }

    @Test
    void calcularSalarioParaAssistenteRHQueNaoPossuiComissao() {
        AssistenteRH assistente = new AssistenteRH(100, "4444",
                LocalDate.of(1980, 10, 10), 0);
        double salario = assistente.lerSalario();
        assertEquals(100, salario, 0);
    }


}
