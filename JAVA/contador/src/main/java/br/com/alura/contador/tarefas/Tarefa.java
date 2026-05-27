package br.com.alura.contador.tarefas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    @Override
    public String toString() {
        return "Tarefa{" +
                "Descricao = " + descricao + "\"" + ", Concluida = " +
                ", Pessoa responsavel = " + pessoaResponsavel + "\"" + '}';
    }

}
