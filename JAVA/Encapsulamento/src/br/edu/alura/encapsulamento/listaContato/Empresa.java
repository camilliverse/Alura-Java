package br.edu.alura.encapsulamento.listaContato;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        ArrayList<Clientes> listaContato = new ArrayList<>();
        listaContato.add(new Clientes("mark" , "(19) 99995-84125"));
        listaContato.add(new Clientes("mark" , "(19) 99995-84125"));
        listaContato.add(new Clientes("mark" , "(19) 99995-84125"));

        System.out.println("Lista de Clientes: " + listaContato);
        int indice = 1;
        for (Clientes cliente : listaContato) {
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    cliente.getNome(),
                    cliente.getTelefone());
        }



    }
}
