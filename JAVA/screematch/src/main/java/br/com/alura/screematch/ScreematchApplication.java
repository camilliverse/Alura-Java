package br.com.alura.screematch;

import br.com.alura.screematch.model.DadosSerie;
import br.com.alura.screematch.service.ConsumoAPI;
import br.com.alura.screematch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreematchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreematchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var Json = consumoAPI.obterDados("http://www.omdbapi.com/?apikey=465d3944&s=Naruto\n");
		//System.out.println(Json);
		//Json = consumoAPI.obterDados("http://www.omdbapi.com/?apikey=465d3944&s=Jujutsu%20kaisen");
		System.out.println(Json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados  = conversor.obterDados(Json, DadosSerie.class);
		System.out.println(dados);
	}
}
