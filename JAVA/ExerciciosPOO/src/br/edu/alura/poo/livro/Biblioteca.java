package br.edu.alura.poo.livro;

import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Baltazar";
        livro.autor = "Alura";
        livro.paginas = 80;
        livro.exibirResumo();
    }
}
