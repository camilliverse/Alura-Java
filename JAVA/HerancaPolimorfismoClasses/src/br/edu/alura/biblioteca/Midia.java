package br.edu.alura.biblioteca;

public class Midia {
    protected String titulo;
    protected int anoDePublicacao;

    public Midia(String titulo, int anoDePublicacao) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String gerarCodigo() {
        return "LIB-" + titulo.substring(0,3) + anoDePublicacao;
    }
}
