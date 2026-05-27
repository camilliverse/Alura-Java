package com.example.lambdas.atividades.dois;

public class Main {
    public static void main(String[] args) {
        Numero primo  = new Numero() {
            @Override
            public boolean verifica (int num) {
                if(num <= 1){
                    return false;
                }
                for(int i = 2; i < num; i++){
                    if(num % i == 0){
                        return false;
                    }
                }
                return true;
            }
        };

        System.out.println(primo.verifica(5));
        System.out.println(primo.verifica(7));

    }
}
