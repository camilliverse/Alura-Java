package br.edu.alura.sistemaAcademico;

public class Aluno extends Pessoa {
    protected double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public void exibirDados(){
        System.out.println("Aluno: " + getNome() + " - Idade: " + getIdade() + " - Nota: " + nota);
    }

}
