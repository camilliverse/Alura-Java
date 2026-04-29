package br.edu.alura.encapsulamento.oficineMecanica;

public class Carros {
    public static void main(String[] args) {
        Veiculo gol = new Veiculo("Gol", "ABC-1234", 2020);

        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + gol.getModelo());
        System.out.println("Placa: " + gol.getPlaca());
        System.out.println("Ano: " + gol.getAno());
    }
}
