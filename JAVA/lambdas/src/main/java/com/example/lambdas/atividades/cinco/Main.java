package com.example.lambdas.atividades.cinco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros);

        numeros.replaceAll(numero -> numero * 3);
        numeros.add(50);
        numeros.add(60);
        System.out.println(numeros);
    }
}
