import java.util.Scanner;

public class ParOuImpar {
    public static void maain(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero interio: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
