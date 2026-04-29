package br.edu.alura.poo.estoque;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Papel";
        p1.quantidade = 100;

        p1.vender(5);
        p1.vender(15);
    }
}
