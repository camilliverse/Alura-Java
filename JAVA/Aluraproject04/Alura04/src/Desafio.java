import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "Homem-Aranha";
        String tipoConta = "Conta Corrente";
        double saldo = 1200;

        System.out.println("**************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n**************");

      String menu = """
              ---Menu--
              1. Consultar saldos"
              2. Receber valor"
              3. Transferir valor"
              4.Sair
              """;

      Scanner leitura = new Scanner(System.in);

        int opcao = 1;
        while (opcao !=4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1 ){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor que deseja transferir: ");
                double valor = leitura.nextInt();
                if(valor >= saldo){
                    System.out.println("Saldo insuficiente: ");
                }else{
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3 ) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Não vem não, voce sabe que essa opção é invalida");
            }

        }

    }
}
