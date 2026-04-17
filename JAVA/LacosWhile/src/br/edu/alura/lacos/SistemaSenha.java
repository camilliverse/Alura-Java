package br.edu.alura.lacos;

import java.util.Scanner;

public class SistemaSenha {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int senhaCorreta = 1234;
        int tentativas = 0;
        boolean acessoLiberado = false;

        while (tentativas < 3) {

            System.out.print("Digite sua senha: ");
            int senha = input.nextInt();

            if (senha == senhaCorreta) {
                System.out.println("Senha Correta! Acesso concedido!");
                acessoLiberado = true;
                break;
            } else {
                tentativas++;
                int restantes = 3 - tentativas;

                if (restantes > 0) {
                    System.out.println("Senha incorreta. Você tem " + restantes +
                            " tentativa(s) restante(s).");
                }
            }
        }

        if (!acessoLiberado) {
            System.out.println("Conta bloqueada temporariamente.");
        }
    }
}
