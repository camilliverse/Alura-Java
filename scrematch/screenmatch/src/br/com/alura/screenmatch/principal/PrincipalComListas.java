package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Blader Runner ", 2017);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(5);
        var terceiroFilme = new Filme("Homem-Aranha Um novo dia", 2026);
        terceiroFilme.avalia(10);
        var quartoFilme = new Filme("Donzela", 2024);
        Serie TheLastOfUs = new Serie("The last of Us",2000);

        //variavel referencia é algo que usamos para chegar a um objeto
        // para criar tem que ser ultilizado new
        //transformando a forma que eu enxergo
        Filme f1 = terceiroFilme;

        List<Titulo> Lista = new LinkedList<>();
        Lista.add(terceiroFilme);
        Lista.add(meuFilme);
        Lista.add(outroFilme);
        Lista.add(quartoFilme);
        Lista.add(TheLastOfUs);

        for(Titulo item : Lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificavel() > 2) {
               System.out.println("Classificação " + filme.getClassificavel());

            } //se ele for um filme, ai sim vou mostrar a classificação, sem isso
            // minha serie daria erro
        }
        ArrayList<String> buscaPorAtista = new ArrayList<>();
        buscaPorAtista.add("Adam Sandler");
        buscaPorAtista.add("Ryan Gosling");
        buscaPorAtista.add("Antonio banderas");
        System.out.println("Wagner Moura");
        System.out.println("Pedro Pascal");
        System.out.println(buscaPorAtista);

        Collections.sort(buscaPorAtista); //sorts serve para n precisar abrir
        // um collection c = new collection el faz direto | fazendo isso por ordem alfabetica
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorAtista);
        System.out.println("Lista de titulo ordenados");
        Collections.sort(Lista); // so aceita lista de objetos que consegue conversar um com o outro
        System.out.println(Lista);

        Lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); // vai me pedir uma forma de comparação | um comparador alguem que
        // sabe comparar e não um comparavel
        //quando uso :: eu falo para que todo titulo que
        // ele pegue tem que ser o meu ano de lançamento em coparação
        System.out.println("Ordenando por ano: ");
        System.out.println(Lista);
    }

}
