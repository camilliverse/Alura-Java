package br.edu.alura.ifandelse;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero 01: ");
        int numero01 = sc.nextInt();

        if (numero01 % 2 == 0){
            System.out.println("Numero par: " + numero01);
        }else {
            System.out.println("Numero impar: " + numero01);
        }
    }
}
