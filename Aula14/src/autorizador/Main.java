package autorizador;

import java.util.ArrayList;

import autorizador.dominio.Cartao;
import autorizador.dominio.CartaoDeDebito;
import autorizador.dominio.CartaoVR;
import autorizador.dominio.Estabelecimento;
import autorizador.dominio.Trabalhador;
import autorizador.dominio.Transacao;
import autorizador.servico.ServicoDeAutorizacao;

public class Main {
	
	public static void main(String[] args) {
		Cartao cartaoDoZe = new CartaoDeDebito("546574376584372", 1234, 100, 1000);
		Cartao cartaoDoJota = new CartaoVR("347653478564369", 4567, 150);
		
		Trabalhador jose = new Trabalhador(cartaoDoZe);
		Trabalhador joao = new Trabalhador(cartaoDoJota);
		
		ArrayList<Trabalhador> trabalhadores = new ArrayList<>();
		trabalhadores.add(jose);
		trabalhadores.add(joao);
		
		
		Estabelecimento barDoZe =
				new Estabelecimento("Bar do Zé", "847538745343", true, true);
		Estabelecimento padariaDoCarlos =
				new Estabelecimento("Padaria do Carlos", "8437583475847",true, true);
		ArrayList<Estabelecimento> estabelecimentos = new ArrayList<>();
		estabelecimentos.add(barDoZe);
		estabelecimentos.add(padariaDoCarlos);
		
		ServicoDeAutorizacao servico = new ServicoDeAutorizacao(trabalhadores, estabelecimentos);
		
		Transacao umaTransacao = new Transacao("546574376584372", 1234, 110, "8437583475847");
		
		boolean autorizou = servico.autorizar(umaTransacao);
		
		System.out.println("Transação autorizada? " + autorizou);
	}
}
