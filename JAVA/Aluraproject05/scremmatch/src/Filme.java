public class Filme {
        String nome;
        int anoDeLancamento;
        boolean incluidoNoPlano;
        double somaDasAvaliacaoes;
        int totalDeAvaliacao;
        int duracaoEmMinuto;

        void exibeFixatecnica (){
                System.out.println("Nome do filme: " + nome);
                System.out.println("Ano de lançamento: " + anoDeLancamento);
                System.out.println("Tempo de duração em MINUTOS: " + duracaoEmMinuto);
        }
        void avalia(double nota){
                somaDasAvaliacaoes += nota;
                totalDeAvaliacao ++;
        }
        double pegaMedia(){
                return somaDasAvaliacaoes / totalDeAvaliacao;
        }
}
