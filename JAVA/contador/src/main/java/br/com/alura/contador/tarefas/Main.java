package br.com.alura.contador.tarefas;

import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        try {
            Tarefa tarefa = new Tarefa("Estudar Jackson" , false , "Camis");
            Produto produto = new Produto("Notebook");

            GenericaClass<Produto> avaliacao =
                    new GenericaClass<>(
                            produto,
                            5,
                            "Excelente produto!"
                    );

            Map<String, Object> dados = new HashMap<>();

            dados.put("tarefa", tarefa);
            dados.put("avaliacao", avaliacao);

            ObjectMapper mapper = new ObjectMapper();

            File arquivo = new File("Tarefa.json");

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(arquivo, dados);

            System.out.println(tarefa);
            System.out.println(avaliacao);
            System.out.println("Arquivo json criado com sucesso!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
