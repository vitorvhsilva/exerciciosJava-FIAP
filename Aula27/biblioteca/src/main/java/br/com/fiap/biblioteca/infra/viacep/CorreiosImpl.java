package br.com.fiap.biblioteca.infra.viacep;

import br.com.fiap.biblioteca.dominio.Correios;
import br.com.fiap.biblioteca.dominio.Endereco;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

public class CorreiosImpl implements Correios {

	@Override
	public Endereco obterEndereco(String cep) {
		// montar um cliente http
		OkHttpClient clienteHttp = new OkHttpClient().newBuilder().build();

		// montar uma requisicao
		Request requisicao = new Request.Builder()
				.url("https://viacep.com.br/ws/" + cep + "/json")
				.method("GET", null)
				.build();

		// montar uma resposta
        try {
            Response resposta = clienteHttp.newCall(requisicao).execute();
			ResponseBody body = resposta.body();
			String jsonDeResposta = body.string();

			Gson gson = new Gson();
			Endereco endereco = gson.fromJson(jsonDeResposta, Endereco.class);
			return endereco;

		} catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
