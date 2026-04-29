package br.edu.alura.poo.compras;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Teclado";
        p1.preco = 120.0;
        p1.quantidade = 1;

        Produto i2 = new Produto();
        i2.nome = "Mouse";
        i2.preco = 60.0;
        i2.quantidade = 2;

        List<Produto> carrinho = new ArrayList<>();
        carrinho.add(p1);
        carrinho.add(i2);

        double totalCompra = 0;
        for (Produto item : carrinho) {
            totalCompra += item.calcularTotal();
        }

        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
    }
}
