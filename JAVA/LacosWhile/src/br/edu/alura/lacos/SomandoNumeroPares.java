package br.edu.alura.lacos;

import java.util.Scanner;

public class SomandoNumeroPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int limite = input.nextInt();

        int numero = 1;
        int soma = 0;

        while (numero <= limite) {

            if (numero % 2 == 0) {
                soma += numero;
            }

            numero++;
        }

        System.out.println("A soma dos números pares de 1 até " + limite + " é: " + soma);
    }
}

