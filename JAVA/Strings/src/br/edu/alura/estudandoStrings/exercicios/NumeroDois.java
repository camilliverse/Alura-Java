package br.edu.alura.estudandoStrings.exercicios;

import java.util.Scanner;

public class NumeroDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o texto aqui: ");
        String texto = input.nextLine();

        String textoUp = texto.toUpperCase();
        System.out.println("Texto: " + textoUp);

        String textoDown = texto.toLowerCase();
        System.out.println("Texto: " + textoDown);
        input.close();

    }
}
