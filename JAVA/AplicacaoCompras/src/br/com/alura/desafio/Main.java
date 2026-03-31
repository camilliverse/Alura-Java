package br.com.alura.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main extends Compra {
    public static void main(String[] args) {
        Compra compra = new Compra(System.in);
        List<Compra> compras = new LinkedList<>();

        int saldo = 0;
        System.out.println("Saldo? ");
        System.out.println("\n");
        saldo = compra.nextInt();

        System.out.println("Saldo inicial: R$ " + saldo);

        for(;;){
            System.out.println("\nO que gostaria de fazer?");
            System.out.println("1 - Comprar");
            System.out.println("2 - Listar compras");
            System.out.println("3 - Ver extrato");
            System.out.println("4 - Ordenar compras");
            System.out.println("0 - Sair");

            int opcao = compra.nextInt();
            compra.nextLine(); // ✅ limpa o ENTER (ESSENCIAL)

            if(opcao == 1){
                System.out.println("Produto: ");
                String desc = compra.nextLine(); // agora funciona

                System.out.println("Valor:");
                int valor = compra.nextInt();
                compra.nextLine(); // ✅ limpa de novo

                if(valor > saldo){
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    compras.add(new Compra(desc, valor));
                    System.out.println("Compra realizada!");
                    System.out.println("Restante R$ " + saldo);
                }

            }else if(opcao == 2){
                for(Compra c : compras){
                    System.out.println(c);
                }
            }else if(opcao == 3){
                int total = 0;

                for(Compra c : compras){
                    total += c.getValor();
                }
                System.out.println("R$ " + total);
            }else if(opcao == 4){
                Collections.sort(compras, (a, b) -> Double.compare(a.getValor(), b.getValor()));
                System.out.println("Ordenando compras ");
            }else if(opcao == 0){
                System.out.println("Voce não está mais comprando está ");
                break;
            }else {
                System.out.println("Não existe isso em meu sistema");
            }
        }
        compra.close();
    }
}