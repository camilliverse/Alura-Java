package br.edu.alura.lacos;

import java.util.Scanner;

public class Ignorando {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int limite = input.nextInt();

        int numero = 1;

        while (numero <= limite) {

            if (numero % 10 == 5) {
                numero++;
                continue;
            }

            System.out.print(numero + " ");
            numero++;
        }
    }
}
