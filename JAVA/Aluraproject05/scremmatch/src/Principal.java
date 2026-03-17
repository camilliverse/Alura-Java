import br.com.alura.scrematch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filmePreferido = new Filme();
        filmePreferido.setNome("Blade Runner 2049");
        filmePreferido.setAnoDeLancamento(2017);
        filmePreferido.setDuracaoEmMinuto(163);

        filmePreferido.exibeFixatecnica();
        filmePreferido.avalia(8);
        filmePreferido.avalia(4);
        filmePreferido.avalia(5);
        System.out.println("Total de avaliações: " + filmePreferido.getTotalDeAvaliacao());
        System.out.println(filmePreferido.pegaMedia());
    }
}   