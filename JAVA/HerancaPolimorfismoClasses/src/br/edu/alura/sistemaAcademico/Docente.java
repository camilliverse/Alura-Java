package br.edu.alura.sistemaAcademico;

public class Docente extends Pessoa {
    protected String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void exibirDados(){
        System.out.println("Docente: " + getNome() + " - Idade: " + getIdade() + " - Disciplina: " + disciplina );
    }

}
