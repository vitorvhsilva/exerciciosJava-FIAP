package maiorDeIdade;

public class Main {
    public static void main(String[] args) {

        Pessoa Vitor = new Pessoa("Vitor", 17);
        Pessoa Sidnei = new Pessoa("Sidnei", 55);

        System.out.println(Vitor.ehMaiorDeIdade());
        System.out.println(Sidnei.ehMaiorDeIdade());

    }
}