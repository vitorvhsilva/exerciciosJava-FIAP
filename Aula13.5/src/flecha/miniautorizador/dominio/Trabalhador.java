package flecha.miniautorizador.dominio;

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

    public int getCartaoNumero() {
        return cartao.getNumero();
    }
    public double getCartaoValor() {
        return cartao.getValor();
    }
    public int getCartaoSenha() {
        return cartao.getSenha();
    }

}
