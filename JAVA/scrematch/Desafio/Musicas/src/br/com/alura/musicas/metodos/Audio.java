package br.com.alura.musicas.metodos;

public class Audio {
    private String audio;
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificao;

    public Audio() {
    }

    public Audio(String audio, String titulo, int totalReproducoes, int totalCurtidas, int classificao) {
        this.audio = audio;
        this.titulo = titulo;
        this.totalReproducoes = totalReproducoes;
        this.totalCurtidas = totalCurtidas;
        this.classificao = classificao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public int getClassificao() {
        return classificao;
    }

    public void setClassificao(int classificao) {
        this.classificao = classificao;
    }

    public void curti(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalReproducoes++;
    }
}
