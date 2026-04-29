package br.edu.alura.encapsulamento.filme;

public class Main {
    public static void main(String[] args) {
        Filme matrix = new Filme("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);

        System.out.printf("Média de avaliações para %s: %.2f\n",
                matrix.getTitulo(), matrix.calcularMedia());
    }
}
