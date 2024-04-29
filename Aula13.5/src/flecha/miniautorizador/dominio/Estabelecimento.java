package flecha.miniautorizador.dominio;

public class Estabelecimento {
    private String nome;
    private boolean aceitaVR;

    public Estabelecimento(String nome, boolean aceitaVR) {
        this.nome = nome;
        this.aceitaVR = aceitaVR;
    }

    public boolean estabelecimentoAceitaVR() {
        return aceitaVR;
    }

    public String getNome() {
        return nome;
    }

}
