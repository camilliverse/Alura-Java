package br.edu.alura.poo.empresa;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public void exibirInformacoes(){
        System.out.printf("Funcionario: %s | Cargo: %s | Salario: %.2f%n", nome, cargo, salario);
    }
    public void reajustarSalario(double percentual){
        salario += salario  * (percentual / 100);
        System.out.printf("Novo salario: %.2f%n", salario);
    }

}

