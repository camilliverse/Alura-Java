package br.edu.alura.biblioteca;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("o pequeno principe", 1943, "Antoine de Saint-Exupéry");
        Revista r1 = new Revista("National Geographic", 2023, 245);
        Ebook ebook = new Ebook("Clean Code", 2008, "PDF");

        l1.exibirInfo();
        r1.exibirInfo();
        ebook.exibirInfo();

    }
}
