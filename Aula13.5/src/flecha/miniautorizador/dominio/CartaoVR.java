package flecha.miniautorizador.dominio;

public class CartaoVR extends Cartao{

    public CartaoVR(int numero, double valor, int senha) {
        super(numero,valor,senha);
    }

    public boolean estaHabilitado(Estabelecimento estabelecimentoSelecionado) {
        return estabelecimentoSelecionado.estabelecimentoAceitaVR();
    }



}
