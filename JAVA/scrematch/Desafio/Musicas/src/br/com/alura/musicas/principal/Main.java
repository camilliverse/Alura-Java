package br.com.alura.musicas.principal;

import br.com.alura.musicas.metodos.MaisCuritdas;
import br.com.alura.musicas.metodos.Musica;
import br.com.alura.musicas.metodos.PodCast;

public class Main{
    public static void main(String[] args) {
        Musica music = new Musica();
        music.setTitulo("Artic Monkey");
        music.setArtista("Os caras ");

        for (int i = 0; i <10; i++) {
            music.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            music.curti();
        }

        PodCast pod = new PodCast();
        pod.setTitulo("PodPah");
        pod.setCriador("Igao");

        for (int i = 0; i < 20; i++) {
            pod.reproduz();
        }

        for (int i = 0; i < 25; i++) {
            pod.curti();
        }

        MaisCuritdas curtidas = new MaisCuritdas();
        curtidas.inclui(pod);
        curtidas.inclui(music);
    }
}