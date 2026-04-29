package br.edu.alura.poo.lojaInformatica;

public class Loja {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.nome = "Mouse";
        estoque.preco = 20.00;
        estoque.quantidade = 100;

        estoque.dadosFormatatos();
    }
}
