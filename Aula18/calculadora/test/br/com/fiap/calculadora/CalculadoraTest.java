package br.com.fiap.calculadora;

import br.com.fiap.calculadora.dominio.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    void testarASomaDeDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.somar(3, 5);
        assertEquals(8, soma, 0);
    }

    @Test
    void testarASubtracaoDeDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.subtrair(5, 3);
        assertEquals(2, soma, 0);
    }

    @Test
    void testarAMultiplicacaoDeDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.multiplicar(5, 3);
        assertEquals(15, soma, 0);
    }

    @Test
    void testarADivisaoDeDoisNumeros() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.dividir(10, 2);
        assertEquals(5, soma, 0);
    }
}
