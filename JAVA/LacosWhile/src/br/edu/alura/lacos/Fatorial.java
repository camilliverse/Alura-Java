package br.edu.alura.lacos;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        int fatorial = 1;
        int i = numero;

        while (i > 0) {
            fatorial *= i;
            i--;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
