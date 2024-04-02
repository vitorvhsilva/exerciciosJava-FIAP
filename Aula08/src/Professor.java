import java.util.ArrayList;

public class Professor {
    String nome;
    ArrayList<Roteiro> roteiro;

    public Professor(String nome, ArrayList<Roteiro> roteiro) {
        this.nome = nome;
        this.roteiro = roteiro;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Roteiro> getRoteiro() {
        return roteiro;
    }
}
