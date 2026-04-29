package br.edu.alura.encapsulamento.teste;

public class Principal {
    public static void main(String[] args) {
    Funcionario f1 = new Funcionario(5000 , "Camilli"  );
        f1.setCargo("Desenvolvedor");

        System.out.println("Funcionario tem o cargo: " +  f1.getCargo());

        f1.exibirInformacoes();
        f1.reajustarInformacoes(10);
        f1.exibirInformacoes();

    }
}
