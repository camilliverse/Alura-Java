package br.edu.alura.sistemaAcademico;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Julia", 16, 8.5);
        Aluno a2 = new Aluno("Marcos", 16, 4.3);

        Docente d1 = new Docente("Marta", 40, "Matemática");
        Docente d2 = new Docente("Roberto", 38, "História");

        a1.exibirDados();
        a2.exibirDados();

        d1.exibirDados();
        d2.exibirDados();
    }
}
