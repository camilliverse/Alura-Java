package br.com.bb.desafioalura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainList {
    static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        lista.add(100);
        lista.add(250);
        lista.add(53);
        lista.add(114);
        lista.add(855);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
