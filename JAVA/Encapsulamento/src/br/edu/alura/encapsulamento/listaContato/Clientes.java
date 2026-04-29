package br.edu.alura.encapsulamento.listaContato;

public class Clientes {
    private final String nome;
    private final String telefone;

    public Clientes(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
