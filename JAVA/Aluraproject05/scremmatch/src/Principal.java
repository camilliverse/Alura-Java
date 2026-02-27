public class Principal {
    public static void main(String[] args) {
        Filme filmePreferido = new Filme();
        filmePreferido.nome = "Blade Runner 2049";
        filmePreferido.anoDeLancamento = 2017;
        filmePreferido.duracaoEmMinuto = 163;


        filmePreferido.exibeFixatecnica();
        filmePreferido.avalia(8);
        filmePreferido.avalia(4);
        filmePreferido.avalia(5);
        System.out.println(filmePreferido.somaDasAvaliacaoes);
        System.out.println(filmePreferido.totalDeAvaliacao);
        System.out.println(filmePreferido.pegaMedia());
    }
}   