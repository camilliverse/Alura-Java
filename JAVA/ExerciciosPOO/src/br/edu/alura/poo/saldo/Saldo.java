package br.edu.alura.poo.saldo;

public class Saldo {
    public static void main(String[] args) {
        ContaDigital conta = new ContaDigital();
        conta.saldo = 1579.42;

        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
    }
}
