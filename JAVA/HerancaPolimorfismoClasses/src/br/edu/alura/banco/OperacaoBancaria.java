package br.edu.alura.banco;

public abstract class OperacaoBancaria implements AcaoBancaria {
    protected double valor;

    public OperacaoBancaria( double valor) {
        this.valor = valor;
    }

}

class Deposito extends OperacaoBancaria {
    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Depósito de R$%.2f realizado%n", valor);
    }
}

class Saque extends OperacaoBancaria {
    public Saque(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Saque de R$%.2f realizado%n", valor);
    }
}

