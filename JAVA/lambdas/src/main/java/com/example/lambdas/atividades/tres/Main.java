package com.example.lambdas.atividades.tres;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();

        Letras capsLook = s -> s.toUpperCase();
        System.out.println(capsLook.transformar(palavra));

        input.close();

    }
}
