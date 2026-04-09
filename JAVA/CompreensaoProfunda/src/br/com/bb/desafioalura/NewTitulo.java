package br.com.bb.desafioalura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NewTitulo {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();
        lista.add("Zelda");
        lista.add("Minecraft");
        lista.add("Valorant");
        System.out.println("Lista normal: " + lista);
        Collections.sort(lista);
        System.out.println("Lista Collections (Ordem alfabetica) : " + lista);


    }
}
