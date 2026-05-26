package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.exception.ErroDeConvercaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    //@SerializedName("Title")
    private String nome;
    //@SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOMDB meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year() != null && meuTituloOmdb.year().length() > 4) {
            /*Vi a necessidade de colocar um se for diferente (!=) de null e verifique tamebm meu tituloOmd.year
             * o tamanho e se for maior que 4 */
            throw new ErroDeConvercaoDeAnoException(
                    /*Criei uma validação de erro para um erro especifico*/
                    "Não conseguiu converter o ano porque tem mais de 04 caracteres"
            );
        }

        // VALIDAÇÃO PARA EVITAR NULL OU N/A
        if (meuTituloOmdb.year() != null && !meuTituloOmdb.year().equals("N/A")) {
            this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        } else {
            this.anoDeLancamento = 0;
        }

        // VALIDAÇÃO PARA RUNTIME
        if (meuTituloOmdb.runtime() != null && !meuTituloOmdb.runtime().equals("N/A")) {
            this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
        } else {
            this.duracaoEmMinutos = 0;
        }
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome()); // pegando o nome de cada titulo e comprando entre si
    }

    @Override
    public String toString() {
        return "( nome: " + nome  +
                ", anoDeLancamento: " + anoDeLancamento + ", " + "duração: " +duracaoEmMinutos + " )" ;
    }
}