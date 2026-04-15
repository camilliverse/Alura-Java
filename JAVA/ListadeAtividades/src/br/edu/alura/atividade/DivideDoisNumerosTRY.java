package br.edu.alura.atividade;

import java.util.Scanner;

public class DivideDoisNumerosTRY {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Por favor, Digite um numero: ");
        int numero = input.nextInt();
        System.out.print("Por favor, Digite o segundo numero: ");
        int segundo = input.nextInt();
        try {
            int divisao = numero / segundo;
            System.out.println("Resultado da divisão"+ "[ " + divisao + " ]" );
        }catch (ArithmeticException e) {
            System.out.println("ERRO! NÃO POSSO DIVIDIR POR 0 ISSO NÃO EXISTE!!!");
        }




    }
}
