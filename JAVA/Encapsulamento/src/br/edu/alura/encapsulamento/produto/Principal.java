package br.edu.alura.encapsulamento.produto;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Mouse");
        p1.setPreco(-59.90);

        System.out.printf("Produto: %s\nPreço: %.2f\n", p1.getNome(), p1.getPreco());
    }
}
