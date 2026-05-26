package br.com.alura.musicas.metodos;

public class MaisCuritdas {

    public void inclui(Audio audio){
        if(audio.getClassificao()>= 9){
            System.out.println(audio.getTitulo() + "Preferido dos ouvintes");
        }else{
            System.out.println(audio.getTitulo() + "Os ouvintes estão curtindo");
        }
    }
}
