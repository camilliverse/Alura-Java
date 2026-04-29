package br.edu.alura.poo.multa;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "Dom Casmurro";
        l1.diasAtraso = 5;

        l1.exibirDetalhes();
    }

}
