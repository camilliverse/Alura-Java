public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDaAvaliacao;
    int numAvaliacoes;

    void exibeFichatecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
    }
    void avalia(double nota){
        somaDaAvaliacao += nota;
        numAvaliacoes ++;
    }
    double pegaMedia(){
        return somaDaAvaliacao / numAvaliacoes;
    }
}
