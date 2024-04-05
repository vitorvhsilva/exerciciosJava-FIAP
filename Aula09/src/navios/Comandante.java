package navios;

public class Comandante {
    private String nome;
    private int idade;
    private Navio navio;

    public Comandante(String nome, int idade, Navio navio) {
        this.nome = nome;
        this.idade = idade;
        this.navio = navio;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Navio getNavio() {
        return navio;
    }
}
