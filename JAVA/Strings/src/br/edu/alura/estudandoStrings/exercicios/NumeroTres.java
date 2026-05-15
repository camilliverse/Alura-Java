package br.edu.alura.estudandoStrings.exercicios;

import java.util.Scanner;

public class NumeroTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = input.nextLine();

        System.out.print("Digite a palavra a ser subtituida: ");
        String palavraAntiga = input.nextLine();

        if(!texto.contains(palavraAntiga)){
            System.out.println("Palavra não encontrada.");
            input.close();
            return;
        }

        System.out.println("Digite a nova palavra: ");
        String palavraNovo = input.nextLine();

        String motidificado = texto.replace(palavraAntiga, palavraNovo);
        System.out.println("Texto modidicado: " + motidificado);

        input.close();

    }
}
