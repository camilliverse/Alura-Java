package br.edu.alura.atividades;

import java.util.ArrayList;
import java.util.List;

public class Numerotres {
    static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Joana");
        funcionarios.add("Lucas");
        funcionarios.add("Pedro");
        funcionarios.add("Antonio");

        System.out.println("Segundo funcionario: " + funcionarios.get(1));
        System.out.println("Tamanho da lista: " + funcionarios.size());
    }
}
