package br.edu.alura.atividade.github;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuário do GitHub: ");
        String username = scanner.nextLine();

        try {
            UsuarioGitHub usuario = buscarUsuario(username);

            System.out.println("DADOS DO USUÁRIO");
            System.out.println("Login: " + usuario.login());
            System.out.println("Nome: " + usuario.name());
            System.out.println("Bio: " + usuario.bio());
            System.out.println("Repositórios públicos: " + usuario.public_repos());

        } catch (ErroConsultaGitHubException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        scanner.close();
    }

    public static UsuarioGitHub buscarUsuario(String username) throws Exception {
        String endereco = "https://api.github.com/users/" + username;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 404) {
            throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
        }

        Gson gson = new Gson();
        return gson.fromJson(response.body(), UsuarioGitHub.class);
    }
}