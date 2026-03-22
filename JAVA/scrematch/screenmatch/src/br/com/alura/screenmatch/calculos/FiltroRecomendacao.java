package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificacao classificacao){
        if (classificacao.getClassificavel() >= 4){
            System.out.println("Está entre os preferidos do momento");
        }else if (classificacao.getClassificavel()>= 2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na lista para ver depois");
        }
    }

}
