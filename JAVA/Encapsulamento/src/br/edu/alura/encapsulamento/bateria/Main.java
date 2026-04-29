package br.edu.alura.encapsulamento.bateria;

public class Main {
    public static void main(String[] args) {
        Battery b = new Battery();
        b.setNivel(85);
        System.out.println("Status: " + b.exibirStatus());
    }
}
