package com.example.lambdas.atividades.sete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int a = sc.nextInt();
        System.out.print("\n");
        System.out.print("Digite segundo numero: ");
        int b = sc.nextInt();

        Divisao divisao =  (x, y) -> {
            if(x == 0){
                throw new ArithmeticException("ERRO! Não da pra dividir por 0 burra");
            }
            return x / y;
        };
        System.out.println(divisao.divide(a,b));

        sc.close();
    }

}
