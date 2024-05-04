package br.com.ffwds.screenmatch;

import br.com.ffwds.screenmatch.model.DadosEpisodio;
import br.com.ffwds.screenmatch.model.DadosSerie;
import br.com.ffwds.screenmatch.model.DadosTemporada;
import br.com.ffwds.screenmatch.principal.Principal;
import br.com.ffwds.screenmatch.service.ConsumoAPI;
import br.com.ffwds.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringSemWebApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringSemWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
