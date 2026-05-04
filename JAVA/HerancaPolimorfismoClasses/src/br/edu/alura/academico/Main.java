package br.edu.alura.academico;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Bolsista("Bruno");
        Aluno aluno2 = new Aluno("Ricardo");

        aluno.identificaBolsistaouRegular();
        aluno2.identificaBolsistaouRegular();
    }
}
