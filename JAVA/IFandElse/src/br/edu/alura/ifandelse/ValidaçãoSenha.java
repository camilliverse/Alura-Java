package br.edu.alura.ifandelse;

import java.util.Scanner;

public class ValidaçãoSenha {
    public static void main(String[] args) {
        String senhaRegistrada = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        if(senha.equals(senhaRegistrada)){ 
            System.out.println("Senha correta!");
        } else if (senha != senhaRegistrada) {
            System.out.println("Senha incorreta!");
        }
    }
}
