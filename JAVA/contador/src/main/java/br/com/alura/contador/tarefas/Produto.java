package br.com.alura.contador.tarefas;

public class Produto {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
