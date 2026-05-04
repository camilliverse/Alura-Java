package br.edu.alura.academico;

public class Aluno {
    protected String nome;
    protected String tipo;

    public Aluno(String nome) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void identificaBolsistaouRegular(){
        System.out.println("Aluno" + nome + " - Tipo: " + tipo);
    }
}
