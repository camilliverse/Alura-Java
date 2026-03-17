package br.com.alura.scrematch.modelo;

public class Filme {
        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaDasAvaliacaoes;
        private int totalDeAvaliacao;
        private int duracaoEmMinuto;


        public String getNome() {
                return nome;
        }

        public int getAnoDeLancamento() {
                return anoDeLancamento;
        }

        public boolean isIncluidoNoPlano() {
                return incluidoNoPlano;
        }

        public int getDuracaoEmMinuto() {
                return duracaoEmMinuto;
        }

        public int getTotalDeAvaliacao(){
                return totalDeAvaliacao;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
                this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
                this.anoDeLancamento = anoDeLancamento;
        }

        public void setDuracaoEmMinuto(int duracaoEmMinuto) {
                this.duracaoEmMinuto = duracaoEmMinuto;
        }

        public void exibeFixatecnica (){
                System.out.println("Nome do filme: " + nome);
                System.out.println("Ano de lançamento: " + anoDeLancamento);
                System.out.println("Tempo de duração em MINUTOS: " + duracaoEmMinuto);
        }
        public void avalia(double nota){
                somaDasAvaliacaoes += nota;
                totalDeAvaliacao ++;
        }
        public double pegaMedia(){
                return somaDasAvaliacaoes / totalDeAvaliacao;
        }
}
