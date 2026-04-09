public class Aluno {
    String nome;
    int idade;

    void exibeInformacoesDoAluno(){
        System.out.println("""
                Nome do aluno: %s
                Idade do aluno: %d
                """.formatted(nome,idade));


    }
}
