package br.com.alura.praticandovariaveis;

public class Idade {
    public static void main(String[] args) {
        int idade = 19; // Declara a variável antes da verificação
        String mensagem = " "; // Declara a variável antes do bloco condicional

        if(idade < 18){
            mensagem("[ " + idade + " Anos" +" ]"  + " Voce é menor de idade");
        }else {
            System.out.println("[ " + idade + " Anos" +" ]"  + " Voce é maior de idade");
        }
        System.out.println(mensagem); // Agora a variável está acessível
    }

    private static void mensagem(String s) {
    }

}
