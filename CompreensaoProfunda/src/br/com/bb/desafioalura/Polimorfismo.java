package br.com.bb.desafioalura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Polimorfismo {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");

        System.out.println("ArrayList: " + lista);

        List<String> lista2 = new LinkedList<>();
        lista2.add("Java");
        lista2.add("Python");
        System.out.println("LinkedList: " + lista2);

    }
}
