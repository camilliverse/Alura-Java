package br.edu.alura.aula;

import java.util.*;

public class Colecoes {
    public static void main(String[] args) {
        List<String> funcionario = new ArrayList<>();
        funcionario.add("camis");
        funcionario.add("isa");
        funcionario.add("gabi");
        funcionario.add("bia");

        Set<String> produto = new HashSet<>();
        produto.add("agua");
        produto.add("coco");
        produto.add("agua");

        System.out.println(produto);

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "mark");
        clientes.put(2, "eve");
        clientes.put(3, "conquista");

        System.out.println(clientes.get(2));

    }
}
