package br.edu.alura.desafio;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConsultaCep consulta = new ConsultaCep();
        System.out.println("Digite seu CEP: ");
        var cep = input.nextLine();

        try {
            Endereco novoEndereco = consulta.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.geraJson(novoEndereco);
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao buscar CEP: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao encontrar CEP: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}