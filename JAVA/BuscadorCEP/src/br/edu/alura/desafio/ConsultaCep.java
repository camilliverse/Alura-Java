package br.edu.alura.desafio;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) throws IOException, InterruptedException {

        // remove hífen se o usuário digitar
        cep = cep.replace("-", "");

        // valida formato básico (8 dígitos)
        if (!cep.matches("\\d{8}")) {
            throw new RuntimeException("CEP inválido. Deve conter 8 dígitos.");
        }

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        // valida se veio algo inesperado (não JSON)
        if (!json.startsWith("{")) {
            throw new RuntimeException("Resposta inválida da API.");
        }

        // valida se o CEP não existe
        if (json.contains("\"erro\": true")) {
            throw new RuntimeException("CEP não encontrado.");
        }

        return new Gson().fromJson(json, Endereco.class);
    }
}