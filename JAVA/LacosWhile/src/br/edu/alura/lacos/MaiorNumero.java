package br.edu.alura.lacos;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite os números separados por espaço: ");
        String linha = input.nextLine();

        String[] partes = linha.split(" ");

        int maior = Integer.parseInt(partes[0]);

        int i = 1;

        while (i < partes.length) {
            int numero = Integer.parseInt(partes[i]);

            if (numero > maior) {
                maior = numero;
            }

            i++;
        }

        System.out.println("O maior número é: " + maior);
    }
}
