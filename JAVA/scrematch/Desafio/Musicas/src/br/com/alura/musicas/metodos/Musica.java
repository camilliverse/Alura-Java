package br.com.alura.musicas.metodos;

public class Musica extends Audio {
    private String album;
    private String titulo;
    private String artista;
    private String genero;

    public Musica() {
    }

    public Musica(String album, String titulo, String artista, String genero) {
        this.album = album;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int getClassificao() {
        if(this.getTotalReproducoes()>10){
            return 10;
        }else{
            return 7;
        }
    }
}
