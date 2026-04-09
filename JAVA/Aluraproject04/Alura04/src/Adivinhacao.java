import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void Adivinhacao(String[] args){
        System.out.println("--- Adivinhe um numero de 1 a 100 ---");
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while(tentativas < 5){
            System.out.println("Digite um numero entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabens pilantra voce acertou! ");
                break; // interrompe o loop
            }else if(numeroDigitado == numeroGerado){
                System.out.println("Numero menor do que o numero da Adivinhação! Tente novamente");
            }else{
                System.out.println("Numero maior do que o numero da Adivinhação! Tente novamente");
            }
            if(tentativas == 5 && numeroDigitado != numeroGerado){
                System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era:" + numeroGerado);
            }
        }
    }
}
