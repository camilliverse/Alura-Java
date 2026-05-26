package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Blader Runner ", 2017);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie TheLastOfUs = new Serie("The last of Us",2000);

        //TheLastOfUs.setNome("The last of Us");
        //TheLastOfUs.setDuracaoEmMinutos(180);

        TheLastOfUs.exibeFichaTecnica();
        TheLastOfUs.setTemporadas(10);
        TheLastOfUs.setEpisodiosPorTemporada(10);
        TheLastOfUs.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar The Last of US: " + TheLastOfUs.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(TheLastOfUs);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(TheLastOfUs);
        episodio.setTotalVisualizacao(500);
        filtro.filtra(episodio);

        var terceiroFilme = new Filme("Homem-Aranha Um novo dia", 2026); //A variavel var realiza uma inferencia do tipo de declaracao
        terceiroFilme.setDuracaoEmMinutos(180);
        terceiroFilme.avalia(10);

        //Arraylist uma lista
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(terceiroFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista" + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }
}