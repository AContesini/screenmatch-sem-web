package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConverteDados;
import br.com.alura.screenmatch.service.Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var service = new Service();
		var json = service.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=afa3295a");
//		System.out.println(json);

		ConverteDados converteDados = new ConverteDados();
		DadosSerie dadosSerie = converteDados.Obterdados(json,DadosSerie.class);
		System.out.println(dadosSerie);
	}
}
