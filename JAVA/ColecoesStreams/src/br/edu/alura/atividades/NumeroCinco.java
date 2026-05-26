package br.edu.alura.atividades;

import java.util.HashMap;
import java.util.Map;

public class NumeroCinco {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Mil");
        clientes.put(2, "Marcos");
        clientes.put(3, "Eve");

        System.out.println("Segundo clientes é marcos" + clientes.get(2));

    }
}
