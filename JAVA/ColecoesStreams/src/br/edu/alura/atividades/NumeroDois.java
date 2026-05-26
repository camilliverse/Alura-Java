package br.edu.alura.atividades;

import java.util.ArrayList;
import java.util.List;

public class NumeroDois {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();
        alunos.add("Joana");
        alunos.add("Lucas");
        alunos.add("Pedro");
        alunos.add("Antonio");

        System.out.println(alunos);
        alunos.remove("Pedro");
        System.out.println(alunos);
    }
}
