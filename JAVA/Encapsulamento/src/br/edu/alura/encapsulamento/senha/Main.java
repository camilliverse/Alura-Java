package br.edu.alura.encapsulamento.senha;

public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario("123456");
        user.setSenha("1234s56", "abc123");
    }
}
