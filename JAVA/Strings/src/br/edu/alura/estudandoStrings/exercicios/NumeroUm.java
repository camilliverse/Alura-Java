package br.edu.alura.estudandoStrings.exercicios;

import java.util.Scanner;

public class NumeroUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        String nomeFormatado = nome.trim();
        System.out.println("Nome sem espaços: " + nomeFormatado);
        input.close();
    }
}
