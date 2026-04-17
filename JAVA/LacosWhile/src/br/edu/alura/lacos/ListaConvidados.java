package br.edu.alura.lacos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();

        while (true) {

            System.out.print("Digite o nome do convidado (ou 'ver' " +
                    "para visualizar a lista, 'sair' para terminar): ");
            String nome = input.nextLine();

            // sair do programa
            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado.");
                break;
            }

            // ver lista
            if (nome.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + convidados);
                continue;
            }

            // verificar se já existe (ignorando maiúscula/minúscula)
            boolean existe = false;
            for (String convidado : convidados) {
                if (convidado.equalsIgnoreCase(nome)) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                System.out.println("O nome " + nome + " já está na lista de convidados.");
            } else {
                convidados.add(nome);
                System.out.println(nome + " foi adicionado à lista de convidados.");
            }
        }
    }
}
