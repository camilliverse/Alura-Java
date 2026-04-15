package br.edu.alura.desafio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {
    public void geraJson(Endereco endereco) throws IOException {
        Gson gson = new  GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter(endereco.cep() + "json");
        fw.write(gson.toJson(endereco));
        fw.close();
    }
}
