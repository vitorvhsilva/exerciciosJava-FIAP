package br.com.fiap.biblioteca.infra.dao;

import br.com.fiap.biblioteca.dominio.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private Connection conexao;

    public AlunoDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    public void inserirAluno(Aluno aluno) {
        String sqlInsert = "INSERT INTO alunos (nome, chamada, turma) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sqlInsert);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getChamada());
            ps.setString(3, aluno.getTurma());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Aluno> pegarAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        String sqlSelect = "SELECT * FROM alunos";

        try {
            PreparedStatement ps = conexao.prepareStatement(sqlSelect);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno(rs.getString("nome"), rs.getString("chamada"),
                        rs.getString("turma"));
                alunos.add(aluno);
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return alunos;
    }

    public List<Aluno> pegarAlunosPorTurma(String turma) {
        List<Aluno> alunos = new ArrayList<>();
        String sqlSelect = "SELECT * FROM alunos WHERE turma = ?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sqlSelect);
            ps.setString(1, turma);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno(rs.getString("nome"), rs.getString("chamada"),
                        rs.getString("turma"));
                alunos.add(aluno);
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return alunos;
    }

    public List<Aluno> pegarAlunosPorTurmaEChamada(String turma, String chamada) {
        List<Aluno> alunos = new ArrayList<>();
        String sqlSelect = "SELECT * FROM alunos WHERE turma = ? AND chamada = ?";

        try {
            PreparedStatement ps = conexao.prepareStatement(sqlSelect);
            ps.setString(1, turma);
            ps.setString(2, chamada);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno(rs.getString("nome"), rs.getString("chamada"),
                        rs.getString("turma"));
                alunos.add(aluno);
            }

            ps.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return alunos;
    }

    public void fecharConexao() {
        try {
            conexao.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
