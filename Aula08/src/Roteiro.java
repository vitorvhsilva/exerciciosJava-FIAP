public class Roteiro {
    String disciplina;
    String aula;
    String conteudo;

    public Roteiro(String disciplina, String aula, String conteudo) {
        this.disciplina = disciplina;
        this.aula = aula;
        this.conteudo = conteudo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getAula() {
        return aula;
    }

    public String getConteudo() {
        return conteudo;
    }
}
