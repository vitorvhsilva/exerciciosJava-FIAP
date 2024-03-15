package maiorDeIdade2;

public class Pessoa {
    String nome;
    int idade;

    boolean maiorDeIdade;

    Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    String getNome () {
        return nome;
    }

    int getIdade () {
        return idade;
    }

    boolean ehMaiorDeIdade () {
        if (idade >= 18) {
            maiorDeIdade = true;
        } else {
            maiorDeIdade = false;
        }

        return maiorDeIdade;
    }
}
