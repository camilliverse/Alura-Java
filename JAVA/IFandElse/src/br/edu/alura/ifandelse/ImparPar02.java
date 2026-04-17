package br.edu.alura.ifandelse;

import java.util.Scanner;

public class ImparPar02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero 01: ");
        int numero01 = sc.nextInt();
        System.out.print("Numero 02: ");
        int numero02 = sc.nextInt();

        if (numero01 > numero02) {
            System.out.println("O maior número é " + numero01 + ".");
        } else if (numero01 > numero02) {
            System.out.println("O maior número é " + numero02 + ".");
        } else {
            System.out.println("Os números são iguais.");
        }
        sc.close(); {
        }
    }
}
