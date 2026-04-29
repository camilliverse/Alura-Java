package br.edu.alura.poo.notas;

public class Notas {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "João Silva";
        aluno.nota1 = 6.5;
        aluno.nota2 = 7.5;

        aluno.mostrarResultado();
    }
}
