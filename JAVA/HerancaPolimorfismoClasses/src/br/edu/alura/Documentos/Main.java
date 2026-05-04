package br.edu.alura.Documentos;

public class Main {
    public static void main(String[] args) {
        Relatorio rel = new Relatorio(
                "Relatório 2025",
                "Tudo funcionando conforme esperado."
        );
        rel.imprimir();
    }
}
