package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Episodio  implements Classificacao {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacao;

    public Episodio() {
    }

    public Episodio(int numero, String nome, Serie serie, int totalVisualizacao) {
        this.numero = numero;
        this.nome = nome;
        this.serie = serie;
        this.totalVisualizacao = totalVisualizacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificavel() {
        if (totalVisualizacao > 100 ){
            return 4;
        }else{
            return 2;
        }

    }
}
