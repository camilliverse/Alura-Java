import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args){
        Scanner Leitura = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1 ) {
            System.out.println("Diga sua avaliação sobre o filme ou -1 papra encerrar ");
            nota = Leitura.nextDouble();

            if(nota != -1){
                mediaAvalicao += nota;
                totalDeNotas++;
            }
        }
        System.out.println("Media de avalições " + mediaAvalicao / totalDeNotas);
    }
}
