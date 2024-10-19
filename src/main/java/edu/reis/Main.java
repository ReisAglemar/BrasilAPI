package edu.reis;

import com.google.gson.Gson;
import edu.reis.modelo.RespostaAPI;
import edu.reis.modelo.SalvaConsultaPreevisao;
import edu.reis.modelo.UriApiPrevisao;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        UriApiPrevisao uri = new UriApiPrevisao("228", "3");

        HttpClient cliente = HttpClient.newHttpClient();

        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(uri.montaUri()))
                .build();

        HttpResponse<String> reposta = cliente
                .send(requisicao, HttpResponse.BodyHandlers.ofString());

        String json = reposta.body();

        Gson gson = new Gson();
        RespostaAPI respostaAPI = gson.fromJson(json, RespostaAPI.class);

        SalvaConsultaPreevisao consulta = new SalvaConsultaPreevisao(respostaAPI);

        System.out.println("\n");
        consulta.getCidade();
        consulta.getEstado();
        consulta.getDataAtuliazacao();
        consulta.previsaoDias();
    }
}