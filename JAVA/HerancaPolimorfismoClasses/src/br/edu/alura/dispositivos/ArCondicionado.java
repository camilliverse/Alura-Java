package br.edu.alura.dispositivos;

public class ArCondicionado implements Controlavel {
    private boolean ligado = false;

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Ar-condicionado ligado.");
        } else {
            System.out.println("Ar-condicionado já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Ar-condicionado desligado.");
        } else {
            System.out.println("Ar-condicionado já está desligado.");
        }
    }
}