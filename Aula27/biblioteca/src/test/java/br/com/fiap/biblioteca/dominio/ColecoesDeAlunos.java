package br.com.fiap.biblioteca.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class ColecoesDeAlunos {

	@Test
	void testeDeUsoDeArrayList() {
		Aluno claudiaDaSilva = new Aluno("Claudia da Silva", "550444", "1TDSPY");
		Aluno fernandoFerreira = new Aluno("Fernando Ferreira", "551088", "1TDSPY");
		Aluno joaoSantos = new Aluno("João Santos", "654032", "1TDSPY");
			
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(fernandoFerreira);
		alunos.add(claudiaDaSilva);
		alunos.add(joaoSantos);	
			
		assertEquals(3, alunos.size());
		assertEquals(fernandoFerreira, alunos.get(0));
		
		assertTrue(alunos.contains(fernandoFerreira));
		alunos.remove(fernandoFerreira);
		assertFalse(alunos.contains(fernandoFerreira));
		alunos.add(fernandoFerreira);
			
		assertFalse(alunos.isEmpty());
		List<Aluno> subLista = alunos.subList(0, 2);
			
		assertEquals(2, subLista.size());
		assertTrue(subLista.contains(claudiaDaSilva));
		assertTrue(subLista.contains(joaoSantos));
	}
	
	@Test
	void testeDeUsoDeLinkedList() {
		Aluno claudiaDaSilva = new Aluno("Claudia da Silva", "550444", "1TDSPY");
		Aluno fernandoFerreira = new Aluno("Fernando Ferreira", "551088", "1TDSPY");
		Aluno joaoSantos = new Aluno("João Santos", "654032", "1TDSPY");
			
		List<Aluno> alunos = new LinkedList<>();
		alunos.add(fernandoFerreira);
		alunos.add(claudiaDaSilva);
		alunos.add(joaoSantos);	
			
		assertEquals(3, alunos.size());
		assertEquals(fernandoFerreira, alunos.get(0));
			
		assertTrue(alunos.contains(fernandoFerreira));
		alunos.remove(fernandoFerreira);
		assertFalse(alunos.contains(fernandoFerreira));
		alunos.add(fernandoFerreira);
			
		assertFalse(alunos.isEmpty());
		List<Aluno> subLista = alunos.subList(0, 2);
			
		assertEquals(2, subLista.size());
		assertTrue(subLista.contains(claudiaDaSilva));
		assertTrue(subLista.contains(joaoSantos));
	}
	
	@Test
	void testeDeUsoDeSet() {
		Aluno claudiaDaSilva = new Aluno("Claudia da Silva", "550444", "1TDSPY");
		Aluno fernandoFerreira = new Aluno("Fernando Ferreira", "551088", "1TDSPY");
		Aluno joaoSantos = new Aluno("João Santos", "654032", "1TDSPY");
			
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(fernandoFerreira);
		alunos.add(claudiaDaSilva);
		alunos.add(joaoSantos);	
		alunos.add(fernandoFerreira);
	}
	
	@Test
	void testeDeUsoDeHashSet() {
		Aluno claudiaDaSilva = new Aluno("Claudia da Silva", "550444", "1TDSPY");
		Aluno fernandoFerreira = new Aluno("Fernando Ferreira", "551088", "1TDSPY");
		Aluno joaoSantos = new Aluno("João Santos", "654032", "1TDSPY");
			
		Set<Aluno> alunos = new HashSet<>();
		alunos.add(fernandoFerreira);
		alunos.add(claudiaDaSilva);
		alunos.add(joaoSantos);	
		alunos.add(fernandoFerreira);
			
		assertEquals(3, alunos.size());
	}
	
	@Test
	void testeDeUsoDeTreeSet() {
		Aluno claudiaDaSilva = new Aluno("Claudia da Silva", "550444", "1TDSPY");
		Aluno fernandoFerreira = new Aluno("Fernando Ferreira", "551088", "1TDSPY");
		Aluno joaoSantos = new Aluno("João Santos", "654032", "1TDSPY");
			
		Set<Aluno> alunos = new TreeSet<>();
		alunos.add(fernandoFerreira);
		alunos.add(claudiaDaSilva);
		alunos.add(joaoSantos);	
		alunos.add(fernandoFerreira);
			
		assertEquals(3, alunos.size());
		
		for(Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
	}
}
