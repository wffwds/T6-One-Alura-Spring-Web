package br.com.ffwds.screenmatch;

import br.com.ffwds.screenmatch.model.DadosSerie;
import br.com.ffwds.screenmatch.service.ConsumoAPI;
import br.com.ffwds.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSemWebApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringSemWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?i=tt3896198&apikey=d9496221");
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
