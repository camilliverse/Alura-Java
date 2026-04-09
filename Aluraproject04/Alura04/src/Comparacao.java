import java.util.Scanner;

public class Comparacao {
    public static void main(System[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Agora o outro: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("Numero iguais ");
        } else if (numero1 > numero2) {
            System.out.println("Primeiro numero maior");
        }else {
            System.out.println("Segundo numero maior");
        }

    }
}
