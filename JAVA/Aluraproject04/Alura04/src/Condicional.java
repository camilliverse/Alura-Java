public class Condicional {
    public static void main(String[] args){
        int anoDeLancamento = 2017;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento > 2026){
            System.out.println("Lançamento que os clientes estão curtindo! ");
        }else{
            System.out.println("Filmes antigos que valem a pena assistir! ");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus") ){
            System.out.println("Filme liberado!");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }

}
// || <- essas barras significam ou e && <- siginifica e que e o meu false deveria estar true para meu && funcionar.

/*Uma alternativa ao if/else é o switch case, que é uma estrutura de
controle de fluxo que permite executar diferentes ações com base no valor de uma expressão.
 É uma forma mais simplificada e legível de escrever vários blocos if/else encadeados.

A sintaxe do switch case em Java é a seguinte:

switch (expressão) {
   case valor1:
      // código a ser executado se a expressão for igual a valor1
      break;
   case valor2:
      // código a ser executado se a expressão for igual a valor2
      break;
   case valor3:
      // código a ser executado se a expressão for igual a valor3
      break;
   ...
   default:
      // código a ser executado se a expressão não for igual a nenhum valor
      break;
}

A expressão é uma variável ou uma expressão de código que será avaliada. Cada case é uma possível condição que pode ser atendida pela expressão. Quando a expressão é igual ao valor especificado em um determinado case, o código correspondente a esse case será executado. A palavra-chave break é usada para sair do switch case após a execução do código correspondente.

O case default é opcional e é executado quando nenhum dos cases especificados é atendido.

Veja um exemplo simples de uso do switch case em Java para verificar o dia da semana com base em um número inteiro:

int dia = 3;
String nomeDia;

switch (dia) {
   case 1:
      nomeDia = "domingo";
      break;
   case 2:
      nomeDia = "segunda-feira";
      break;
   case 3:
      nomeDia = "terça-feira";
      break;
   case 4:
      nomeDia = "quarta-feira";
      break;
   case 5:
      nomeDia = "quinta-feira";
      break;
   case 6:
      nomeDia = "sexta-feira";
      break;
   case 7:
      nomeDia = "sábado";
      break;
   default:
      nomeDia = "Dia inválido";
      break;
}

System.out.println("O dia " + dia + " é " + nomeDia);

Nesse exemplo, a expressão é a variável dia, que contém o valor 3. O switch case verifica o valor da variável
dia e executa o código correspondente ao caso em que dia é igual a 3.
O resultado será a impressão no console: "O dia 3 é terça-feira".


*/