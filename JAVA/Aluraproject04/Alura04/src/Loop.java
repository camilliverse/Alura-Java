import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner Leitura = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Qual sua avaliação?");
            nota = Leitura.nextDouble();
            mediaAvalicao += nota;
        }
        System.out.println("Media de avalições " + mediaAvalicao/5);
    }

}
