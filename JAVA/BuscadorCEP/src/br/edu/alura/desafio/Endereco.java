package br.edu.alura.desafio;

public record Endereco(String cep, String logradouro, int numero,
                       String complemento, String bairro, String cidade) {
}
