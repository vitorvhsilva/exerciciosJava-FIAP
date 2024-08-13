package dto;

import java.time.LocalDate;

public class FuncionarioDTO {
    private Integer id;
    private String nome;
    private String cracha;
    private LocalDate dataNascimento;

    public FuncionarioDTO() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "FuncionarioDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cracha='" + cracha + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
