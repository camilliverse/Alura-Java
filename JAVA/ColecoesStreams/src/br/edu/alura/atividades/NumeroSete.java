package br.edu.alura.atividades;

import java.util.List;
import java.util.stream.Collectors;

public class NumeroSete {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos",
                "Amanda", "Alice", "Daniel", "Caroline");

        List<String> funcionariosComCincoLetras = funcionarios.stream().filter(f -> f.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(funcionariosComCincoLetras);
    }
}
