package br.com.alura.desafio;

import java.io.InputStream;

public class Compra {
    private String nome;
    private int valor;

    public Compra(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Compra(InputStream in) {
    }

    public Compra() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Compra{" + "nome=" + nome + ", valor=" + valor + '}';
    }

    public int nextInt() {
        return 0;
    }

    public String nextLine() {
        return "( " + " )";
    }

    protected void close() {

    }
}
