public class Trabalhador {
    private String nome;
    private Cartao cartao;

    public Trabalhador(String nome, Cartao cartao) {
        this.nome = nome;
        this.cartao = cartao;
    }

    public String getNome() {
        return nome;
    }

    public Cartao getCartao() {
        return cartao;
    }
}
