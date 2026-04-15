package br.edu.alura.atividade.github;

public class ErroConsultaGitHubException extends RuntimeException {
    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}