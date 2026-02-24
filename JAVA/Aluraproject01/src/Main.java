//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screem Move");
        System.out.println("Filme: Blade Runner 2049");

        int anoDeLancamento = 2017;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Nota do filme: " + notaDoFilme);

        double media = (9.1 + 7.2 + 8.5) / 3;
        System.out.println(media);

        /*Para criar uma String em Java, basta utilizar aspas duplas para delimitar o texto. Por exemplo:
        String nome = "Alura";*/

        /* Nesse exemplo, a variável nome recebe uma String com o texto "Alura".
        É possível concatenar duas ou mais Strings utilizando o operador +, por exemplo:
        String saudacao = "Olá, ";
        String nome = "Alura";
        String mensagem = saudacao + nome + "!";*/

        /* Comparação de Strings

        Em Java, é possível comparar duas Strings utilizando o operador ==. Porém,
         esse operador verifica apenas se as duas variáveis apontam para o mesmo objeto na memória,
        e não se o conteúdo das Strings é igual. Para comparar o conteúdo de duas Strings,
        é necessário utilizar o métodos exemplo:

        String senha = "12345";
        if (senha.equals("12345")) {
        System.out.println("Acesso autorizado!");
        } else {
        System.out.println("Senha incorreta.");
        }*/


        String sinopse = """
                 "Trinta anos após o original, o oficial K (Ryan Gosling), um novo caçador
                 de androides da polícia de Los Angeles, desenterra um segredo há muito tempo oculto
                 que tem o potencial de mergulhar o que resta da sociedade no caos " +
                 ". A descoberta de K o leva a uma busca frenética
                  por Rick Deckard (Harrison Ford), um ex-blade runner que está desaparecido há três décadas";
                """;

        //da pra fazer tanto normal adicionando /n tando dessa forma é chamada de TextBox

        // Esta é uma linha de comentário que será ignorada pelo compilador
        /* Este é um exemplo de comentário
        de várias linhas em Java
        que será ignorado pelo compilador */

        /* formatar textos em Java é utilizando o metodo format() da classe string
        formatar um texto utilizando diversos placeholders, que são representados
        pelo caractere % seguido de uma letra que indica o tipo de dado que será inserido no placeholder.

         Exemplo:

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        Nesse exemplo, os valores das variáveis nome, idade e valor são passados como parâmetros
        para o metodo String.format substituindo os placeholders %s, %d e %.2f

        Segundo exemplo:

        String nome = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

        System.out.println(mensagem);

        Esse exemplo do que foi feito para o String.format também pode ser usado com Text Block. Onde pode se encaixar
        como melhor opição por ser mais legivel*/

        System.out.println(sinopse);

        //int classificacao;
        //classificacao =  media /2; - Modo errado aqui é necessario fazer casting (conversão de tipos)

        int classificacao = (int) media /2;
        System.out.println(classificacao);

        /* O casting implícito é realizado automaticamente pelo compilador quando o tipo de dado de
        origem é compatível com o tipo de dado de destino.Por exemplo, é possível atribuir um valor
        de tipo int a uma variável do tipo double, pois o tipo double é maior e suporta todos os valores
        que o tipo int pode armazenar:

        int x = 10;
        double y = x; // casting implícito

        O casting explícito é realizado quando o tipo de dado de origem é incompatível com o tipo
        de dado de destino. Nesse caso, devemos utilizar o operador de casting para realizar a conversão

        double x = 10.5;
        int y = (int) x; // casting explícito
        */



        }
    }
