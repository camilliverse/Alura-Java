package br.edu.alura.lacos;

import java.util.Scanner;

public class Somando {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números deseja somar? ");
        int quantidade = input.nextInt();

        int soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = input.nextInt();
            soma += numero;
        }

        System.out.println("A soma total é: " + soma);
    }
}