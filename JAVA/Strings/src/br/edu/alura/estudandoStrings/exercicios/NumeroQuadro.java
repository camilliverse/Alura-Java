package br.edu.alura.estudandoStrings.exercicios;

import java.util.Scanner;

public class NumeroQuadro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = input.nextLine();

        int posicao = nomeArquivo.lastIndexOf('.');
        if(posicao != -1){
            String nomeSemExtensao = nomeArquivo.substring(0, posicao);
            System.out.println("Nome do arquivo sem extensão: " +  nomeSemExtensao);
        }else {
            System.out.println("O arquivo não possui extensão");
        }
        input.close();
    }
}
