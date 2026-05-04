package br.edu.alura.biblioteca;

public class Revista extends Midia {
    private int edicao;

    public Revista(String titulo, int anoDePublicacao,  int edicao) {
        super(titulo, anoDePublicacao);
        this.edicao = edicao;
    }

    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Livro: \"" + getTitulo() + "\" - Edicao: " + edicao);
    }
}
