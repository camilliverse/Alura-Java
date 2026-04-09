import br.alura.scrematch.calculo.CalculadoraDeTempo;
import br.alura.scrematch.modelo.Filme;
import br.alura.scrematch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filmePreferido = new Filme();
        filmePreferido.setNome("Blade Runner 2049");
        filmePreferido.setAnoDeLancamento(2017);
        filmePreferido.setDuracaoEmMinuto(163);
        System.out.println("Duração do filme: " + filmePreferido.getDuracaoEmMinuto());

        filmePreferido.exibeFixatecnica();
        filmePreferido.avalia(8);
        filmePreferido.avalia(4);
        filmePreferido.avalia(5);
        System.out.println("Total de avaliações: " + filmePreferido.getTotalDeAvaliacao());
        System.out.println(filmePreferido.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("GOT");
        serie.setAnoDeLancamento(2016);
        serie.exibeFixatecnica();
        serie.setTemporadas(8);
        serie.setEpPortemporada(12);
        serie.setMinutoPorEp(50);
        System.out.println("Duração para maratonar Game of Thornes:  " + serie.getDuracaoEmMinuto());

        Filme filmeOutro = new Filme();
        filmeOutro.setNome("Avatar");
        filmeOutro.setAnoDeLancamento(2023);
        filmeOutro.setDuracaoEmMinuto(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmePreferido);
        calculadora.inclui(filmeOutro);
        System.out.println(calculadora.getTempoTotal());

    }
}   