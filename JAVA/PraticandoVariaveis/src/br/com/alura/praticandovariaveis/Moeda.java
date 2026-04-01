package br.com.alura.praticandovariaveis;

public class Moeda {
    public static void main(String[] args) {

        double valorReais = 625.85;
        double taxaDolar = 5.15;

        double valorDoalr = valorReais / taxaDolar;
        System.out.println("R$: " +  valorReais + "\n" + "Taxa Hoje: " + taxaDolar + "\n" +
                "Valor convertido: " + valorDoalr);
    }
}
