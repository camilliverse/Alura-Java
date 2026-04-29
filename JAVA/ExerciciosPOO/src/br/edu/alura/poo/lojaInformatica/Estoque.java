package br.edu.alura.poo.lojaInformatica;

public class Estoque {
    String nome;
    double preco;
    int quantidade;

    public void dadosFormatatos(){
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }


}
