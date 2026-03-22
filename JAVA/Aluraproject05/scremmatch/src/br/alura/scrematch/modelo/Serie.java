package br.com.alura.scrematch.modelo;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int epPortemporada;
    private int minutoPorEp;

    public Serie(){

    }

    public Serie(int temporadas, boolean ativa, int epPortemporada, int minutoPorEp) {
        this.temporadas = temporadas;
        this.ativa = ativa;
        this.epPortemporada = epPortemporada;
        this.minutoPorEp = minutoPorEp;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpPortemporada() {
        return epPortemporada;
    }

    public void setEpPortemporada(int epPortemporada) {
        this.epPortemporada = epPortemporada;
    }

    public int getMinutoPorEp() {
        return minutoPorEp;
    }

    public void setMinutoPorEp(int minutoPorEp) {
        this.minutoPorEp = minutoPorEp;
    }

    @Override //serve como um alerta caso eu mexa na minha classe mae
    public int getDuracaoEmMinuto() {
        return temporadas * epPortemporada * minutoPorEp;
    }
}
