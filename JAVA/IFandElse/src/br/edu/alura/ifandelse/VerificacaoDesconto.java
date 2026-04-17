package br.edu.alura.ifandelse;

import java.util.Scanner;

public class VerificacaoDesconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = input.nextDouble();

        if (valorCompra >= 100.0) {
            double desconto =  valorCompra * 0.20;
            double valorDesconto = valorCompra - desconto;
            System.out.println("Desconto: " + desconto);
        }else {
            System.out.println("Desconto não aplicado! \nValor total: R$: " + valorCompra);
        }
    }
}
