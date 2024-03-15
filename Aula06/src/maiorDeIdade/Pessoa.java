package maiorDeIdade;

public class Pessoa {
    String nome;
    int idade;

    boolean maiorDeIdade;

    Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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
