package br.edu.alura.poo.temperatura;

public class Sensor {
    String local;
    double temperaturaAtual;

    void exibirRelatorio() {
        System.out.println("Sensor no local: " + local);
        System.out.printf("Temperatura: %.1f ºC\n", temperaturaAtual);

        if (temperaturaAtual > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}
