package com.example.lambdas.atividades.seis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Mark");
        nomes.add("Conquista");
        nomes.add("Eve");
        nomes.add("Omini-Man");

        System.out.println(nomes);

        nomes.sort((a,b) -> a.compareTo(b));
        System.out.println(nomes);

    }
}
