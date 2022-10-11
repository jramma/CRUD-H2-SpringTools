package cat.itacademy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cat.itacademy.entidad.Fruita;
import cat.itacademy.repository.FruitaRepositorio;

@SpringBootApplication
public class CrudH2SpringToolsApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(CrudH2SpringToolsApplication.class, args);
	}
// jdbc:h2:~/test
	@Autowired
	private FruitaRepositorio lista;
	
	@Override
	public void run(String... args) throws Exception {
//		Fruita fruita = new Fruita("Poma",23);
//		Fruita fruita1 = new Fruita("Platan",34);
//		Fruita fruita2 = new Fruita("Taronja",76);
//		lista.save(fruita);
//		lista.save(fruita1);
//		lista.save(fruita2);
	}
	
}
