package br.edu.alura.dispositivos;

public class Luz implements Controlavel {
    private boolean ligado = false;

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Luz ligada.");
        } else {
            System.out.println("Luz já está ligada.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Luz desligada.");
        } else {
            System.out.println("Luz já está desligada.");
        }
    }
}