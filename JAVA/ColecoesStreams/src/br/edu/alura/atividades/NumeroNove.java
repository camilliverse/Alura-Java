package br.edu.alura.atividades;

import java.util.List;
import java.util.stream.Collectors;

public class NumeroNove {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double totalGasto = precosProdutos.stream().reduce(0.0, Double::sum);

        double imposto = totalGasto * 0.08;
        double totalComImposto = totalGasto + imposto;

        System.out.println("Preço dos produtos: " + precosProdutos);
        System.out.println("Valor total antes do imposto: " + String.format("%.2f", totalGasto));
        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", totalComImposto));
    }
}
