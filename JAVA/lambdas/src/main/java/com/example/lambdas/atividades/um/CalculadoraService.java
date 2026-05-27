package com.example.lambdas.atividades.um;


public class CalculadoraService {
    public static void main(String[] args) {
        Multiplicacao mul = (a, b) -> a * b;
        System.out.println(mul.multiplicacao(5, 5));
    }
}
