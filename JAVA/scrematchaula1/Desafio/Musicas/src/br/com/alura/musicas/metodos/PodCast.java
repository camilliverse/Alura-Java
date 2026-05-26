package br.com.alura.musicas.metodos;

public class PodCast extends Audio {
    private String host;
    private String descricao;
    private String criador;

    public PodCast() {
    }

    public PodCast(String host, String descricao, String criador) {
        this.host = host;
        this.descricao = descricao;
        this.criador = criador;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCriador(String igao) {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    @Override
    public int getClassificao() {
        if(this.getTotalCurtidas()> 25){
            return 10;
        }else{
            return 7;
        }
    }
}
