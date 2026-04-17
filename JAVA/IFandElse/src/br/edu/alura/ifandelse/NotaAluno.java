package br.edu.alura.ifandelse;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextInt();

        if (nota >= 6.0){
            System.out.println("Parabens! Aluno aprovado!");
        } else if (nota <= 6.0) {
            System.out.println("Que Pena! Aluno reprovado!");
        }
    }
}
