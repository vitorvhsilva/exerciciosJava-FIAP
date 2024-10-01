package br.com.fiap.biblioteca.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.fiap.biblioteca.infra.viacep.CorreiosImpl;
import org.junit.jupiter.api.Test;

public class CorreiosImplTest {

	@Test
	void buscarEndereco() {
		CorreiosImpl c = new CorreiosImpl();
		Endereco e = c.obterEndereco("01001000");

		assertEquals("01001-000", e.getCep());
		assertEquals("Praça da Sé", e.getLogradouro());
		assertEquals("lado ímpar", e.getComplemento());
		assertEquals("Sé", e.getBairro());
		assertEquals("São Paulo", e.getLocalidade());
		assertEquals("SP", e.getUf());
	}
}
