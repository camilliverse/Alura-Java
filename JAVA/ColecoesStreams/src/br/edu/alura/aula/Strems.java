package br.edu.alura.aula;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Strems {
     public static void main(String[] args) {
         List<String> funcionarios = List.of("Mark","Eve","Oliver","Conquista");

         List<String> funcionariosLetraA = funcionarios.stream().filter(f -> f.startsWith("C"))
                 .collect(Collectors.toList());

         System.out.println(funcionarios);
         System.out.println(funcionariosLetraA);

         List<Double> valoresVendas =List.of(500.0, 680.0, 965.0);
         List<Double> comissao = valoresVendas.stream().map(valor -> valor * 0.05).collect(Collectors.toList());

         System.out.println(valoresVendas);
         System.out.println(comissao);


         double totalVendas = valoresVendas.stream().reduce(0.0, Double::sum); //:: eu escolho o operador matematico
         // que vou usar nesse caso é a soma
         System.out.println("totalVendas: " + totalVendas);

    }
}
