package br.edu.alura.ifandelse;

public class Main {
    public static void main(String[] args) {
        String nome = "João";
        double salario = 1200.00;
        int numeroDependentes = 1;
        Boolean isento = true;

        if (salario >= 2000 && !isento) { /* Poderia colocar tanto == false tando ! os dois indicam a mesma coisa*/
            /*OU || (Ou um Ou outro usa || )  -  E && (Combinação das duas &&) */
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor irrf: " + irrf);
        } else if (isento) {
            System.out.println("Contribuinte isento de irrf: "+ "[" + salario + "]");
        } else{
            System.out.println("Não a valores de imposto de irrf");
        }
    }
}
