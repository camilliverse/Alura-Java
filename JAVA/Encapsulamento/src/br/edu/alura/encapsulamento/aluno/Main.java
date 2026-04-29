package br.edu.alura.encapsulamento.aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Fernanda");

        aluno.ganharPontos(120);
        aluno.exibirStatus();
    }
}
