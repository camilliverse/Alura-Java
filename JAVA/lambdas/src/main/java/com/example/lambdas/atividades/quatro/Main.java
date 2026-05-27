package com.example.lambdas.atividades.quatro;

public class Main {
    public static void main(String[] args) {
        Palindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(palindromo.verificarPalindromo("radar"));  // Resultado: true
        System.out.println(palindromo.verificarPalindromo("java"));   // Resultado: false
    }

}
