package br.edu.alura.encapsulamento.teste;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int controReajuste = 0;


    public Funcionario(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    void exibirInformacoes(){
        System.out.println("\nFuncionario %s - Cargo: %s - Salario: %.2f".formatted(nome, cargo, salario));

    }

    void reajustarInformacoes(double percentual) {
        if (controReajuste >= 1) {
            System.out.print("Não pode fazer reajuste!");
        } else {
            controReajuste++;
            salario += salario * (percentual / 100);
            System.out.println("\nNovo salario de %s é %.2f".formatted(nome, salario));
        }


    }
}
