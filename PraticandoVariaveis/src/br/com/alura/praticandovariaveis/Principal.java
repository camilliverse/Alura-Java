package br.com.alura.praticandovariaveis;

import java.security.AlgorithmConstraints;

public class Principal {
    public static void main(String[] args) {
        int quantidadePasso = 500; // por ser um tipo primitivoo na mmemoria estária guardando oo valor junto
        double alturaEmMetros = 1.70;
        String nome = "jose";


        int alturaEmCentimetros = (int) (alturaEmMetros + 100); //(int) estou forçando e pedindo para
        // transformar em inteiro inves de fazer com double
        //Primeira opcao
        int alturaEmCentimetros2 = 170;
        alturaEmMetros = alturaEmCentimetros2 / 100;
        System.out.println(alturaEmMetros);
        //Segunda opcao
        int alturaEmCentimetros3 = 170;
        alturaEmMetros = alturaEmCentimetros3 ;
        System.out.println(alturaEmMetros / 100);

        if(quantidadePasso < 100){
            String sugestao = "Sugiro que voce tente aumentar a meta";
            System.out.println(sugestao);
        }





        Paciente jose = new Paciente(); // n está garadno as informações do paciente apenas
        // o endereço de memoria que tem as informaçoes do jose
    }
}
