package br.com.alura.screematch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title")
                         String titulo, @JsonAlias("TotalSeasons") Integer totalTemporadas ,
                        @JsonAlias("imdbID") String avaliacao
                        ) {

}
