package br.edu.alura.atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumeroOito {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        List<Integer> quadrado = numeros.stream().map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println("Quadrados dos números: " + quadrado);

    }
}
