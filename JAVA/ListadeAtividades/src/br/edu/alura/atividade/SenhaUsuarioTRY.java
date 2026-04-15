package br.edu.alura.atividade;

import java.util.Scanner;

public class SenhaUsuarioTRY {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua senha do gov: ");
        String senha = input.nextLine();
        try {
            validarSenha(senha);
            System.out.println("Senha valida!");
        }catch (IllegalArgumentException  e) {
            System.out.println("ERRO!" + e.getMessage());
        }
        System.out.print("Programa Finalizado!");
    }

    private static void validarSenha(String senha) {
    }
}

