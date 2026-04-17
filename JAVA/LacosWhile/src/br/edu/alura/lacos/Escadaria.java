package br.edu.alura.lacos;

import java.util.Scanner;

public class Escadaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantindade de degraus: ");
        int degraus = input.nextInt();

        for (int i = 0; i <= degraus ; i++) {
            System.out.println("Subindo degraus");
        }
        System.out.println("Voce chegou");
    }
}
