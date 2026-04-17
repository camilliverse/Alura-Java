package br.edu.alura.lacos;

import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;

        while (true) {

            System.out.print("Digite seu nome: ");
            nome = input.nextLine();

            if (nome.length() >= 3) {
                break;
            } else {
                System.out.println("Nome inválido. Digite novamente.");
            }
        }

        System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
    }
}
