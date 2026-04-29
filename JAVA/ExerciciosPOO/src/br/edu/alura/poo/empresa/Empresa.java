package br.edu.alura.poo.empresa;

public class Empresa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "rebeca";
        f1.cargo = "Gerente de Projetos";
        f1.salario = 9000;

        Funcionario f2 = new Funcionario();
        f2.nome = "lucia";
        f2.cargo = "Participante do time";
        f2.salario = 5000;

        f1.exibirInformacoes();
        f2.exibirInformacoes();

        f2. reajustarSalario(5);
    }
}
