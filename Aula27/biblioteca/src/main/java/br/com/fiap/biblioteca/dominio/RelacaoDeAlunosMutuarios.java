package br.com.fiap.biblioteca.dominio;

import java.io.IOException;
import java.util.List;

public interface RelacaoDeAlunosMutuarios {
    void adicionar(Aluno mutuario) throws IOException;
    List<String> listarTodos() throws IOException;
}
