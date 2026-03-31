package br.alura.scrematch.calculo;

import br.alura.scrematch.modelo.Filme;
import br.alura.scrematch.modelo.Serie;
import br.alura.scrematch.modelo.Titulo;


public class CalculadoraDeTempo {
    private int tempoTotal;



    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de" + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinuto();


    }

    //public void inclui(Filme f){
    // tempoTotal += f.getDuracaoEmMinuto();

    //public void inclui(Serie s){
       // tempoTotal += s.getDuracaoEmMinuto();


}


