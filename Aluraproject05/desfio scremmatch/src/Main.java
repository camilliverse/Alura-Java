public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Aluno meuAluno = new Aluno();
        Calculadora calculadora = new Calculadora();
        Musica minhaMusica = new Musica();
        Carro meuCarro = new Carro();


        pessoa.saudacao();

        meuAluno.nome = " \nCamis";
        meuAluno.idade= 20;

        meuAluno.exibeInformacoesDoAluno();

        int resultado = calculadora.dobrarNumero( 10 );
        System.out.println(resultado);


        minhaMusica.titulo = " \n Sereia ";
        minhaMusica.artista = "Agajotta ";
        minhaMusica.anoLancamento = 2022;

        minhaMusica.exibeFichatecnica();

        minhaMusica.avalia(4.6);
        minhaMusica.avalia(8.4);
        minhaMusica.avalia(7.2);


        meuCarro.modelo = "Gol";
        meuCarro.ano = 2023;
        meuCarro.cor = "Preto";

        meuCarro.exibeFichaTecnica();

        System.out.println(" \n Idade do carro " + meuCarro.calculadora() + " anos");


    }
}