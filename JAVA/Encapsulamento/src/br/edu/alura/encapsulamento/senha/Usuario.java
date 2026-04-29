package br.edu.alura.encapsulamento.senha;

public class Usuario {
    private String senha;

    public Usuario(String senhaInicial) {
        this.senha = senhaInicial;
    }

    public void setSenha(String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}