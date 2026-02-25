import java.util.Scanner;

public class Leitura {
    public static void main(String[] args){
        Scanner Leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = Leitura.nextLine();
        System.out.println("Qual ano de lançamento? ");
        int anoDeLancamento = Leitura.nextInt();
        System.out.println("Qual sua avaliação?");
        double avalicao = Leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avalicao);


    }
}
