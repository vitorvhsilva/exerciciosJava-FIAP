package autorizador.servico;

import java.util.ArrayList;

import autorizador.dominio.Cartao;
import autorizador.dominio.Estabelecimento;
import autorizador.dominio.Trabalhador;
import autorizador.dominio.Transacao;

public class ServicoDeAutorizacao {

	private ArrayList<Trabalhador> trabalhadores;
	private ArrayList<Estabelecimento> estabelecimentos;
	
	public ServicoDeAutorizacao(ArrayList<Trabalhador> trabalhadores, ArrayList<Estabelecimento> estabelecimentos) {
		this.trabalhadores = trabalhadores;
		this.estabelecimentos = estabelecimentos;
	}
	
//	public boolean autorizar(Transacao transacao) {
//		for(Trabalhador trabalhador : trabalhadores) {
//			String numeroCartao = transacao.getNumeroCartao();
//			if(trabalhador.possuiCartao(numeroCartao)) {
//				Cartao cartao = trabalhador.getCartao();
//				if(cartao.comSenha(transacao.getSenhaCartao())) {
//					double valorRefeicao = transacao.getValorRefeicao();
//					if(cartao.possuiSaldoPara(valorRefeicao)) {
//						return true;
//					}
//				}
//			}
//		}
//		return false;
//	}
	
	//abaixo uma outra opção de implementação do método autorizar()
	public boolean autorizar(Transacao transacao) {
		Trabalhador trabalhador = obterTrabalhadorPorNumeroDeCartao(transacao);
		Estabelecimento estabelecimento = obterEstabelecimentoPorCnpj(transacao);
		if(trabalhador != null) {
			if (estabelecimento != null) {
				Cartao cartao = trabalhador.getCartao();
				return cartao.comSenha(transacao.getSenhaCartao())
						&& cartao.possuiSaldoPara(transacao.getValorRefeicao())
						&& estabelecimento.aceitaCartaoVA();
			}
			Cartao cartao = trabalhador.getCartao();
			return cartao.comSenha(transacao.getSenhaCartao())
					&& cartao.possuiSaldoPara(transacao.getValorRefeicao());
		}
		return false;
	}
	
	private Trabalhador obterTrabalhadorPorNumeroDeCartao(Transacao transacao) {
		for(Trabalhador trabalhador : trabalhadores) {
			String numeroCartao = transacao.getNumeroCartao();
			if(trabalhador.possuiCartao(numeroCartao)) {
				return trabalhador;
			}
		}
		return null;
	}
	
	private Estabelecimento obterEstabelecimentoPorCnpj(Transacao transacao) {
		for(Estabelecimento estabelecimento : estabelecimentos) {
			String cnpjEstabelecimento = transacao.getCnpjEstabelecimento();
			if(estabelecimento.possuiCnpj(cnpjEstabelecimento)) {
				return estabelecimento;
			}
		}
		return null;
	}
}
