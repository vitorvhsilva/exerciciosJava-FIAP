package br.com.fiap.biblioteca.infra.mutuarios;

import br.com.fiap.biblioteca.dominio.Aluno;
import br.com.fiap.biblioteca.dominio.RelacaoDeAlunosMutuarios;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class RelacaoDeAlunosMutuariosImpl implements RelacaoDeAlunosMutuarios {
    private File relatorio;

    public RelacaoDeAlunosMutuariosImpl(File relatorio) throws IOException
    {
        this.relatorio = relatorio;
        this.relatorio.createNewFile();
    }

    public void adicionar(Aluno mutuario) throws IOException {
        try{
            FileWriter fileWriter = new FileWriter(relatorio);
            String linha = mutuario.getChamada() + "\n";
            fileWriter.write(linha);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }

    public List<String> listarTodos() throws IOException {
        FileReader fileReader = new FileReader(relatorio);
        int read = fileReader.read();
        System.out.println((char) read);
        return Files.readAllLines(relatorio.toPath());
    }

    public void copiarArquivo(File origem, File destino) throws IOException {
        Files.copy(origem.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
