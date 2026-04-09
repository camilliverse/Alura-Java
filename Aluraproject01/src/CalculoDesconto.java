public class CalculoDesconto {
    public static void main (String[] args){
        double precoOriginal = 150.0;
        double percentualDesconto = 30.0;

        double valorDesconto = (percentualDesconto / 100.0)*precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: " + precoOriginal);
        System.out.println("Valor do desconto: " + percentualDesconto);
        System.out.println("Valor do produto final: " + novoPreco);
    }
}
