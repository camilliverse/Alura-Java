public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("""
                Modelo: %s
                Ano: %d
                Cor: %s
                """.formatted(modelo, ano, cor));
    }
    int calculadora(){
        return 2023 - ano;
    }

}
