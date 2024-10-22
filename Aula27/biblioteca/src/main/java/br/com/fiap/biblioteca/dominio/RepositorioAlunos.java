package br.com.fiap.biblioteca.dominio;

import java.util.ArrayList;

public interface RepositorioAlunos {

    void adicionar(Aluno aluno);
    void fechar();

    Aluno buscarAlunosPorTurmaEChamada(String turma, String chamada);

    ArrayList<Aluno> buscarAlunosPorTurma(String turma);
}
